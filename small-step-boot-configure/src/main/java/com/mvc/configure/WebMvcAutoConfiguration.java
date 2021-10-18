package com.mvc.configure;

import com.mvc.annotation.EnableWebMvc;
import com.mvc.config.WebMvcConfigurationSupport;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author GTsung
 * @date 2021/10/18
 */

@Configuration
@ConditionalOnMissingBean(WebMvcConfigurationSupport.class)
@Import({SmartMvcDispatcherServletAutoConfiguration.class, ServletWebServerFactoryAutoConfiguration.class})
public class WebMvcAutoConfiguration {

    @EnableWebMvc
    @EnableConfigurationProperties({WebMvcProperties.class})
    public static class EnableWebMvcAutoConfiguration {
    }
}
