import java.io.IOException;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.http.Cookie;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
      
    //删除cookie  
    public class DeleteCookie extends HttpServlet {  
      
        public void doGet(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
            Cookie cookie = new Cookie("lastAccessTime",System.currentTimeMillis()+"");  
            cookie.setMaxAge(0);  
            cookie.setPath("/path");//删除由指定Servlet产生的Cookie文件  
              
            response.addCookie(cookie);  
              
        }  
      
        public void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
            doGet(request, response);  
        }  
      
    }  
