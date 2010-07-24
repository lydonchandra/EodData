
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QUOTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUOTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Open" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="High" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Low" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Close" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Volume" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="OpenInterest" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Previous" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Change" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Bid" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Ask" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PreviousClose" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="NextOpen" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Modified" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUOTE")
public class QUOTE {

    @XmlAttribute(name = "Symbol")
    protected String symbol;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "Open", required = true)
    protected double open;
    @XmlAttribute(name = "High", required = true)
    protected double high;
    @XmlAttribute(name = "Low", required = true)
    protected double low;
    @XmlAttribute(name = "Close", required = true)
    protected double close;
    @XmlAttribute(name = "Volume", required = true)
    protected long volume;
    @XmlAttribute(name = "OpenInterest", required = true)
    protected long openInterest;
    @XmlAttribute(name = "Previous", required = true)
    protected double previous;
    @XmlAttribute(name = "Change", required = true)
    protected double change;
    @XmlAttribute(name = "Bid", required = true)
    protected double bid;
    @XmlAttribute(name = "Ask", required = true)
    protected double ask;
    @XmlAttribute(name = "PreviousClose", required = true)
    protected double previousClose;
    @XmlAttribute(name = "NextOpen", required = true)
    protected double nextOpen;
    @XmlAttribute(name = "Modified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the open property.
     * 
     */
    public double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(double value) {
        this.open = value;
    }

    /**
     * Gets the value of the high property.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

    /**
     * Gets the value of the close property.
     * 
     */
    public double getClose() {
        return close;
    }

    /**
     * Sets the value of the close property.
     * 
     */
    public void setClose(double value) {
        this.close = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public long getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(long value) {
        this.volume = value;
    }

    /**
     * Gets the value of the openInterest property.
     * 
     */
    public long getOpenInterest() {
        return openInterest;
    }

    /**
     * Sets the value of the openInterest property.
     * 
     */
    public void setOpenInterest(long value) {
        this.openInterest = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     */
    public double getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     */
    public void setPrevious(double value) {
        this.previous = value;
    }

    /**
     * Gets the value of the change property.
     * 
     */
    public double getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     */
    public void setChange(double value) {
        this.change = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     */
    public void setBid(double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(double value) {
        this.ask = value;
    }

    /**
     * Gets the value of the previousClose property.
     * 
     */
    public double getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     */
    public void setPreviousClose(double value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the nextOpen property.
     * 
     */
    public double getNextOpen() {
        return nextOpen;
    }

    /**
     * Sets the value of the nextOpen property.
     * 
     */
    public void setNextOpen(double value) {
        this.nextOpen = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

}
