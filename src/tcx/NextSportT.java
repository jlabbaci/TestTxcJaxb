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
 * <p>Classe Java pour NextSport_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NextSport_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Activity_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextSport_t", propOrder = {
    "transition",
    "activity"
})
public class NextSportT {

    @XmlElement(name = "Transition")
    protected ActivityLapT transition;
    @XmlElement(name = "Activity", required = true)
    protected ActivityT activity;

    /**
     * Obtient la valeur de la propri�t� transition.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLapT }
     *     
     */
    public ActivityLapT getTransition() {
        return transition;
    }

    /**
     * D�finit la valeur de la propri�t� transition.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLapT }
     *     
     */
    public void setTransition(ActivityLapT value) {
        this.transition = value;
    }

    /**
     * Obtient la valeur de la propri�t� activity.
     * 
     * @return
     *     possible object is
     *     {@link ActivityT }
     *     
     */
    public ActivityT getActivity() {
        return activity;
    }

    /**
     * D�finit la valeur de la propri�t� activity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityT }
     *     
     */
    public void setActivity(ActivityT value) {
        this.activity = value;
    }

}
