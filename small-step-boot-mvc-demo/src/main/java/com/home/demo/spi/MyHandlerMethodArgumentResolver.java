package com.home.demo.spi;

import com.home.demo.annotation.MyUserParam;
import com.home.demo.vo.UserVO;
import com.mvc.handler.ModelAndViewContainer;
import com.mvc.handler.argument.HandlerMethodArgumentResolver;
import org.springframework.core.MethodParameter;
import org.springframework.core.convert.ConversionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class MyHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(MyUserParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, HttpServletRequest request,
                                  HttpServletResponse response, ModelAndViewContainer container,
                                  ConversionService conversionService) throws Exception {
        MyUserParam annotation = parameter.getParameterAnnotation(MyUserParam.class);
        String param = request.getParameter(annotation.name());
        String[] split = param.split(",");

        UserVO userVo = new UserVO();
        userVo.setName(split[0]);
        userVo.setAge(Integer.valueOf(split[1]));
        return userVo;
    }


}
