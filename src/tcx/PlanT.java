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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Plan_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Plan_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}RestrictedToken_t" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TrainingType_t" />
 *       &lt;attribute name="IntervalWorkout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan_t", propOrder = {
    "name",
    "extensions"
})
public class PlanT {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "Type", required = true)
    protected TrainingTypeT type;
    @XmlAttribute(name = "IntervalWorkout", required = true)
    protected boolean intervalWorkout;

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * D�finit la valeur de la propri�t� extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link TrainingTypeT }
     *     
     */
    public TrainingTypeT getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingTypeT }
     *     
     */
    public void setType(TrainingTypeT value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� intervalWorkout.
     * 
     */
    public boolean isIntervalWorkout() {
        return intervalWorkout;
    }

    /**
     * D�finit la valeur de la propri�t� intervalWorkout.
     * 
     */
    public void setIntervalWorkout(boolean value) {
        this.intervalWorkout = value;
    }

}
