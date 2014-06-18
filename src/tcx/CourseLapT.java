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
 * <p>Classe Java pour CourseLap_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CourseLap_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BeginPosition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Position_t" minOccurs="0"/>
 *         &lt;element name="BeginAltitudeMeters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EndPosition" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Position_t" minOccurs="0"/>
 *         &lt;element name="EndAltitudeMeters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="MaximumHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Cadence" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CadenceValue_t" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseLap_t", propOrder = {
    "totalTimeSeconds",
    "distanceMeters",
    "beginPosition",
    "beginAltitudeMeters",
    "endPosition",
    "endAltitudeMeters",
    "averageHeartRateBpm",
    "maximumHeartRateBpm",
    "intensity",
    "cadence",
    "extensions"
})
public class CourseLapT {

    @XmlElement(name = "TotalTimeSeconds")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters")
    protected double distanceMeters;
    @XmlElement(name = "BeginPosition")
    protected PositionT beginPosition;
    @XmlElement(name = "BeginAltitudeMeters")
    protected Double beginAltitudeMeters;
    @XmlElement(name = "EndPosition")
    protected PositionT endPosition;
    @XmlElement(name = "EndAltitudeMeters")
    protected Double endAltitudeMeters;
    @XmlElement(name = "AverageHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT averageHeartRateBpm;
    @XmlElement(name = "MaximumHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT maximumHeartRateBpm;
    @XmlElement(name = "Intensity", required = true)
    protected IntensityT intensity;
    @XmlElement(name = "Cadence")
    protected Short cadence;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propri�t� totalTimeSeconds.
     * 
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * D�finit la valeur de la propri�t� totalTimeSeconds.
     * 
     */
    public void setTotalTimeSeconds(double value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Obtient la valeur de la propri�t� distanceMeters.
     * 
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * D�finit la valeur de la propri�t� distanceMeters.
     * 
     */
    public void setDistanceMeters(double value) {
        this.distanceMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� beginPosition.
     * 
     * @return
     *     possible object is
     *     {@link PositionT }
     *     
     */
    public PositionT getBeginPosition() {
        return beginPosition;
    }

    /**
     * D�finit la valeur de la propri�t� beginPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionT }
     *     
     */
    public void setBeginPosition(PositionT value) {
        this.beginPosition = value;
    }

    /**
     * Obtient la valeur de la propri�t� beginAltitudeMeters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeginAltitudeMeters() {
        return beginAltitudeMeters;
    }

    /**
     * D�finit la valeur de la propri�t� beginAltitudeMeters.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeginAltitudeMeters(Double value) {
        this.beginAltitudeMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� endPosition.
     * 
     * @return
     *     possible object is
     *     {@link PositionT }
     *     
     */
    public PositionT getEndPosition() {
        return endPosition;
    }

    /**
     * D�finit la valeur de la propri�t� endPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionT }
     *     
     */
    public void setEndPosition(PositionT value) {
        this.endPosition = value;
    }

    /**
     * Obtient la valeur de la propri�t� endAltitudeMeters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndAltitudeMeters() {
        return endAltitudeMeters;
    }

    /**
     * D�finit la valeur de la propri�t� endAltitudeMeters.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndAltitudeMeters(Double value) {
        this.endAltitudeMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� averageHeartRateBpm.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getAverageHeartRateBpm() {
        return averageHeartRateBpm;
    }

    /**
     * D�finit la valeur de la propri�t� averageHeartRateBpm.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setAverageHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.averageHeartRateBpm = value;
    }

    /**
     * Obtient la valeur de la propri�t� maximumHeartRateBpm.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getMaximumHeartRateBpm() {
        return maximumHeartRateBpm;
    }

    /**
     * D�finit la valeur de la propri�t� maximumHeartRateBpm.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setMaximumHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.maximumHeartRateBpm = value;
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
     * Obtient la valeur de la propri�t� cadence.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCadence() {
        return cadence;
    }

    /**
     * D�finit la valeur de la propri�t� cadence.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCadence(Short value) {
        this.cadence = value;
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

}
