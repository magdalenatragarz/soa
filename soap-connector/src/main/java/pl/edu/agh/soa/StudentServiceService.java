package pl.edu.agh.soa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-03-26T08:47:27.521+01:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "StudentServiceService",
                  wsdlLocation = "http://localhost:8080/soap-api/StudentService?wsdl",
                  targetNamespace = "http://soa.agh.edu.pl/")
public class StudentServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soa.agh.edu.pl/", "StudentServiceService");
    public final static QName StudentServicePort = new QName("http://soa.agh.edu.pl/", "StudentServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/soap-api/StudentService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/soap-api/StudentService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StudentServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StudentServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StudentServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort() {
        return super.getPort(StudentServicePort, StudentService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort(WebServiceFeature... features) {
        return super.getPort(StudentServicePort, StudentService.class, features);
    }

}
