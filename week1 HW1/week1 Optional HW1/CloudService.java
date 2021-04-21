public class CloudService {

 private List
 cloudServlets = new ArrayList<>();

 public CloudService() {

 cloudServlets.add(new StaticViewServlet());

 cloudServlets.add(new MappingUrlServlet());

 }

 public void doService(Request request, Response response) {

 CloudServlet servlet = doSelect(request);

 servlet.init(request, response);

 servlet.doService(request, response);

 }

 private CloudServlet doSelect(Request request) {

 for (CloudServlet cloudServlet : cloudServlets) {

 if (cloudServlet.match(request)) {

 return cloudServlet;

 }

 }

 return new MappingUrlServlet();

 }

}
