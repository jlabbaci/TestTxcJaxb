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
 * <p>Classe Java pour TrainingCenterDatabase_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrainingCenterDatabase_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Folders_t" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityList_t" minOccurs="0"/>
 *         &lt;element name="Workouts" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutList_t" minOccurs="0"/>
 *         &lt;element name="Courses" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CourseList_t" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t" minOccurs="0"/>
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
@XmlType(name = "TrainingCenterDatabase_t", propOrder = {
    "folders",
    "activities",
    "workouts",
    "courses",
    "author",
    "extensions"
})
public class TrainingCenterDatabaseT {

    @XmlElement(name = "Folders")
    protected FoldersT folders;
    @XmlElement(name = "Activities")
    protected ActivityListT activities;
    @XmlElement(name = "Workouts")
    protected WorkoutListT workouts;
    @XmlElement(name = "Courses")
    protected CourseListT courses;
    @XmlElement(name = "Author")
    protected AbstractSourceT author;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propriété folders.
     * 
     * @return
     *     possible object is
     *     {@link FoldersT }
     *     
     */
    public FoldersT getFolders() {
        return folders;
    }

    /**
     * Définit la valeur de la propriété folders.
     * 
     * @param value
     *     allowed object is
     *     {@link FoldersT }
     *     
     */
    public void setFolders(FoldersT value) {
        this.folders = value;
    }

    /**
     * Obtient la valeur de la propriété activities.
     * 
     * @return
     *     possible object is
     *     {@link ActivityListT }
     *     
     */
    public ActivityListT getActivities() {
        return activities;
    }

    /**
     * Définit la valeur de la propriété activities.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityListT }
     *     
     */
    public void setActivities(ActivityListT value) {
        this.activities = value;
    }

    /**
     * Obtient la valeur de la propriété workouts.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutListT }
     *     
     */
    public WorkoutListT getWorkouts() {
        return workouts;
    }

    /**
     * Définit la valeur de la propriété workouts.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutListT }
     *     
     */
    public void setWorkouts(WorkoutListT value) {
        this.workouts = value;
    }

    /**
     * Obtient la valeur de la propriété courses.
     * 
     * @return
     *     possible object is
     *     {@link CourseListT }
     *     
     */
    public CourseListT getCourses() {
        return courses;
    }

    /**
     * Définit la valeur de la propriété courses.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseListT }
     *     
     */
    public void setCourses(CourseListT value) {
        this.courses = value;
    }

    /**
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSourceT }
     *     
     */
    public AbstractSourceT getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSourceT }
     *     
     */
    public void setAuthor(AbstractSourceT value) {
        this.author = value;
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
