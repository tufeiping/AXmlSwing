package org.arong.axmlswing.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 事件注解，标明事件所属者
 * @author dipoo
 * @since 2015-01-27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE}) 
public @interface EventAnnotation {
	String value();
}
