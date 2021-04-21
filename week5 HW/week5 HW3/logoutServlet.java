Log off LogoutServlet

The LogoutServlet is used to cancel the user information from the session class and invoke the invalidate method
[code implementation]
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class logoutServlet
 */
@WebServlet("/logoutServlet")
public class logoutServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // response.setContentType("text/html;charset=UTF-8");
        // PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
         session.invalidate();
        // response.setHeader("refresh","2;URL=login.html");
        // response.sendRedirect("login.html");
         request.getRequestDispatcher("/index.html").forward(request, response);//服务器端跳转
         /*out.println("<HTML>");
         out.println("  <HEAD><TITLE>注销！</TITLE></HEAD>");
         out.println("<h3>您已成功退出本系统，两秒后跳转到首页！</h3><br>");
         out.println("<h3>如果没有跳转，请按< a href='login.html'>这里</ a></h3>");
         out.println("</BODY>");
         out.println("</HTML>");*/
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }
}
