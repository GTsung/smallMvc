package com.mvc.handler.mapping;

import com.mvc.annotation.RequestMapping;
import com.mvc.http.RequestMethod;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class RequestMappingInfo {

    private String path;
    private RequestMethod httpMethod;

    public RequestMappingInfo(String prefix, RequestMapping requestMapping) {
        this.path = prefix + requestMapping.path();
        this.httpMethod = requestMapping.method();
    }

    public String getPath() {
        return path;
    }

    public RequestMethod getHttpMethod() {
        return httpMethod;
    }

}
