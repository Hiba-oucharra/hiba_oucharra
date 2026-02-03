
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour virement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="virement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codeDestination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mountant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virement", propOrder = {
    "codeSource",
    "codeDestination",
    "mountant"
})
public class Virement {

    protected int codeSource;
    protected int codeDestination;
    protected double mountant;

    /**
     * Obtient la valeur de la propriété codeSource.
     * 
     */
    public int getCodeSource() {
        return codeSource;
    }

    /**
     * Définit la valeur de la propriété codeSource.
     * 
     */
    public void setCodeSource(int value) {
        this.codeSource = value;
    }

    /**
     * Obtient la valeur de la propriété codeDestination.
     * 
     */
    public int getCodeDestination() {
        return codeDestination;
    }

    /**
     * Définit la valeur de la propriété codeDestination.
     * 
     */
    public void setCodeDestination(int value) {
        this.codeDestination = value;
    }

    /**
     * Obtient la valeur de la propriété mountant.
     * 
     */
    public double getMountant() {
        return mountant;
    }

    /**
     * Définit la valeur de la propriété mountant.
     * 
     */
    public void setMountant(double value) {
        this.mountant = value;
    }

}
