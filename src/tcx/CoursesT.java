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
 * <p>Classe Java pour Courses_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Courses_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseFolder" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CourseFolder_t"/>
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
@XmlType(name = "Courses_t", propOrder = {
    "courseFolder",
    "extensions"
})
public class CoursesT {

    @XmlElement(name = "CourseFolder", required = true)
    protected CourseFolderT courseFolder;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propri�t� courseFolder.
     * 
     * @return
     *     possible object is
     *     {@link CourseFolderT }
     *     
     */
    public CourseFolderT getCourseFolder() {
        return courseFolder;
    }

    /**
     * D�finit la valeur de la propri�t� courseFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseFolderT }
     *     
     */
    public void setCourseFolder(CourseFolderT value) {
        this.courseFolder = value;
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
