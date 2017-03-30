
package services.QuestionClasses;

import services.ArrayList;
import services.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuestionService", targetNamespace = "http://Services/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuestionService {


    /**
     * 
     * @return
     *     returns services.ArrayList
     */
    @WebMethod(operationName = "Select")
    @WebResult(partName = "return")
    @Action(input = "http://Services/QuestionService/SelectRequest", output = "http://Services/QuestionService/SelectResponse")
    public ArrayList select();

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "Delete")
    @Action(input = "http://Services/QuestionService/DeleteRequest", output = "http://Services/QuestionService/DeleteResponse")
    public void delete(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "Add")
    @Action(input = "http://Services/QuestionService/AddRequest", output = "http://Services/QuestionService/AddResponse")
    public void add(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "Update")
    @Action(input = "http://Services/QuestionService/UpdateRequest", output = "http://Services/QuestionService/UpdateResponse")
    public void update(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        int arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2);

}
