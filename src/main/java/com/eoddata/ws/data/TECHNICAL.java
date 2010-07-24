
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TECHNICAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TECHNICAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MA1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA5" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA20" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA50" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA100" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MA200" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MAPercent" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="MAReturn" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="VolumeChange" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ThreeMonthChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="SixMonthChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="WeekHigh" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="WeekLow" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="WeekChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgWeekChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgWeekVolume" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgMonthChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgMonthVolume" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="YearHigh" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="YearLow" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="YearChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgYearChange" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AvgYearVolumne" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="RSI14" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="STO9" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="WPR14" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="MTM14" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ROC14" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PTC" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="SAR" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Volatility" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Liquidity" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TECHNICAL")
public class TECHNICAL {

    @XmlAttribute(name = "Symbol")
    protected String symbol;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "MA1", required = true)
    protected int ma1;
    @XmlAttribute(name = "MA2", required = true)
    protected int ma2;
    @XmlAttribute(name = "MA5", required = true)
    protected int ma5;
    @XmlAttribute(name = "MA20", required = true)
    protected int ma20;
    @XmlAttribute(name = "MA50", required = true)
    protected int ma50;
    @XmlAttribute(name = "MA100", required = true)
    protected int ma100;
    @XmlAttribute(name = "MA200", required = true)
    protected int ma200;
    @XmlAttribute(name = "MAPercent", required = true)
    protected double maPercent;
    @XmlAttribute(name = "MAReturn", required = true)
    protected double maReturn;
    @XmlAttribute(name = "VolumeChange", required = true)
    protected long volumeChange;
    @XmlAttribute(name = "ThreeMonthChange", required = true)
    protected double threeMonthChange;
    @XmlAttribute(name = "SixMonthChange", required = true)
    protected double sixMonthChange;
    @XmlAttribute(name = "WeekHigh", required = true)
    protected double weekHigh;
    @XmlAttribute(name = "WeekLow", required = true)
    protected double weekLow;
    @XmlAttribute(name = "WeekChange", required = true)
    protected double weekChange;
    @XmlAttribute(name = "AvgWeekChange", required = true)
    protected double avgWeekChange;
    @XmlAttribute(name = "AvgWeekVolume", required = true)
    protected double avgWeekVolume;
    @XmlAttribute(name = "AvgMonthChange", required = true)
    protected double avgMonthChange;
    @XmlAttribute(name = "AvgMonthVolume", required = true)
    protected double avgMonthVolume;
    @XmlAttribute(name = "YearHigh", required = true)
    protected double yearHigh;
    @XmlAttribute(name = "YearLow", required = true)
    protected double yearLow;
    @XmlAttribute(name = "YearChange", required = true)
    protected double yearChange;
    @XmlAttribute(name = "AvgYearChange", required = true)
    protected double avgYearChange;
    @XmlAttribute(name = "AvgYearVolumne", required = true)
    protected double avgYearVolumne;
    @XmlAttribute(name = "RSI14", required = true)
    protected double rsi14;
    @XmlAttribute(name = "STO9", required = true)
    protected double sto9;
    @XmlAttribute(name = "WPR14", required = true)
    protected double wpr14;
    @XmlAttribute(name = "MTM14", required = true)
    protected double mtm14;
    @XmlAttribute(name = "ROC14", required = true)
    protected double roc14;
    @XmlAttribute(name = "PTC", required = true)
    protected long ptc;
    @XmlAttribute(name = "SAR", required = true)
    protected double sar;
    @XmlAttribute(name = "Volatility", required = true)
    protected double volatility;
    @XmlAttribute(name = "Liquidity", required = true)
    protected double liquidity;

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
     * Gets the value of the ma1 property.
     * 
     */
    public int getMA1() {
        return ma1;
    }

    /**
     * Sets the value of the ma1 property.
     * 
     */
    public void setMA1(int value) {
        this.ma1 = value;
    }

    /**
     * Gets the value of the ma2 property.
     * 
     */
    public int getMA2() {
        return ma2;
    }

    /**
     * Sets the value of the ma2 property.
     * 
     */
    public void setMA2(int value) {
        this.ma2 = value;
    }

    /**
     * Gets the value of the ma5 property.
     * 
     */
    public int getMA5() {
        return ma5;
    }

    /**
     * Sets the value of the ma5 property.
     * 
     */
    public void setMA5(int value) {
        this.ma5 = value;
    }

    /**
     * Gets the value of the ma20 property.
     * 
     */
    public int getMA20() {
        return ma20;
    }

    /**
     * Sets the value of the ma20 property.
     * 
     */
    public void setMA20(int value) {
        this.ma20 = value;
    }

    /**
     * Gets the value of the ma50 property.
     * 
     */
    public int getMA50() {
        return ma50;
    }

    /**
     * Sets the value of the ma50 property.
     * 
     */
    public void setMA50(int value) {
        this.ma50 = value;
    }

    /**
     * Gets the value of the ma100 property.
     * 
     */
    public int getMA100() {
        return ma100;
    }

    /**
     * Sets the value of the ma100 property.
     * 
     */
    public void setMA100(int value) {
        this.ma100 = value;
    }

    /**
     * Gets the value of the ma200 property.
     * 
     */
    public int getMA200() {
        return ma200;
    }

    /**
     * Sets the value of the ma200 property.
     * 
     */
    public void setMA200(int value) {
        this.ma200 = value;
    }

    /**
     * Gets the value of the maPercent property.
     * 
     */
    public double getMAPercent() {
        return maPercent;
    }

    /**
     * Sets the value of the maPercent property.
     * 
     */
    public void setMAPercent(double value) {
        this.maPercent = value;
    }

    /**
     * Gets the value of the maReturn property.
     * 
     */
    public double getMAReturn() {
        return maReturn;
    }

    /**
     * Sets the value of the maReturn property.
     * 
     */
    public void setMAReturn(double value) {
        this.maReturn = value;
    }

    /**
     * Gets the value of the volumeChange property.
     * 
     */
    public long getVolumeChange() {
        return volumeChange;
    }

    /**
     * Sets the value of the volumeChange property.
     * 
     */
    public void setVolumeChange(long value) {
        this.volumeChange = value;
    }

    /**
     * Gets the value of the threeMonthChange property.
     * 
     */
    public double getThreeMonthChange() {
        return threeMonthChange;
    }

    /**
     * Sets the value of the threeMonthChange property.
     * 
     */
    public void setThreeMonthChange(double value) {
        this.threeMonthChange = value;
    }

    /**
     * Gets the value of the sixMonthChange property.
     * 
     */
    public double getSixMonthChange() {
        return sixMonthChange;
    }

    /**
     * Sets the value of the sixMonthChange property.
     * 
     */
    public void setSixMonthChange(double value) {
        this.sixMonthChange = value;
    }

    /**
     * Gets the value of the weekHigh property.
     * 
     */
    public double getWeekHigh() {
        return weekHigh;
    }

    /**
     * Sets the value of the weekHigh property.
     * 
     */
    public void setWeekHigh(double value) {
        this.weekHigh = value;
    }

    /**
     * Gets the value of the weekLow property.
     * 
     */
    public double getWeekLow() {
        return weekLow;
    }

    /**
     * Sets the value of the weekLow property.
     * 
     */
    public void setWeekLow(double value) {
        this.weekLow = value;
    }

    /**
     * Gets the value of the weekChange property.
     * 
     */
    public double getWeekChange() {
        return weekChange;
    }

    /**
     * Sets the value of the weekChange property.
     * 
     */
    public void setWeekChange(double value) {
        this.weekChange = value;
    }

    /**
     * Gets the value of the avgWeekChange property.
     * 
     */
    public double getAvgWeekChange() {
        return avgWeekChange;
    }

    /**
     * Sets the value of the avgWeekChange property.
     * 
     */
    public void setAvgWeekChange(double value) {
        this.avgWeekChange = value;
    }

    /**
     * Gets the value of the avgWeekVolume property.
     * 
     */
    public double getAvgWeekVolume() {
        return avgWeekVolume;
    }

    /**
     * Sets the value of the avgWeekVolume property.
     * 
     */
    public void setAvgWeekVolume(double value) {
        this.avgWeekVolume = value;
    }

    /**
     * Gets the value of the avgMonthChange property.
     * 
     */
    public double getAvgMonthChange() {
        return avgMonthChange;
    }

    /**
     * Sets the value of the avgMonthChange property.
     * 
     */
    public void setAvgMonthChange(double value) {
        this.avgMonthChange = value;
    }

    /**
     * Gets the value of the avgMonthVolume property.
     * 
     */
    public double getAvgMonthVolume() {
        return avgMonthVolume;
    }

    /**
     * Sets the value of the avgMonthVolume property.
     * 
     */
    public void setAvgMonthVolume(double value) {
        this.avgMonthVolume = value;
    }

    /**
     * Gets the value of the yearHigh property.
     * 
     */
    public double getYearHigh() {
        return yearHigh;
    }

    /**
     * Sets the value of the yearHigh property.
     * 
     */
    public void setYearHigh(double value) {
        this.yearHigh = value;
    }

    /**
     * Gets the value of the yearLow property.
     * 
     */
    public double getYearLow() {
        return yearLow;
    }

    /**
     * Sets the value of the yearLow property.
     * 
     */
    public void setYearLow(double value) {
        this.yearLow = value;
    }

    /**
     * Gets the value of the yearChange property.
     * 
     */
    public double getYearChange() {
        return yearChange;
    }

    /**
     * Sets the value of the yearChange property.
     * 
     */
    public void setYearChange(double value) {
        this.yearChange = value;
    }

    /**
     * Gets the value of the avgYearChange property.
     * 
     */
    public double getAvgYearChange() {
        return avgYearChange;
    }

    /**
     * Sets the value of the avgYearChange property.
     * 
     */
    public void setAvgYearChange(double value) {
        this.avgYearChange = value;
    }

    /**
     * Gets the value of the avgYearVolumne property.
     * 
     */
    public double getAvgYearVolumne() {
        return avgYearVolumne;
    }

    /**
     * Sets the value of the avgYearVolumne property.
     * 
     */
    public void setAvgYearVolumne(double value) {
        this.avgYearVolumne = value;
    }

    /**
     * Gets the value of the rsi14 property.
     * 
     */
    public double getRSI14() {
        return rsi14;
    }

    /**
     * Sets the value of the rsi14 property.
     * 
     */
    public void setRSI14(double value) {
        this.rsi14 = value;
    }

    /**
     * Gets the value of the sto9 property.
     * 
     */
    public double getSTO9() {
        return sto9;
    }

    /**
     * Sets the value of the sto9 property.
     * 
     */
    public void setSTO9(double value) {
        this.sto9 = value;
    }

    /**
     * Gets the value of the wpr14 property.
     * 
     */
    public double getWPR14() {
        return wpr14;
    }

    /**
     * Sets the value of the wpr14 property.
     * 
     */
    public void setWPR14(double value) {
        this.wpr14 = value;
    }

    /**
     * Gets the value of the mtm14 property.
     * 
     */
    public double getMTM14() {
        return mtm14;
    }

    /**
     * Sets the value of the mtm14 property.
     * 
     */
    public void setMTM14(double value) {
        this.mtm14 = value;
    }

    /**
     * Gets the value of the roc14 property.
     * 
     */
    public double getROC14() {
        return roc14;
    }

    /**
     * Sets the value of the roc14 property.
     * 
     */
    public void setROC14(double value) {
        this.roc14 = value;
    }

    /**
     * Gets the value of the ptc property.
     * 
     */
    public long getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     */
    public void setPTC(long value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the sar property.
     * 
     */
    public double getSAR() {
        return sar;
    }

    /**
     * Sets the value of the sar property.
     * 
     */
    public void setSAR(double value) {
        this.sar = value;
    }

    /**
     * Gets the value of the volatility property.
     * 
     */
    public double getVolatility() {
        return volatility;
    }

    /**
     * Sets the value of the volatility property.
     * 
     */
    public void setVolatility(double value) {
        this.volatility = value;
    }

    /**
     * Gets the value of the liquidity property.
     * 
     */
    public double getLiquidity() {
        return liquidity;
    }

    /**
     * Sets the value of the liquidity property.
     * 
     */
    public void setLiquidity(double value) {
        this.liquidity = value;
    }

}
