package com.vanda.platform.saturn.core.engine.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 该注解加载在指定的实体类定义上，表明一个需要生成update方法 属性组<br>
 * 例如：<br>
 * //@buildIndependentUpdateMethods({<br>
 *   method=(params={"alarmStatus","cancelTime"} , description="方法注释信息"),<br>
 *   method=(params={"alarmStatus","doneTime"} , description="方法注释信息")<br>
 * })<br>
 * @author yinwenjie
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface IndependentUpdateMethod {
  /**
   * 指定的属性名，这些属性名一定要存在于当前的类定义中，否则在saturn进行扫描的时候，就会报错
   */
  String[] params();
  /**
   * 该方法的业务性质注释说明
   */
  String description();
}