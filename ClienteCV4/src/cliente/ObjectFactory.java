
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConversorResponse_QNAME = new QName("http://control/", "conversorResponse");
    private final static QName _Conversor_QNAME = new QName("http://control/", "conversor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversor_Type }
     * 
     */
    public Conversor_Type createConversor_Type() {
        return new Conversor_Type();
    }

    /**
     * Create an instance of {@link ConversorResponse }
     * 
     */
    public ConversorResponse createConversorResponse() {
        return new ConversorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "conversorResponse")
    public JAXBElement<ConversorResponse> createConversorResponse(ConversorResponse value) {
        return new JAXBElement<ConversorResponse>(_ConversorResponse_QNAME, ConversorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversor_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "conversor")
    public JAXBElement<Conversor_Type> createConversor(Conversor_Type value) {
        return new JAXBElement<Conversor_Type>(_Conversor_QNAME, Conversor_Type.class, null, value);
    }

}
