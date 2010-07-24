
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXCHANGE" type="{http://ws.eoddata.com/Data}EXCHANGE" minOccurs="0"/>
 *         &lt;element name="EXCHANGES" type="{http://ws.eoddata.com/Data}ArrayOfEXCHANGE" minOccurs="0"/>
 *         &lt;element name="SYMBOL" type="{http://ws.eoddata.com/Data}SYMBOL" minOccurs="0"/>
 *         &lt;element name="SYMBOLS" type="{http://ws.eoddata.com/Data}ArrayOfSYMBOL" minOccurs="0"/>
 *         &lt;element name="QUOTE" type="{http://ws.eoddata.com/Data}QUOTE" minOccurs="0"/>
 *         &lt;element name="QUOTES" type="{http://ws.eoddata.com/Data}ArrayOfQUOTE" minOccurs="0"/>
 *         &lt;element name="SPLITS" type="{http://ws.eoddata.com/Data}ArrayOfSPLIT" minOccurs="0"/>
 *         &lt;element name="COUNTRIES" type="{http://ws.eoddata.com/Data}ArrayOfCountryBase" minOccurs="0"/>
 *         &lt;element name="FUNDAMENTALS" type="{http://ws.eoddata.com/Data}ArrayOfFUNDAMENTAL" minOccurs="0"/>
 *         &lt;element name="TECHNICALS" type="{http://ws.eoddata.com/Data}ArrayOfTECHNICAL" minOccurs="0"/>
 *         &lt;element name="SYMBOLCHANGES" type="{http://ws.eoddata.com/Data}ArrayOfSYMBOLCHANGE" minOccurs="0"/>
 *         &lt;element name="CHART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEMBERSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTHS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAFORMATS" type="{http://ws.eoddata.com/Data}ArrayOfDATAFORMAT" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESPONSE", propOrder = {
    "exchange",
    "exchanges",
    "symbol",
    "symbols",
    "quote",
    "quotes",
    "splits",
    "countries",
    "fundamentals",
    "technicals",
    "symbolchanges",
    "chart",
    "membership",
    "version",
    "months",
    "dataformats"
})
public class RESPONSE {

    @XmlElement(name = "EXCHANGE")
    protected EXCHANGE exchange;
    @XmlElement(name = "EXCHANGES")
    protected ArrayOfEXCHANGE exchanges;
    @XmlElement(name = "SYMBOL")
    protected SYMBOL symbol;
    @XmlElement(name = "SYMBOLS")
    protected ArrayOfSYMBOL symbols;
    @XmlElement(name = "QUOTE")
    protected QUOTE quote;
    @XmlElement(name = "QUOTES")
    protected ArrayOfQUOTE quotes;
    @XmlElement(name = "SPLITS")
    protected ArrayOfSPLIT splits;
    @XmlElement(name = "COUNTRIES")
    protected ArrayOfCountryBase countries;
    @XmlElement(name = "FUNDAMENTALS")
    protected ArrayOfFUNDAMENTAL fundamentals;
    @XmlElement(name = "TECHNICALS")
    protected ArrayOfTECHNICAL technicals;
    @XmlElement(name = "SYMBOLCHANGES")
    protected ArrayOfSYMBOLCHANGE symbolchanges;
    @XmlElement(name = "CHART")
    protected String chart;
    @XmlElement(name = "MEMBERSHIP")
    protected String membership;
    @XmlElement(name = "VERSION")
    protected String version;
    @XmlElement(name = "MONTHS")
    protected String months;
    @XmlElement(name = "DATAFORMATS")
    protected ArrayOfDATAFORMAT dataformats;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "Message")
    protected String message;
    @XmlAttribute(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link EXCHANGE }
     *     
     */
    public EXCHANGE getEXCHANGE() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCHANGE }
     *     
     */
    public void setEXCHANGE(EXCHANGE value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the exchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEXCHANGE }
     *     
     */
    public ArrayOfEXCHANGE getEXCHANGES() {
        return exchanges;
    }

    /**
     * Sets the value of the exchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEXCHANGE }
     *     
     */
    public void setEXCHANGES(ArrayOfEXCHANGE value) {
        this.exchanges = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link SYMBOL }
     *     
     */
    public SYMBOL getSYMBOL() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYMBOL }
     *     
     */
    public void setSYMBOL(SYMBOL value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the symbols property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSYMBOL }
     *     
     */
    public ArrayOfSYMBOL getSYMBOLS() {
        return symbols;
    }

    /**
     * Sets the value of the symbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSYMBOL }
     *     
     */
    public void setSYMBOLS(ArrayOfSYMBOL value) {
        this.symbols = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link QUOTE }
     *     
     */
    public QUOTE getQUOTE() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUOTE }
     *     
     */
    public void setQUOTE(QUOTE value) {
        this.quote = value;
    }

    /**
     * Gets the value of the quotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQUOTE }
     *     
     */
    public ArrayOfQUOTE getQUOTES() {
        return quotes;
    }

    /**
     * Sets the value of the quotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQUOTE }
     *     
     */
    public void setQUOTES(ArrayOfQUOTE value) {
        this.quotes = value;
    }

    /**
     * Gets the value of the splits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSPLIT }
     *     
     */
    public ArrayOfSPLIT getSPLITS() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSPLIT }
     *     
     */
    public void setSPLITS(ArrayOfSPLIT value) {
        this.splits = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryBase }
     *     
     */
    public ArrayOfCountryBase getCOUNTRIES() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryBase }
     *     
     */
    public void setCOUNTRIES(ArrayOfCountryBase value) {
        this.countries = value;
    }

    /**
     * Gets the value of the fundamentals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFUNDAMENTAL }
     *     
     */
    public ArrayOfFUNDAMENTAL getFUNDAMENTALS() {
        return fundamentals;
    }

    /**
     * Sets the value of the fundamentals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFUNDAMENTAL }
     *     
     */
    public void setFUNDAMENTALS(ArrayOfFUNDAMENTAL value) {
        this.fundamentals = value;
    }

    /**
     * Gets the value of the technicals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTECHNICAL }
     *     
     */
    public ArrayOfTECHNICAL getTECHNICALS() {
        return technicals;
    }

    /**
     * Sets the value of the technicals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTECHNICAL }
     *     
     */
    public void setTECHNICALS(ArrayOfTECHNICAL value) {
        this.technicals = value;
    }

    /**
     * Gets the value of the symbolchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSYMBOLCHANGE }
     *     
     */
    public ArrayOfSYMBOLCHANGE getSYMBOLCHANGES() {
        return symbolchanges;
    }

    /**
     * Sets the value of the symbolchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSYMBOLCHANGE }
     *     
     */
    public void setSYMBOLCHANGES(ArrayOfSYMBOLCHANGE value) {
        this.symbolchanges = value;
    }

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHART() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHART(String value) {
        this.chart = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMBERSHIP() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMBERSHIP(String value) {
        this.membership = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the months property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONTHS() {
        return months;
    }

    /**
     * Sets the value of the months property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONTHS(String value) {
        this.months = value;
    }

    /**
     * Gets the value of the dataformats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDATAFORMAT }
     *     
     */
    public ArrayOfDATAFORMAT getDATAFORMATS() {
        return dataformats;
    }

    /**
     * Sets the value of the dataformats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDATAFORMAT }
     *     
     */
    public void setDATAFORMATS(ArrayOfDATAFORMAT value) {
        this.dataformats = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
