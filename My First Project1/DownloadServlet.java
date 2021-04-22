package com.example.FirstLessonServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "com.example.FirstLessonServlet.DownloadServlet", value = "/com.example.FirstLessonServlet.DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
String name= request.getParameter("name");
String age= request.getParameter("age");
String file= request.getParameter("file");
response.setContentType("text/html;charset=UTF-8");
response.getWriter().write("name"+name+"</br>age:"+age+"</br>file:"+file);
process(request,response);
    }
    private void process(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        }
}
