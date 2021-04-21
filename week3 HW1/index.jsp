Java Enterprise Week3 Question1:
Output an avatar dynamically in a doGet() method. You may use a thirdparty lib, such as avatar-generator.

•index.jsp

<%@ page import="java.util.*" %> 
   <!DOCTYPE html> 
 <html> 
 <head> 
 <title></title> 
 </head> 
 <body> 
 <h1 align="center">Beer Recommendations JSP</h1> 
 <p> 
   <% 
   List<String> styles = (List<String>) request.getAttribute("styles"); 
 Iterator it = styles.iterator(); 
 while(it.hasNext()){ 
 out.print("<br/>try: "+it.next()); 
 } 
   %> 
   </body> 
 </html> 

