//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2012.04.04 � 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Cadence_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� low.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * D�finit la valeur de la propri�t� low.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

    /**
     * Obtient la valeur de la propri�t� high.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * D�finit la valeur de la propri�t� high.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

}
