3.Log in to LoginServlet

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        
        
        String msg="";
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        //获取Session
        HttpSession session=request.getSession();
        
        //参数合法性判断
        if(myMember.getMemberName(username,password)==null)
        {
         msg = "用户名或密码错误，请< a href= >重新登录</ a>";
        }   
        
        else{
            session.setAttribute("userid",myMember.getMemberName(username,password));
            response.setHeader("refresh","2;URL=welcomeServlet");//定时跳转
            String s1="<h3>用户登录成功，两秒后跳转到欢迎页面!</h3><br>";
            String s2="<h3>如果没有跳转，请按< a href='welcomeServlet'>这里</ a></h3>";
            msg = s1+s2;
        }
        out.println(msg);
        out.println("</BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
 }
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }
}
