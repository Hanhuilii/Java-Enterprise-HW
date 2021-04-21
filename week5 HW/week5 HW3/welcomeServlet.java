
4. Create the welcome page  "welcomeServlet"
[code implementation]

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class welcomeServlet
 */
@WebServlet("/welcomeServlet")
public class welcomeServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>欢迎！</TITLE></HEAD>");
        out.println("  <BODY>");
        
        //session中找到用户
        if(session.getAttribute("userid")!=null) 
         out.println("<h3>欢迎"+session.getAttribute("userid")+"光临本系统,< a href=' '>注销</ a>!</h3>");
       
        //session中没有找到用户
        else{
         
            request.getRequestDispatcher("index.html").forward(request,response);
        }
       
        out.println("</BODY>");
        out.println("</HTML>");
 }
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }
}
