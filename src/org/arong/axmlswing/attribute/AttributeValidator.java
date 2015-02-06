package org.arong.axmlswing.attribute;

import org.arong.axmlswing.manager.CursorManager;
import org.arong.util.NumberUtil;

/**
 * 属性值验证器
 * @author dipoo
 * @since 2015-01-29
 */
public class AttributeValidator {
	/**
	 * 是否为整数
	 * @param value
	 * @param signless 是否为非负整数
	 */
	public static boolean integer(String value, boolean signless){
		if(signless){
			return NumberUtil.can2Int(value) && Integer.parseInt(value) >= 0;
		}
		return NumberUtil.can2Int(value);
	}
	
	/**
	 * 是否为整数数组
	 * @param tag 分隔符
	 */
	public static boolean intArray(String value, String tag){
		if(isBlank(value))
			return false;
		String[] a = value.split(tag);
		for(int i = 0; i < a.length; i++){
			if(!integer(a[i], true)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 是否为size的格式：60,30
	 */
	public static boolean size(String value){
		if(isBlank(value))
			return false;
		//以逗号分隔
		String[] arr = value.split(",");
		if(arr.length == 2){
			for(String str : arr){
				if(! integer(str.trim(), true))
					return false;
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 是否为bounds的格式：10,10,60,30
	 */
	public static boolean bounds(String value){
		if(isBlank(value))
			return false;
		//以逗号分隔
		String[] arr = value.split(",");
		if(arr.length == 4){
			for(String str : arr){
				if(! integer(str.trim(), true))
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static boolean cursor(String value){
		if(isBlank(value))
			return false;
		if(CursorManager.getCursors().containsKey(value.toUpperCase()))
			return true;
		return false;
	}
	
	public static boolean color(String value){
		if(isBlank(value))
			return false;
		return true;
	}
	
	public static boolean font(String value){
		if(isBlank(value))
			return false;
		//以逗号分隔
		String[] arr = value.split(",");
		if(arr.length == 3){
			for(int i = 0; i < arr.length; i ++){
				if(i == 1){
					if(! integer(arr[i].trim(), true) || Integer.parseInt(arr[i].trim()) > 2)
						return false;
				}
				if(i == 2 && ! integer(arr[i].trim(), true)){
					return false;
				}	
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 对象是否为空
	 */
	public static boolean isBlank(Object value){
		if(value instanceof String){
			return value == null || "".equals(value);
		}
		return value == null;
	}
	
	public static void main(String[] args) {
		System.out.println(font("123, 2, 1"));
	}
}
