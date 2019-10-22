package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springmvc01
 * @description:
 * @author: WangMengWei
 * @create: 2019-10-21 20:27
 **/
@Controller
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    public String handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mav = new ModelAndView("index.jsp");
//        mav.addObject("message", "Hello Spring MVC");
        System.out.println("controller   hello  world");
        return "success";
    }
}
