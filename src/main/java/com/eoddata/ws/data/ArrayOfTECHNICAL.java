
package com.eoddata.ws.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTECHNICAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTECHNICAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TECHNICAL" type="{http://ws.eoddata.com/Data}TECHNICAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTECHNICAL", propOrder = {
    "technical"
})
public class ArrayOfTECHNICAL {

    @XmlElement(name = "TECHNICAL", nillable = true)
    protected List<TECHNICAL> technical;

    /**
     * Gets the value of the technical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTECHNICAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TECHNICAL }
     * 
     * 
     */
    public List<TECHNICAL> getTECHNICAL() {
        if (technical == null) {
            technical = new ArrayList<TECHNICAL>();
        }
        return this.technical;
    }

}
