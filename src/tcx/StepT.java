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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Step_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Step_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}RestrictedToken_t" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Target" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step_t", propOrder = {
    "name",
    "duration",
    "intensity",
    "target"
})
public class StepT
    extends AbstractStepT
{

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Duration", required = true)
    protected DurationT duration;
    @XmlElement(name = "Intensity", required = true)
    protected IntensityT intensity;
    @XmlElement(name = "Target", required = true)
    protected TargetT target;

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
     * Obtient la valeur de la propri�t� duration.
     * 
     * @return
     *     possible object is
     *     {@link DurationT }
     *     
     */
    public DurationT getDuration() {
        return duration;
    }

    /**
     * D�finit la valeur de la propri�t� duration.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationT }
     *     
     */
    public void setDuration(DurationT value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propri�t� intensity.
     * 
     * @return
     *     possible object is
     *     {@link IntensityT }
     *     
     */
    public IntensityT getIntensity() {
        return intensity;
    }

    /**
     * D�finit la valeur de la propri�t� intensity.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityT }
     *     
     */
    public void setIntensity(IntensityT value) {
        this.intensity = value;
    }

    /**
     * Obtient la valeur de la propri�t� target.
     * 
     * @return
     *     possible object is
     *     {@link TargetT }
     *     
     */
    public TargetT getTarget() {
        return target;
    }

    /**
     * D�finit la valeur de la propri�t� target.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetT }
     *     
     */
    public void setTarget(TargetT value) {
        this.target = value;
    }

}
