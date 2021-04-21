public class Request {

 /**
 * method
 */

 private String method;

 /**
 * http协议版本
 */

 private String httpVersion;

 /**
 * 请求uri
 */

 private String uri;

 /**
 * 请求相对路径
 */

 private String path;

 /**
 * 请求头信息
 */

 private Map<String, String> headers;

 /**
 * 请求参数
 */

 private Map<String, String> attribute;

}
