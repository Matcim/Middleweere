package co.develhope.Interceptor.Middleware2.ServiceImpl;


import co.develhope.Interceptor.Middleware2.entitites.Mouth;
import co.develhope.Interceptor.Middleware2.services.ServicesInterceptor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ServiceImplementInterceptor implements ServicesInterceptor {

    @Override
    public Mouth readMoth(HttpServletRequest request) {
        Mouth mouth = (Mouth) request.getAttribute("chiamataMouthNumber");
        return mouth;
    }
}
