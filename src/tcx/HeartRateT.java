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
 * <p>Classe Java pour HeartRate_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeartRate_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t">
 *       &lt;sequence>
 *         &lt;element name="HeartRateZone" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartRate_t", propOrder = {
    "heartRateZone"
})
public class HeartRateT
    extends TargetT
{

    @XmlElement(name = "HeartRateZone", required = true)
    protected ZoneT heartRateZone;

    /**
     * Obtient la valeur de la propri�t� heartRateZone.
     * 
     * @return
     *     possible object is
     *     {@link ZoneT }
     *     
     */
    public ZoneT getHeartRateZone() {
        return heartRateZone;
    }

    /**
     * D�finit la valeur de la propri�t� heartRateZone.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneT }
     *     
     */
    public void setHeartRateZone(ZoneT value) {
        this.heartRateZone = value;
    }

}
