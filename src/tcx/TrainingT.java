//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2012.04.04 � 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Training_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Training_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuickWorkoutResults" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}QuickWorkout_t" minOccurs="0"/>
 *         &lt;element name="Plan" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Plan_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VirtualPartner" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_t", propOrder = {
    "quickWorkoutResults",
    "plan"
})
public class TrainingT {

    @XmlElement(name = "QuickWorkoutResults")
    protected QuickWorkoutT quickWorkoutResults;
    @XmlElement(name = "Plan")
    protected PlanT plan;
    @XmlAttribute(name = "VirtualPartner", required = true)
    protected boolean virtualPartner;

    /**
     * Obtient la valeur de la propri�t� quickWorkoutResults.
     * 
     * @return
     *     possible object is
     *     {@link QuickWorkoutT }
     *     
     */
    public QuickWorkoutT getQuickWorkoutResults() {
        return quickWorkoutResults;
    }

    /**
     * D�finit la valeur de la propri�t� quickWorkoutResults.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickWorkoutT }
     *     
     */
    public void setQuickWorkoutResults(QuickWorkoutT value) {
        this.quickWorkoutResults = value;
    }

    /**
     * Obtient la valeur de la propri�t� plan.
     * 
     * @return
     *     possible object is
     *     {@link PlanT }
     *     
     */
    public PlanT getPlan() {
        return plan;
    }

    /**
     * D�finit la valeur de la propri�t� plan.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanT }
     *     
     */
    public void setPlan(PlanT value) {
        this.plan = value;
    }

    /**
     * Obtient la valeur de la propri�t� virtualPartner.
     * 
     */
    public boolean isVirtualPartner() {
        return virtualPartner;
    }

    /**
     * D�finit la valeur de la propri�t� virtualPartner.
     * 
     */
    public void setVirtualPartner(boolean value) {
        this.virtualPartner = value;
    }

}
