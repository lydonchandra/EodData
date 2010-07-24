
package com.eoddata.ws.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFUNDAMENTAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFUNDAMENTAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FUNDAMENTAL" type="{http://ws.eoddata.com/Data}FUNDAMENTAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFUNDAMENTAL", propOrder = {
    "fundamental"
})
public class ArrayOfFUNDAMENTAL {

    @XmlElement(name = "FUNDAMENTAL", nillable = true)
    protected List<FUNDAMENTAL> fundamental;

    /**
     * Gets the value of the fundamental property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundamental property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFUNDAMENTAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FUNDAMENTAL }
     * 
     * 
     */
    public List<FUNDAMENTAL> getFUNDAMENTAL() {
        if (fundamental == null) {
            fundamental = new ArrayList<FUNDAMENTAL>();
        }
        return this.fundamental;
    }

}
