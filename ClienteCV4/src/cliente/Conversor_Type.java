
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de conversor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="conversor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperatura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversor", propOrder = {
    "nome",
    "temperatura"
})
public class Conversor_Type {

    protected int nome;
    protected int temperatura;

    /**
     * Obtém o valor da propriedade nome.
     * 
     */
    public int getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     */
    public void setNome(int value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade temperatura.
     * 
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * Define o valor da propriedade temperatura.
     * 
     */
    public void setTemperatura(int value) {
        this.temperatura = value;
    }

}
