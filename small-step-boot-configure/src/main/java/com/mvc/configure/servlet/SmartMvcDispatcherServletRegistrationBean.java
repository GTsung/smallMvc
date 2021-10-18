package com.mvc.configure.servlet;

import com.mvc.DispatcherServlet;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.util.Assert;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class SmartMvcDispatcherServletRegistrationBean extends ServletRegistrationBean<DispatcherServlet>
        implements DispatcherServletPath {

    private final String path;

    public SmartMvcDispatcherServletRegistrationBean(DispatcherServlet servlet, String path) {
        super(servlet);
        Assert.notNull(path, "Path must not be null");
        this.path = path;
        super.addUrlMappings(getServletUrlMapping());
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
