package co.develhope.Interceptor.Middleware2.controller;


import co.develhope.Interceptor.Middleware2.ServiceImpl.ServiceImplementInterceptor;
import co.develhope.Interceptor.Middleware2.entitites.Mouth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/mouths")
public class MouthController {

       @Autowired
       private ServiceImplementInterceptor interceptor;

    @GetMapping
    public Mouth getMouth(HttpServletRequest request){
        return interceptor.readMoth(request);
    }
}
