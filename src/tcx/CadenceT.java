//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2012.04.04 à 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Cadence_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Cadence_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t">
 *       &lt;sequence>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cadence_t", propOrder = {
    "low",
    "high"
})
public class CadenceT
    extends TargetT
{

    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "High")
    protected double high;

    /**
     * Obtient la valeur de la propriété low.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * Définit la valeur de la propriété low.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

    /**
     * Obtient la valeur de la propriété high.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * Définit la valeur de la propriété high.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

}
