package com.mvc.view.resolver;

import com.mvc.view.View;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public interface ViewResolver {
    View resolveViewName(String viewName) throws Exception;
}
