
package com.eoddata.ws.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCountryBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCountryBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryBase" type="{http://ws.eoddata.com/Data}CountryBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCountryBase", propOrder = {
    "countryBase"
})
public class ArrayOfCountryBase {

    @XmlElement(name = "CountryBase", nillable = true)
    protected List<CountryBase> countryBase;

    /**
     * Gets the value of the countryBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryBase }
     * 
     * 
     */
    public List<CountryBase> getCountryBase() {
        if (countryBase == null) {
            countryBase = new ArrayList<CountryBase>();
        }
        return this.countryBase;
    }

}
