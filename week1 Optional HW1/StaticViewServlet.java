public class StaticViewServlet implements CloudServlet {

 private final static Logger logger = LoggerFactory.getLogger(StaticViewServlet.class);

 private String staticRootPath;

 public static Pattern p = Pattern.compile("^/static/\\S+");

 @Override

 public boolean match(Request request) {

 String path = request.getPath();

 Matcher matcher = p.matcher(path);

 return matcher.matches();

 }

 @Override

 public void init(Request request, Response response) {

 staticRootPath = CloudHttpConfig.getValue("static.resource.path");

 }

 @Override

 public void doService(Request request, Response response) {

 String path = request.getPath();

 String fileRelativePath = path.substring(8);

 String absolutePath = staticRootPath + "/" + fileRelativePath;

 RandomAccessFile randomAccessFile = null;

 try {

 randomAccessFile = new RandomAccessFile(absolutePath, "r");

 FileChannel fileChannel = randomAccessFile.getChannel();

 ByteBuffer htmBuffer = ByteBuffer.allocate((int)fileChannel.size());

 fileChannel.read(htmBuffer);

 htmBuffer.flip();

 byte [] htmByte = new byte[htmBuffer.limit()];

 htmBuffer.get(htmByte);

 response.getOutPutStream().write(htmByte);

 } catch (FileNotFoundException e) {

 throw new ViewNotFoundException();

 } catch (IOException e) {

 logger.error("error_StaticViewServlet_doService 异常", e);

 }

 }

}
