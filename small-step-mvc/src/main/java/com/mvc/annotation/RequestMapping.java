package com.mvc.annotation;

import com.mvc.http.RequestMethod;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequestMapping {

    String path();

    RequestMethod method() default RequestMethod.GET;

}
