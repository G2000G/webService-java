
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "conversor", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversor", namespace = "http://control/", propOrder = {
    "nome",
    "temperatura"
})
public class Conversor {

    @XmlElement(name = "nome", namespace = "")
    private int nome;
    @XmlElement(name = "temperatura", namespace = "")
    private int temperatura;

    /**
     * 
     * @return
     *     returns int
     */
    public int getNome() {
        return this.nome;
    }

    /**
     * 
     * @param nome
     *     the value for the nome property
     */
    public void setNome(int nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getTemperatura() {
        return this.temperatura;
    }

    /**
     * 
     * @param temperatura
     *     the value for the temperatura property
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

}
