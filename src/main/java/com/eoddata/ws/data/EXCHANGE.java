
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXCHANGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXCHANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastTradeDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Advances" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Declines" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsIntraday" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IntradayStartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="HasIntradayProduct" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXCHANGE")
public class EXCHANGE {

    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "LastTradeDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTradeDateTime;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "Advances", required = true)
    protected int advances;
    @XmlAttribute(name = "Declines", required = true)
    protected int declines;
    @XmlAttribute(name = "Suffix")
    protected String suffix;
    @XmlAttribute(name = "TimeZone")
    protected String timeZone;
    @XmlAttribute(name = "IsIntraday", required = true)
    protected boolean isIntraday;
    @XmlAttribute(name = "IntradayStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intradayStartDate;
    @XmlAttribute(name = "HasIntradayProduct", required = true)
    protected boolean hasIntradayProduct;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lastTradeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTradeDateTime() {
        return lastTradeDateTime;
    }

    /**
     * Sets the value of the lastTradeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTradeDateTime(XMLGregorianCalendar value) {
        this.lastTradeDateTime = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the advances property.
     * 
     */
    public int getAdvances() {
        return advances;
    }

    /**
     * Sets the value of the advances property.
     * 
     */
    public void setAdvances(int value) {
        this.advances = value;
    }

    /**
     * Gets the value of the declines property.
     * 
     */
    public int getDeclines() {
        return declines;
    }

    /**
     * Sets the value of the declines property.
     * 
     */
    public void setDeclines(int value) {
        this.declines = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the isIntraday property.
     * 
     */
    public boolean isIsIntraday() {
        return isIntraday;
    }

    /**
     * Sets the value of the isIntraday property.
     * 
     */
    public void setIsIntraday(boolean value) {
        this.isIntraday = value;
    }

    /**
     * Gets the value of the intradayStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntradayStartDate() {
        return intradayStartDate;
    }

    /**
     * Sets the value of the intradayStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntradayStartDate(XMLGregorianCalendar value) {
        this.intradayStartDate = value;
    }

    /**
     * Gets the value of the hasIntradayProduct property.
     * 
     */
    public boolean isHasIntradayProduct() {
        return hasIntradayProduct;
    }

    /**
     * Sets the value of the hasIntradayProduct property.
     * 
     */
    public void setHasIntradayProduct(boolean value) {
        this.hasIntradayProduct = value;
    }

}
