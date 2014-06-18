//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2012.04.04 à 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour History_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété running.
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
     * Définit la valeur de la propriété running.
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
     * Obtient la valeur de la propriété biking.
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
     * Définit la valeur de la propriété biking.
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
     * Obtient la valeur de la propriété other.
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
     * Définit la valeur de la propriété other.
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
     * Obtient la valeur de la propriété multiSport.
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
     * Définit la valeur de la propriété multiSport.
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
     * Obtient la valeur de la propriété extensions.
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
     * Définit la valeur de la propriété extensions.
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
