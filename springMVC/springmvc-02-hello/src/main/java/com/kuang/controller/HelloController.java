//package com.kuang.controller;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//
///**
// * @author css
// * @create 2023/5/31
// */
//public class HelloController implements Controller {
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        //ModelAndView 模型和视图
//        ModelAndView mv = new ModelAndView();
//
//        //封装对象，放在ModelAndView中。Model
//        mv.addObject("msg", "HelloSpringMVC!");
//        //封装要跳转的视图，放在ModelAndView中
//        mv.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
//        return mv;
//    }
//
//    public static void main(String[] args) {
//        String a = "20221230/806195367002640437.png";
//        String substring = a.substring(a.lastIndexOf("."));
//        String substring1 = a.substring(0,a.lastIndexOf("."));
//        System.out.println(substring);
//        System.out.println(substring1);
//
//    }
//}
