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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour CoursePoint_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CoursePoint_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CoursePointName_t"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Position" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Position_t"/>
 *         &lt;element name="AltitudeMeters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PointType" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CoursePointType_t"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CoursePoint_t", propOrder = {
    "name",
    "time",
    "position",
    "altitudeMeters",
    "pointType",
    "notes",
    "extensions"
})
public class CoursePointT {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Position", required = true)
    protected PositionT position;
    @XmlElement(name = "AltitudeMeters")
    protected Double altitudeMeters;
    @XmlElement(name = "PointType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pointType;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

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
     * Obtient la valeur de la propri�t� time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * D�finit la valeur de la propri�t� time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Obtient la valeur de la propri�t� position.
     * 
     * @return
     *     possible object is
     *     {@link PositionT }
     *     
     */
    public PositionT getPosition() {
        return position;
    }

    /**
     * D�finit la valeur de la propri�t� position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionT }
     *     
     */
    public void setPosition(PositionT value) {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propri�t� altitudeMeters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltitudeMeters() {
        return altitudeMeters;
    }

    /**
     * D�finit la valeur de la propri�t� altitudeMeters.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltitudeMeters(Double value) {
        this.altitudeMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� pointType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointType() {
        return pointType;
    }

    /**
     * D�finit la valeur de la propri�t� pointType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointType(String value) {
        this.pointType = value;
    }

    /**
     * Obtient la valeur de la propri�t� notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * D�finit la valeur de la propri�t� notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
