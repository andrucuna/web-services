
package helloservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://endpoint.helloservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://endpoint.helloservice/", className = "helloservice.endpoint.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://endpoint.helloservice/", className = "helloservice.endpoint.SayHelloResponse")
    @Action(input = "http://endpoint.helloservice/Hello/sayHelloRequest", output = "http://endpoint.helloservice/Hello/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
