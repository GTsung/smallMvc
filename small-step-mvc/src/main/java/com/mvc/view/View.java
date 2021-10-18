package com.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public interface View {

    default String getContentType() {
        return null;
    }

    void render(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
