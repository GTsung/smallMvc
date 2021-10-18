package com.home.demo.config;

import com.home.demo.spi.MyHandlerMethodArgumentResolver;
import com.mvc.config.WebMvcConfigurer;
import com.mvc.handler.argument.HandlerMethodArgumentResolver;
import com.mvc.handler.interceptor.InterceptorRegistry;
import com.mvc.handler.returnvalue.HandlerMethodReturnValueHandler;
import com.mvc.view.View;
import com.mvc.view.resolver.ViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;

import java.util.List;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new MyHandlerMethodArgumentResolver());
    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void addDefaultViews(List<View> views) {

    }

    @Override
    public void addViewResolvers(List<ViewResolver> viewResolvers) {

    }
}
