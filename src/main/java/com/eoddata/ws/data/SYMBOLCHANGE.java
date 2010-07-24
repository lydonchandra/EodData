
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SYMBOLCHANGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYMBOLCHANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OldSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NewSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NewExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYMBOLCHANGE")
public class SYMBOLCHANGE {

    @XmlAttribute(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "OldSymbol")
    protected String oldSymbol;
    @XmlAttribute(name = "NewSymbol")
    protected String newSymbol;
    @XmlAttribute(name = "ExchangeCode")
    protected String exchangeCode;
    @XmlAttribute(name = "NewExchangeCode")
    protected String newExchangeCode;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the oldSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSymbol() {
        return oldSymbol;
    }

    /**
     * Sets the value of the oldSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSymbol(String value) {
        this.oldSymbol = value;
    }

    /**
     * Gets the value of the newSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSymbol() {
        return newSymbol;
    }

    /**
     * Sets the value of the newSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSymbol(String value) {
        this.newSymbol = value;
    }

    /**
     * Gets the value of the exchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Sets the value of the exchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeCode(String value) {
        this.exchangeCode = value;
    }

    /**
     * Gets the value of the newExchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewExchangeCode() {
        return newExchangeCode;
    }

    /**
     * Sets the value of the newExchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewExchangeCode(String value) {
        this.newExchangeCode = value;
    }

}
