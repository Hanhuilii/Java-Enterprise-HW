package com.exercises;
 
 
import javax.servlet.http.*;
import java.io.*;
 
public class CookieDelete2 extends HttpServlet{
 
 //处理get请求
 
 public void doGet(HttpServletRequest req,HttpServletResponse res){
  
  
  try {
   
 
   res.setContentType("text/html;charset=gbk");
  
   PrintWriter pw=res.getWriter();
  
   //从客户端得到所有cookie信息
   Cookie [] allCookies=req.getCookies();
  
   int i=0;
   //如果allCookies不为空...
   if(allCookies!=null){
   
    //从中取出cookie
    for(i=0;i<allCookies.length;i++){
    
     //依次取出
     Cookie temp=allCookies[i];
    
     if(temp.getName().equals("color")){
      
      //将该cookie删除
      temp.setMaxAge(0);
      pw.println("删除了color这个cookie");
      break;
      
     }
    }  
   
   } 
  
  }
     catch (Exception ex) {
      
      ex.printStackTrace();
     }
 
 }
}
Result of Remove "cookie" :
The welcome back screen is not displayed
ps
After the deletion, all the previously visited addresses and some auto-filled login passwords of the user will be deleted. 
For example, the user has logged in the forum, the user can set the automatic login after opening the webpage,
but if the Cookie is deleted, the user cannot automatically log in, the Cookie stores these information.
