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
 * <p>Classe Java pour History_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="History_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Running" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="Biking" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="Other" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="MultiSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MultiSportFolder_t"/>
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
@XmlType(name = "History_t", propOrder = {
    "running",
    "biking",
    "other",
    "multiSport",
    "extensions"
})
public class HistoryT {

    @XmlElement(name = "Running", required = true)
    protected HistoryFolderT running;
    @XmlElement(name = "Biking", required = true)
    protected HistoryFolderT biking;
    @XmlElement(name = "Other", required = true)
    protected HistoryFolderT other;
    @XmlElement(name = "MultiSport", required = true)
    protected MultiSportFolderT multiSport;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propri�t� running.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getRunning() {
        return running;
    }

    /**
     * D�finit la valeur de la propri�t� running.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setRunning(HistoryFolderT value) {
        this.running = value;
    }

    /**
     * Obtient la valeur de la propri�t� biking.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getBiking() {
        return biking;
    }

    /**
     * D�finit la valeur de la propri�t� biking.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setBiking(HistoryFolderT value) {
        this.biking = value;
    }

    /**
     * Obtient la valeur de la propri�t� other.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getOther() {
        return other;
    }

    /**
     * D�finit la valeur de la propri�t� other.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setOther(HistoryFolderT value) {
        this.other = value;
    }

    /**
     * Obtient la valeur de la propri�t� multiSport.
     * 
     * @return
     *     possible object is
     *     {@link MultiSportFolderT }
     *     
     */
    public MultiSportFolderT getMultiSport() {
        return multiSport;
    }

    /**
     * D�finit la valeur de la propri�t� multiSport.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSportFolderT }
     *     
     */
    public void setMultiSport(MultiSportFolderT value) {
        this.multiSport = value;
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
