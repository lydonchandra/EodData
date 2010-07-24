
package com.eoddata.ws.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSPLIT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSPLIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPLIT" type="{http://ws.eoddata.com/Data}SPLIT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSPLIT", propOrder = {
    "split"
})
public class ArrayOfSPLIT {

    @XmlElement(name = "SPLIT", nillable = true)
    protected List<SPLIT> split;

    /**
     * Gets the value of the split property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the split property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPLIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPLIT }
     * 
     * 
     */
    public List<SPLIT> getSPLIT() {
        if (split == null) {
            split = new ArrayList<SPLIT>();
        }
        return this.split;
    }

}
