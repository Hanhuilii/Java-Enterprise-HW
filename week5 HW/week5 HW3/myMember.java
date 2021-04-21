2. LoginServlet login program
After the application gets the form information on the front end, it makes a judgment on it.


public class myMember {
 public static String[] memberNumber= {"201808010520","201808010522"};
 public static String[] memberName= {"HanHuili","Zhang"};
 public static String[] memberSecret= {"201808010520","201808010522"};
 
 public static String getMemberName(String Number,String Secret)
 {
  for(int i=0;i<4;i++)
  {
   if(memberNumber[i].equals(Number)&&memberSecret[i].equals(Secret))
    return memberName[i];
  }
  return null;
 }
}
