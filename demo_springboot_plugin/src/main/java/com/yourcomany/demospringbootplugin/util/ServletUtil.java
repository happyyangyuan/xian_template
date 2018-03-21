package com.yourcomany.demospringbootplugin.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * servlet工具类
 * Created by happyyangyuan at 2018/2/2
 */
public class ServletUtil {
    public static String httpRequestToString(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder().append(request.getMethod()).append(" ").append(request.getRequestURI()).append("\n");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            Enumeration<String> headerValuesEnumeration = request.getHeaders(headerName);
            while (headerValuesEnumeration.hasMoreElements()) {
                sb.append("[header] ").append(headerName).append(" : ").append("\t").append(headerValuesEnumeration.nextElement()).append("\n");
            }
        }
        sb.append(request.getQueryString()).append("\n");
        return sb.toString();
    }
}
