package org.arong.util;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class BeanUtil {
	/**
	 * 实现与BeanUtils.setProperty()类似功能
	 * 
	 * @param obj
	 * @param name
	 * @param values
	 */
	public static void setProperty(Object obj, String name, String[] values) {
		Class<?> clazz = obj.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		String methodName = null;
		String propertyName = null;
		String propertyType = null;
		for (int i = 0; i < methods.length; i++) {
			methodName = methods[i].getName();
			if (methodName.startsWith("set")) {
				propertyName = Introspector.decapitalize(methodName.substring(
						3, methodName.length()));
				if (propertyName.equals(Introspector.decapitalize(name))) {
					propertyType = methods[i].getParameterTypes()[0]
							.getCanonicalName();
					try {
						methods[i].invoke(obj, converter(values, propertyType));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * 将一个String数组进行类型转换<br>
	 * 当数组长度为1时，返回值为非数组
	 * 
	 * @param values
	 *            字符串数组
	 * @param typeName
	 *            类型全限定名
	 * @return
	 */
	private static Object converter(String[] values, String typeName) {
		if (values == null) {
			return null;
		} else if (values.length == 1) {
			String value = values[0];
			if (typeName == null)
				return null;
			else if (typeName.trim().equals("java.lang.String")) {
				return value;
			} else if (typeName.trim().equals("java.lang.Integer")) {
				return NumberUtil.can2Int(value) ? Integer.parseInt(value) : 0;
			} else if (typeName.trim().equals("int")) {
				return NumberUtil.can2Int(value) ? Integer.parseInt(value) : 0;
			} else if (typeName.trim().equals("java.lang.Long")) {
				return Long.parseLong(value);
			} else if (typeName.trim().equals("long")) {
				return Long.parseLong(value);
			} else if (typeName.trim().equals("java.lang.Double")) {
				return Double.parseDouble(value);
			} else if (typeName.trim().equals("double")) {
				return Double.parseDouble(value);
			} else if (typeName.trim().equals("java.lang.Float")) {
				return Float.parseFloat(value);
			} else if (typeName.trim().equals("float")) {
				return Float.parseFloat(value);
			} else if (typeName.trim().equals("java.util.Date")) {
				return String2Date(value);
			} else if (typeName.trim().equals("java.sql.Date")) {
				return new java.sql.Date(String2Date(value).getTime());
			} else if (typeName.trim().equals("java.lang.Boolean")) {
				return "true".equals(value);
			} else if (typeName.trim().equals("boolean")) {
				return "true".equals(value);
			} else
				return null;
		} else {
			if (typeName == null)
				return null;
			else if (typeName.trim().equals("java.lang.String[]")) {
				return values;
			} else if (typeName.trim().equals("java.lang.Integer[]")) {
				return NumberUtil.parseInt(values);
			} else if (typeName.trim().equals("int[]")) {
				return NumberUtil.parseInt(values);
			} else if (typeName.trim().equals("java.lang.Long[]")) {
				Long[] longs = new Long[values.length];
				for (int i = 0; i < values.length; i++) {
					longs[i] = Long.parseLong(values[i]);
				}
				return longs;
			} else if (typeName.trim().equals("long[]")) {
				Long[] longs = new Long[values.length];
				for (int i = 0; i < values.length; i++) {
					longs[i] = Long.parseLong(values[i]);
				}
				return longs;
			} else if (typeName.trim().equals("java.lang.Double[]")) {
				Double[] doubles = new Double[values.length];
				for (int i = 0; i < values.length; i++) {
					doubles[i] = Double.parseDouble(values[i]);
				}
				return doubles;
			} else if (typeName.trim().equals("double[]")) {
				Double[] doubles = new Double[values.length];
				for (int i = 0; i < values.length; i++) {
					doubles[i] = Double.parseDouble(values[i]);
				}
				return doubles;
			} else if (typeName.trim().equals("java.lang.Float[]")) {
				Float[] floats = new Float[values.length];
				for (int i = 0; i < values.length; i++) {
					floats[i] = Float.parseFloat(values[i]);
				}
				return floats;
			} else if (typeName.trim().equals("float[]")) {
				Float[] floats = new Float[values.length];
				for (int i = 0; i < values.length; i++) {
					floats[i] = Float.parseFloat(values[i]);
				}
				return floats;
			} else if (typeName.trim().equals("java.util.Date[]")) {
				Date[] dates = new Date[values.length];
				for (int i = 0; i < values.length; i++) {
					dates[i] = String2Date(values[i]);
				}
				return dates;
			} else if (typeName.trim().equals("java.sql.Date[]")) {
				java.sql.Date[] dates = new java.sql.Date[values.length];
				for (int i = 0; i < values.length; i++) {
					dates[i] = new java.sql.Date(String2Date(values[i])
							.getTime());
				}
				return dates;
			} else if (typeName.trim().equals("java.lang.Boolean[]")) {
				Boolean[] booleans = new Boolean[values.length];
				for (int i = 0; i < values.length; i++) {
					booleans[i] = "true".equals(values[i]);
				}
				return booleans;
			} else if (typeName.trim().equals("boolean[]")) {
				Boolean[] booleans = new Boolean[values.length];
				for (int i = 0; i < values.length; i++) {
					booleans[i] = "true".equals(values[i]);
				}
				return booleans;
			} else
				return null;
		}
	}
	
	/**
	 * 将日期形式的字符串转换为Date
	 * 
	 * @param s
	 * @return
	 */
	private static Date String2Date(String s) {
		Date date = null;
		Locale locale = Locale.CHINA;
		DateFormat format = null;
		if (Pattern.matches("\\d{4}.\\d{1,2}.\\d{1,2}", s)) {
			format = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		} else if (Pattern.matches("\\d{2}.\\d{2}.\\d{2}", s)) {
			format = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
		} else if (Pattern.matches(
				"\\d{4}.\\d{1,2}.\\d{1,2}[ ]\\d{1,2}.\\d{1,2}.\\d{1,2}", s)) {
			format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
					DateFormat.MEDIUM, locale);
		} else {
			format = new SimpleDateFormat("yyyy-MM-dd");
		}
		try {
			date = format.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 讲一个对象的属性赋给另一个对象（相同属性值覆盖）
	 */
	public static void apply(Object src, Object dest) { 
		Map<String, Object> srcMap = new HashMap<String, Object>();
		Field[] srcFields = src.getClass().getDeclaredFields();
		for (Field fd : srcFields) {
			try { 
				fd.setAccessible(true);
				srcMap.put(fd.getName(), fd.get(src)); //获取属性值
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
		
		Method[] methods = dest.getClass().getMethods();
		String propertyName;
		String methodName;
		for(Method method : methods){
			methodName = method.getName();
			//方法有一个参数，并且以set或is开头
			if (method.getParameterTypes().length == 1 && (methodName.startsWith("set") || methodName.startsWith("is"))) {
				propertyName = Introspector.decapitalize(methodName.substring(
						methodName.startsWith("set") ? 3 : 2, methodName.length()));
				//null值忽略
				if (srcMap.get(propertyName) == null) {
					continue; 
				}
				//检测类型是否一致
//				System.out.println(propertyName);
//				System.out.println(method.getParameterTypes()[0].getSimpleName().toLowerCase() + ":" + srcMap.get(propertyName).getClass().getSimpleName().toLowerCase());
				if(method.getParameterTypes()[0].getSimpleName().toLowerCase().equals(srcMap.get(propertyName).getClass().getSimpleName().toLowerCase())){
					try {
//						System.out.println(srcMap.get(propertyName));
						method.invoke(dest, srcMap.get(propertyName));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
