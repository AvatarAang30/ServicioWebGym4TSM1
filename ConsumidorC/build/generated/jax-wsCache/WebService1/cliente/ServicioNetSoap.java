
package cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioNetSoap", targetNamespace = "http://localhost/ServicioNet")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioNetSoap {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Sumar", action = "http://localhost/ServicioNet/Sumar")
    @WebResult(name = "SumarResult", targetNamespace = "http://localhost/ServicioNet")
    @RequestWrapper(localName = "Sumar", targetNamespace = "http://localhost/ServicioNet", className = "cliente.Sumar")
    @ResponseWrapper(localName = "SumarResponse", targetNamespace = "http://localhost/ServicioNet", className = "cliente.SumarResponse")
    public int sumar(
        @WebParam(name = "a", targetNamespace = "http://localhost/ServicioNet")
        int a,
        @WebParam(name = "b", targetNamespace = "http://localhost/ServicioNet")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Restar", action = "http://localhost/ServicioNet/Restar")
    @WebResult(name = "RestarResult", targetNamespace = "http://localhost/ServicioNet")
    @RequestWrapper(localName = "Restar", targetNamespace = "http://localhost/ServicioNet", className = "cliente.Restar")
    @ResponseWrapper(localName = "RestarResponse", targetNamespace = "http://localhost/ServicioNet", className = "cliente.RestarResponse")
    public int restar(
        @WebParam(name = "A", targetNamespace = "http://localhost/ServicioNet")
        int a,
        @WebParam(name = "B", targetNamespace = "http://localhost/ServicioNet")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Multiplicar", action = "http://localhost/ServicioNet/Multiplicar")
    @WebResult(name = "MultiplicarResult", targetNamespace = "http://localhost/ServicioNet")
    @RequestWrapper(localName = "Multiplicar", targetNamespace = "http://localhost/ServicioNet", className = "cliente.Multiplicar")
    @ResponseWrapper(localName = "MultiplicarResponse", targetNamespace = "http://localhost/ServicioNet", className = "cliente.MultiplicarResponse")
    public int multiplicar(
        @WebParam(name = "A", targetNamespace = "http://localhost/ServicioNet")
        int a,
        @WebParam(name = "B", targetNamespace = "http://localhost/ServicioNet")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Dividir", action = "http://localhost/ServicioNet/Dividir")
    @WebResult(name = "DividirResult", targetNamespace = "http://localhost/ServicioNet")
    @RequestWrapper(localName = "Dividir", targetNamespace = "http://localhost/ServicioNet", className = "cliente.Dividir")
    @ResponseWrapper(localName = "DividirResponse", targetNamespace = "http://localhost/ServicioNet", className = "cliente.DividirResponse")
    public int dividir(
        @WebParam(name = "A", targetNamespace = "http://localhost/ServicioNet")
        int a,
        @WebParam(name = "B", targetNamespace = "http://localhost/ServicioNet")
        int b);

}
