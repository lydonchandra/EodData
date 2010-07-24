
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FUNDAMENTAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDAMENTAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Shares" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="MarketCap" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="PE" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="EPS" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="NTA" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="DivYield" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Dividend" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="DividendDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="DPS" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="EBITDA" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PEG" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PtS" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PtB" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Yield" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FUNDAMENTAL")
public class FUNDAMENTAL {

    @XmlAttribute(name = "Symbol")
    protected String symbol;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "Industry")
    protected String industry;
    @XmlAttribute(name = "Sector")
    protected String sector;
    @XmlAttribute(name = "Shares", required = true)
    protected long shares;
    @XmlAttribute(name = "MarketCap", required = true)
    protected long marketCap;
    @XmlAttribute(name = "PE", required = true)
    protected double pe;
    @XmlAttribute(name = "EPS", required = true)
    protected double eps;
    @XmlAttribute(name = "NTA", required = true)
    protected double nta;
    @XmlAttribute(name = "DivYield", required = true)
    protected double divYield;
    @XmlAttribute(name = "Dividend", required = true)
    protected double dividend;
    @XmlAttribute(name = "DividendDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dividendDate;
    @XmlAttribute(name = "DPS", required = true)
    protected double dps;
    @XmlAttribute(name = "EBITDA", required = true)
    protected double ebitda;
    @XmlAttribute(name = "PEG", required = true)
    protected double peg;
    @XmlAttribute(name = "PtS", required = true)
    protected double ptS;
    @XmlAttribute(name = "PtB", required = true)
    protected double ptB;
    @XmlAttribute(name = "Yield", required = true)
    protected double yield;

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
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     */
    public long getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     */
    public void setShares(long value) {
        this.shares = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     */
    public long getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     */
    public void setMarketCap(long value) {
        this.marketCap = value;
    }

    /**
     * Gets the value of the pe property.
     * 
     */
    public double getPE() {
        return pe;
    }

    /**
     * Sets the value of the pe property.
     * 
     */
    public void setPE(double value) {
        this.pe = value;
    }

    /**
     * Gets the value of the eps property.
     * 
     */
    public double getEPS() {
        return eps;
    }

    /**
     * Sets the value of the eps property.
     * 
     */
    public void setEPS(double value) {
        this.eps = value;
    }

    /**
     * Gets the value of the nta property.
     * 
     */
    public double getNTA() {
        return nta;
    }

    /**
     * Sets the value of the nta property.
     * 
     */
    public void setNTA(double value) {
        this.nta = value;
    }

    /**
     * Gets the value of the divYield property.
     * 
     */
    public double getDivYield() {
        return divYield;
    }

    /**
     * Sets the value of the divYield property.
     * 
     */
    public void setDivYield(double value) {
        this.divYield = value;
    }

    /**
     * Gets the value of the dividend property.
     * 
     */
    public double getDividend() {
        return dividend;
    }

    /**
     * Sets the value of the dividend property.
     * 
     */
    public void setDividend(double value) {
        this.dividend = value;
    }

    /**
     * Gets the value of the dividendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDividendDate() {
        return dividendDate;
    }

    /**
     * Sets the value of the dividendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDividendDate(XMLGregorianCalendar value) {
        this.dividendDate = value;
    }

    /**
     * Gets the value of the dps property.
     * 
     */
    public double getDPS() {
        return dps;
    }

    /**
     * Sets the value of the dps property.
     * 
     */
    public void setDPS(double value) {
        this.dps = value;
    }

    /**
     * Gets the value of the ebitda property.
     * 
     */
    public double getEBITDA() {
        return ebitda;
    }

    /**
     * Sets the value of the ebitda property.
     * 
     */
    public void setEBITDA(double value) {
        this.ebitda = value;
    }

    /**
     * Gets the value of the peg property.
     * 
     */
    public double getPEG() {
        return peg;
    }

    /**
     * Sets the value of the peg property.
     * 
     */
    public void setPEG(double value) {
        this.peg = value;
    }

    /**
     * Gets the value of the ptS property.
     * 
     */
    public double getPtS() {
        return ptS;
    }

    /**
     * Sets the value of the ptS property.
     * 
     */
    public void setPtS(double value) {
        this.ptS = value;
    }

    /**
     * Gets the value of the ptB property.
     * 
     */
    public double getPtB() {
        return ptB;
    }

    /**
     * Sets the value of the ptB property.
     * 
     */
    public void setPtB(double value) {
        this.ptB = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     */
    public double getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     */
    public void setYield(double value) {
        this.yield = value;
    }

}
