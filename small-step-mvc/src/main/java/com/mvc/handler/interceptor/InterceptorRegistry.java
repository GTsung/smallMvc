package com.mvc.handler.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class InterceptorRegistry {

    private List<MappedInterceptor> mappedInterceptors = new ArrayList<>();

    /**
     * 注册一个拦截器到Registry
     * @param interceptor
     * @return
     */
    public MappedInterceptor addInterceptor(HandlerInterceptor interceptor) {
        MappedInterceptor mappedInterceptor = new MappedInterceptor(interceptor);
        mappedInterceptors.add(mappedInterceptor);
        return mappedInterceptor;
    }

    public List<MappedInterceptor> getMappedInterceptors() {
        return mappedInterceptors;
    }

}