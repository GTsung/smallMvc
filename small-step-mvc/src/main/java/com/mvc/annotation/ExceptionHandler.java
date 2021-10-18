package com.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author GTsung
 * @date 2021/10/18
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExceptionHandler {

    Class<? extends Throwable>[] value() default {};
}
