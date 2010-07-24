
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
 *         &lt;element name="SymbolHistoryPeriodByDateRangeResult" type="{http://ws.eoddata.com/Data}RESPONSE" minOccurs="0"/>
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
    "symbolHistoryPeriodByDateRangeResult"
})
@XmlRootElement(name = "SymbolHistoryPeriodByDateRangeResponse")
public class SymbolHistoryPeriodByDateRangeResponse {

    @XmlElement(name = "SymbolHistoryPeriodByDateRangeResult")
    protected RESPONSE symbolHistoryPeriodByDateRangeResult;

    /**
     * Gets the value of the symbolHistoryPeriodByDateRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONSE }
     *     
     */
    public RESPONSE getSymbolHistoryPeriodByDateRangeResult() {
        return symbolHistoryPeriodByDateRangeResult;
    }

    /**
     * Sets the value of the symbolHistoryPeriodByDateRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONSE }
     *     
     */
    public void setSymbolHistoryPeriodByDateRangeResult(RESPONSE value) {
        this.symbolHistoryPeriodByDateRangeResult = value;
    }

}
