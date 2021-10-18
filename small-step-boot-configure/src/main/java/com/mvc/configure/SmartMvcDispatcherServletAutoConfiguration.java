package com.mvc.configure;

import com.mvc.DispatcherServlet;
import com.mvc.configure.servlet.SmartMvcDispatcherServletRegistrationBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@Configuration
@ConditionalOnClass(DispatcherServlet.class)
@EnableConfigurationProperties(WebMvcProperties.class)
public class SmartMvcDispatcherServletAutoConfiguration {

    public static final String DEFAULT_DISPATCHER_SERVLET_BEAN_NAME = "smartMvcDispatcherServlet";

    @Bean
    @ConditionalOnMissingBean(value = DispatcherServlet.class)
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    @ConditionalOnBean(value = DispatcherServlet.class)
    public SmartMvcDispatcherServletRegistrationBean dispatcherServletRegistration(
            DispatcherServlet dispatcherServlet, WebMvcProperties webMvcProperties) {
        SmartMvcDispatcherServletRegistrationBean registration = new SmartMvcDispatcherServletRegistrationBean(dispatcherServlet,
                webMvcProperties.getServlet().getPath());
        registration.setName(DEFAULT_DISPATCHER_SERVLET_BEAN_NAME);
        registration.setLoadOnStartup(webMvcProperties.getServlet().getLoadOnStartup());
        return registration;
    }
}
