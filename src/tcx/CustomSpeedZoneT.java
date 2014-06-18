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
 * <p>Classe Java pour CustomSpeedZone_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CustomSpeedZone_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t">
 *       &lt;sequence>
 *         &lt;element name="ViewAs" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedType_t"/>
 *         &lt;element name="LowInMetersPerSecond" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedInMetersPerSecond_t"/>
 *         &lt;element name="HighInMetersPerSecond" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedInMetersPerSecond_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSpeedZone_t", propOrder = {
    "viewAs",
    "lowInMetersPerSecond",
    "highInMetersPerSecond"
})
public class CustomSpeedZoneT
    extends ZoneT
{

    @XmlElement(name = "ViewAs", required = true)
    protected SpeedTypeT viewAs;
    @XmlElement(name = "LowInMetersPerSecond")
    protected double lowInMetersPerSecond;
    @XmlElement(name = "HighInMetersPerSecond")
    protected double highInMetersPerSecond;

    /**
     * Obtient la valeur de la propri�t� viewAs.
     * 
     * @return
     *     possible object is
     *     {@link SpeedTypeT }
     *     
     */
    public SpeedTypeT getViewAs() {
        return viewAs;
    }

    /**
     * D�finit la valeur de la propri�t� viewAs.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedTypeT }
     *     
     */
    public void setViewAs(SpeedTypeT value) {
        this.viewAs = value;
    }

    /**
     * Obtient la valeur de la propri�t� lowInMetersPerSecond.
     * 
     */
    public double getLowInMetersPerSecond() {
        return lowInMetersPerSecond;
    }

    /**
     * D�finit la valeur de la propri�t� lowInMetersPerSecond.
     * 
     */
    public void setLowInMetersPerSecond(double value) {
        this.lowInMetersPerSecond = value;
    }

    /**
     * Obtient la valeur de la propri�t� highInMetersPerSecond.
     * 
     */
    public double getHighInMetersPerSecond() {
        return highInMetersPerSecond;
    }

    /**
     * D�finit la valeur de la propri�t� highInMetersPerSecond.
     * 
     */
    public void setHighInMetersPerSecond(double value) {
        this.highInMetersPerSecond = value;
    }

}
