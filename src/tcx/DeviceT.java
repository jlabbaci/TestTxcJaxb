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


/**
 * Identifies the originating GPS device that tracked a run or
 *                                used to identify the type of device capable of handling
 *                                the data for loading.
 * 
 * <p>Classe Java pour Device_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� unitId.
     * 
     */
    public long getUnitId() {
        return unitId;
    }

    /**
     * D�finit la valeur de la propri�t� unitId.
     * 
     */
    public void setUnitId(long value) {
        this.unitId = value;
    }

    /**
     * Obtient la valeur de la propri�t� productID.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * D�finit la valeur de la propri�t� productID.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Obtient la valeur de la propri�t� version.
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
     * D�finit la valeur de la propri�t� version.
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
