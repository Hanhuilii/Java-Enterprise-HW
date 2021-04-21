public class Response {

 private Integer code;

 private String protocol = "HTTP/1.1";

 private String msg;

 private Map<String, String> headers;

 private ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();

 public Response() {

 this.code = HttpCode.STATUS_200.getCode();

 this.msg = HttpCode.STATUS_200.getMsg();

 headers = new HashMap<>();

 headers.put("Content-Type", "text/html;charset=UTF-8");

 headers.put("Server", "cloud http v1.0");

 }

}
