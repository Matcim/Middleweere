package co.develhope.Interceptor.Middleware2.interception;


import co.develhope.Interceptor.Middleware2.entitites.Mouth;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MouthInterception implements HandlerInterceptor {

    public static List<Mouth> mouths =
            (Arrays.asList(new Mouth(1,"john","matteo","alex"),
            new Mouth(2,"gim","riccardo","ben"),
                    new Mouth(3,"benji","riccardo","ben"),
                    new Mouth(4,"brun","luca","carl"),
                    new Mouth(5,"loc","carlo","kim"),
                    new Mouth(6,"black","gerlando","luisa")
            ));


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         String userString = request.getHeader("mouthNumber");
         if (userString == null){
             return true;
         }
         int mouth = Integer.parseInt(userString);
        Optional<Mouth> optionalMouth = mouths.stream().filter(mouth1 -> {
            return mouth1.getMouthNumber() == mouth;
        }).findFirst();
        if (optionalMouth.isPresent()){
            System.out.println("MOUNTH_NUMBER IS PRESENT FOR LIST");
            request.getAttribute("chiamataMouthNumber");
        } else {
            System.out.println("IS EMPTY MOUNTH_NUMBER");
            throw new Exception("IS EMPTY MOUNTH_NUMBER");
        }
        return true;
    }
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("REQUEST URL:: " + request.getRequestURI() + " SENT TO HANDLER :: CURRENT TIME= " + System.currentTimeMillis());
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
