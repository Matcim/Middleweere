package co.develhope.Interceptor.Middleware2.services;


import co.develhope.Interceptor.Middleware2.entitites.Mouth;

import javax.servlet.http.HttpServletRequest;

public interface ServicesInterceptor {


    Mouth readMoth(HttpServletRequest request);
}
