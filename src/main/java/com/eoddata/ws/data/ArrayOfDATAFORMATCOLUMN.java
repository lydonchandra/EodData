
package com.eoddata.ws.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDATAFORMAT_COLUMN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDATAFORMAT_COLUMN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATAFORMAT_COLUMN" type="{http://ws.eoddata.com/Data}DATAFORMAT_COLUMN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDATAFORMAT_COLUMN", propOrder = {
    "dataformatcolumn"
})
public class ArrayOfDATAFORMATCOLUMN {

    @XmlElement(name = "DATAFORMAT_COLUMN", nillable = true)
    protected List<DATAFORMATCOLUMN> dataformatcolumn;

    /**
     * Gets the value of the dataformatcolumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataformatcolumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATAFORMATCOLUMN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DATAFORMATCOLUMN }
     * 
     * 
     */
    public List<DATAFORMATCOLUMN> getDATAFORMATCOLUMN() {
        if (dataformatcolumn == null) {
            dataformatcolumn = new ArrayList<DATAFORMATCOLUMN>();
        }
        return this.dataformatcolumn;
    }

}
