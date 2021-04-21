package com.example.demoafc; 
   import javax.servlet.*; 
 import javax.servlet.annotation.WebServlet; 
 import javax.servlet.http.*; 
 import java.io.*; 
 @WebServlet(name="BeerSelect",value="/SelectBeer.do" ) 
 public class BeerSelect extends HttpServlet { 
 public void doPost(HttpServletRequest request,HttpServletResponse response) 
 throws IOException,ServletException{ 
 response.setContentType("text/html");//返回类型 
 PrintWriter out = response.getWriter(); 
 out.println(); 
 Beer Beerclass = new Beer(); 
 out.println("<b>Beer Selection Advice</b><br>"); 
 String c = request.getParameter("color"); 
 String a; 
 a = request.getParameter("username"); 
 Beerclass.setColor(c); 
 out.println("<br>Got beer color: "+c+"<br>"); 
 out.println(Beerclass.toString()); 
 out.println(a); 
 } 
   } 
