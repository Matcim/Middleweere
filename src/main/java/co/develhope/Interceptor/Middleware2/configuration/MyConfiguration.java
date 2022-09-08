package co.develhope.Interceptor.Middleware2.configuration;


import co.develhope.Interceptor.Middleware2.interception.MouthInterception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyConfiguration implements WebMvcConfigurer {

  @Autowired
    private MouthInterception mouthInterception;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mouthInterception);
    }
}
