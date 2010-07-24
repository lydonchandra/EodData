
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Top10LossesResult" type="{http://ws.eoddata.com/Data}RESPONSE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "top10LossesResult"
})
@XmlRootElement(name = "Top10LossesResponse")
public class Top10LossesResponse {

    @XmlElement(name = "Top10LossesResult")
    protected RESPONSE top10LossesResult;

    /**
     * Gets the value of the top10LossesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSE }
     *     
     */
    public RESPONSE getTop10LossesResult() {
        return top10LossesResult;
    }

    /**
     * Sets the value of the top10LossesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSE }
     *     
     */
    public void setTop10LossesResult(RESPONSE value) {
        this.top10LossesResult = value;
    }

}
