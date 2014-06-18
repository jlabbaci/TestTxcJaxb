//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2012.04.04 à 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Sport_t.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Sport_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Biking"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Sport_t")
@XmlEnum
public enum SportT {

    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Track")
    TRACK("Track"),
    @XmlEnumValue("Biking")
    BIKING("Biking"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SportT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SportT fromValue(String v) {
        for (SportT c: SportT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
