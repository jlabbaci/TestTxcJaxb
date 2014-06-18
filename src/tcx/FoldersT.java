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
 * <p>Classe Java pour Folders_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Folders_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="History" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}History_t" minOccurs="0"/>
 *         &lt;element name="Workouts" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Workouts_t" minOccurs="0"/>
 *         &lt;element name="Courses" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Courses_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folders_t", propOrder = {
    "history",
    "workouts",
    "courses"
})
public class FoldersT {

    @XmlElement(name = "History")
    protected HistoryT history;
    @XmlElement(name = "Workouts")
    protected WorkoutsT workouts;
    @XmlElement(name = "Courses")
    protected CoursesT courses;

    /**
     * Obtient la valeur de la propriété history.
     * 
     * @return
     *     possible object is
     *     {@link HistoryT }
     *     
     */
    public HistoryT getHistory() {
        return history;
    }

    /**
     * Définit la valeur de la propriété history.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryT }
     *     
     */
    public void setHistory(HistoryT value) {
        this.history = value;
    }

    /**
     * Obtient la valeur de la propriété workouts.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutsT }
     *     
     */
    public WorkoutsT getWorkouts() {
        return workouts;
    }

    /**
     * Définit la valeur de la propriété workouts.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutsT }
     *     
     */
    public void setWorkouts(WorkoutsT value) {
        this.workouts = value;
    }

    /**
     * Obtient la valeur de la propriété courses.
     * 
     * @return
     *     possible object is
     *     {@link CoursesT }
     *     
     */
    public CoursesT getCourses() {
        return courses;
    }

    /**
     * Définit la valeur de la propriété courses.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesT }
     *     
     */
    public void setCourses(CoursesT value) {
        this.courses = value;
    }

}
