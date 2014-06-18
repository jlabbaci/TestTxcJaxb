//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2012.04.04 � 10:31:38 PM CST 
//


package tcx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour MultiSportSession_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MultiSportSession_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FirstSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}FirstSport_t"/>
 *         &lt;element name="NextSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}NextSport_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSportSession_t", propOrder = {
    "id",
    "firstSport",
    "nextSport",
    "notes"
})
public class MultiSportSessionT {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar id;
    @XmlElement(name = "FirstSport", required = true)
    protected FirstSportT firstSport;
    @XmlElement(name = "NextSport")
    protected List<NextSportT> nextSport;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setId(XMLGregorianCalendar value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� firstSport.
     * 
     * @return
     *     possible object is
     *     {@link FirstSportT }
     *     
     */
    public FirstSportT getFirstSport() {
        return firstSport;
    }

    /**
     * D�finit la valeur de la propri�t� firstSport.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstSportT }
     *     
     */
    public void setFirstSport(FirstSportT value) {
        this.firstSport = value;
    }

    /**
     * Gets the value of the nextSport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextSport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextSport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextSportT }
     * 
     * 
     */
    public List<NextSportT> getNextSport() {
        if (nextSport == null) {
            nextSport = new ArrayList<NextSportT>();
        }
        return this.nextSport;
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

}
