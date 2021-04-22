step2:Write a servlet, load log4j, and save these files to the server directory:

package bootcamp. common. servlet;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
 
public class Log4jInitServlet extends HttpServlet {
 
        @Override
        public void init (ServletConfig config ) throws ServletException {
        String prefix = config. getServletContext ( ). getRealPath ( "/" );
        String file = config. getInitParameter ( "log4j" );
        String filePath = prefix + file;
        Properties props = new Properties ( );
        try {
            FileInputStream istream = new FileInputStream (filePath );
            props. load (istream );
            istream. close ( );
 
            String logFile = prefix + props. getProperty ( "log4j.appender.FILE.File" ); //设置路径
            props. setProperty ( "log4j.appender.FILE.File",logFile );
           
            PropertyConfigurator. configure (props ); //装入log4j配置信息
           
            Logger logger = Logger. getLogger (Log4jInitServlet. class. getName ( ) );     
           
            logger. info ( "创建日志文件：" + props. getProperty ( "log4j.appender.FILE.File" ) );
           
        } catch ( IOException e ) {
            toPrint ( "Could not read configuration file [" + filePath + "]." );
            toPrint ( "Ignoring configuration file [" + filePath + "]." );
        }
        }
       
    public static void toPrint ( String content ) {
        System. out. println (content );
    }
 
