package com.mvc.view.resolver;

import com.mvc.view.InternalResourceView;
import com.mvc.view.View;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class InternalResourceViewResolver extends UrlBasedViewResolver {

    @Override
    protected View buildView(String viewName) {
        String url = getPrefix() + viewName + getSuffix();
        return new InternalResourceView(url);
    }
}
