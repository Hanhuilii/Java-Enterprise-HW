package com.example.FirstLessonServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.example.FirstLessonServlet.ProcessingServlet", value = "/com.example.FirstLessonServlet.ProcessingServlet")
public class ProcessingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
String name= request.getParameter("name");
        new String(name.getBytes("ISO8859-1"),"UTF-8");
String age= request.getParameter("age");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        response.addHeader("Content-Type","text/html;charset=UTF-8");
        response.getWriter().write("name:"+name+"age"+age);
        response.getWriter().write("<b>Beer Selection Advice</b><br>");
        String c=request.getParameter("color");
        response.getWriter().write("<br>Got Beer color:"+c);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        new String(name.getBytes("ISO8859-1"),"UTF-8");
        String age= request.getParameter("age");
        response.addHeader("Content-Type","text/html;charset=UTF-8");
        response.getWriter().write("name:"+name+"age"+age);
        response.getWriter().write("<b>Beer Selection Advice</b><br>");
        String color=request.getParameter("color");
response.getWriter().write("<br>Got Beer color:"+color);
    }
}
