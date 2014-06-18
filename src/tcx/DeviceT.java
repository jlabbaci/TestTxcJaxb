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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the originating GPS device that tracked a run or
 *                                used to identify the type of device capable of handling
 *                                the data for loading.
 * 
 * <p>Classe Java pour Device_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Device_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t">
 *       &lt;sequence>
 *         &lt;element name="UnitId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Version" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Version_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device_t", propOrder = {
    "unitId",
    "productID",
    "version"
})
public class DeviceT
    extends AbstractSourceT
{

    @XmlElement(name = "UnitId")
    @XmlSchemaType(name = "unsignedInt")
    protected long unitId;
    @XmlElement(name = "ProductID")
    @XmlSchemaType(name = "unsignedShort")
    protected int productID;
    @XmlElement(name = "Version", required = true)
    protected VersionT version;

    /**
     * Obtient la valeur de la propriété unitId.
     * 
     */
    public long getUnitId() {
        return unitId;
    }

    /**
     * Définit la valeur de la propriété unitId.
     * 
     */
    public void setUnitId(long value) {
        this.unitId = value;
    }

    /**
     * Obtient la valeur de la propriété productID.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Définit la valeur de la propriété productID.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link VersionT }
     *     
     */
    public VersionT getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionT }
     *     
     */
    public void setVersion(VersionT value) {
        this.version = value;
    }

}
