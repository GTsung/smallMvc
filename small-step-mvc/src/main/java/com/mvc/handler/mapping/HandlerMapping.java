package com.mvc.handler.mapping;

import com.mvc.handler.HandlerExecutionChain;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public interface HandlerMapping {


    HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception;

}
