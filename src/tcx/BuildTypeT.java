//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2012.04.04 � 10:31:38 PM CST 
//


package tcx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BuildType_t.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildType_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Beta"/>
 *     &lt;enumeration value="Release"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildType_t")
@XmlEnum
public enum BuildTypeT {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Beta")
    BETA("Beta"),
    @XmlEnumValue("Release")
    RELEASE("Release");
    private final String value;

    BuildTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildTypeT fromValue(String v) {
        for (BuildTypeT c: BuildTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
