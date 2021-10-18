package com.mvc.handler.exception;

import com.mvc.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HandlerExceptionResolver {


    ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Exception ex);
}
