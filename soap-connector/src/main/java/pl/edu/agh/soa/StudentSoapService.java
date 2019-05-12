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
 * 2019-05-09T12:31:28.426+02:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "StudentSoapService",
                  wsdlLocation = "http://localhost:8080/soap-api/StudentSoap?wsdl",
                  targetNamespace = "http://soa.agh.edu.pl/")
public class StudentSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soa.agh.edu.pl/", "StudentSoapService");
    public final static QName StudentSoapPort = new QName("http://soa.agh.edu.pl/", "StudentSoapPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/soap-api/StudentSoap?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentSoapService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/soap-api/StudentSoap?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StudentSoapService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StudentSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StudentSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns StudentSoap
     */
    @WebEndpoint(name = "StudentSoapPort")
    public StudentSoap getStudentSoapPort() {
        return super.getPort(StudentSoapPort, StudentSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentSoap
     */
    @WebEndpoint(name = "StudentSoapPort")
    public StudentSoap getStudentSoapPort(WebServiceFeature... features) {
        return super.getPort(StudentSoapPort, StudentSoap.class, features);
    }

}