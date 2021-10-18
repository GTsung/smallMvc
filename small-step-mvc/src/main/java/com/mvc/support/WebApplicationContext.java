package com.mvc.support;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public interface WebApplicationContext extends ApplicationContext {

    String ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE = WebApplicationContext.class.getName() + ".ROOT";

    ServletContext getServletContext();
}
