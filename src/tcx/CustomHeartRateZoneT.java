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
 * <p>Classe Java pour CustomHeartRateZone_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CustomHeartRateZone_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t">
 *       &lt;sequence>
 *         &lt;element name="Low" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateValue_t"/>
 *         &lt;element name="High" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateValue_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomHeartRateZone_t", propOrder = {
    "low",
    "high"
})
public class CustomHeartRateZoneT
    extends ZoneT
{

    @XmlElement(name = "Low", required = true)
    protected HeartRateValueT low;
    @XmlElement(name = "High", required = true)
    protected HeartRateValueT high;

    /**
     * Obtient la valeur de la propri�t� low.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateValueT }
     *     
     */
    public HeartRateValueT getLow() {
        return low;
    }

    /**
     * D�finit la valeur de la propri�t� low.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateValueT }
     *     
     */
    public void setLow(HeartRateValueT value) {
        this.low = value;
    }

    /**
     * Obtient la valeur de la propri�t� high.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateValueT }
     *     
     */
    public HeartRateValueT getHigh() {
        return high;
    }

    /**
     * D�finit la valeur de la propri�t� high.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateValueT }
     *     
     */
    public void setHigh(HeartRateValueT value) {
        this.high = value;
    }

}
