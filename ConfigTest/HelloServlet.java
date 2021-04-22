package com.example.ConfigTest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("test");
        java.util.Enumeration e=getServletConfig().getInitParameterNames();
        out.println("<br>param name="+e.nextElement()+"<br>");
        out.println("main email is"+getServletConfig().getInitParameter("mainEmail"));
        out.println("admin email is"+getServletConfig().getInitParameter("adminEmail"));
        // Hello

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

