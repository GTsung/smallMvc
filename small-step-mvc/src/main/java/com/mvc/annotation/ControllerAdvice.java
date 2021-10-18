package com.mvc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ControllerAdvice {
}
