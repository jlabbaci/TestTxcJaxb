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
 * <p>Classe Java pour Version_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Version_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersionMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="VersionMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BuildMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="BuildMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version_t", propOrder = {
    "versionMajor",
    "versionMinor",
    "buildMajor",
    "buildMinor"
})
public class VersionT {

    @XmlElement(name = "VersionMajor")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMajor;
    @XmlElement(name = "VersionMinor")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMinor;
    @XmlElement(name = "BuildMajor")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMajor;
    @XmlElement(name = "BuildMinor")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMinor;

    /**
     * Obtient la valeur de la propri�t� versionMajor.
     * 
     */
    public int getVersionMajor() {
        return versionMajor;
    }

    /**
     * D�finit la valeur de la propri�t� versionMajor.
     * 
     */
    public void setVersionMajor(int value) {
        this.versionMajor = value;
    }

    /**
     * Obtient la valeur de la propri�t� versionMinor.
     * 
     */
    public int getVersionMinor() {
        return versionMinor;
    }

    /**
     * D�finit la valeur de la propri�t� versionMinor.
     * 
     */
    public void setVersionMinor(int value) {
        this.versionMinor = value;
    }

    /**
     * Obtient la valeur de la propri�t� buildMajor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMajor() {
        return buildMajor;
    }

    /**
     * D�finit la valeur de la propri�t� buildMajor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMajor(Integer value) {
        this.buildMajor = value;
    }

    /**
     * Obtient la valeur de la propri�t� buildMinor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMinor() {
        return buildMinor;
    }

    /**
     * D�finit la valeur de la propri�t� buildMinor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMinor(Integer value) {
        this.buildMinor = value;
    }

}
