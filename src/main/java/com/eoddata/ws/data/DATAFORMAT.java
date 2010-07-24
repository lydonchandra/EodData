
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATAFORMAT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATAFORMAT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COLUMNS" type="{http://ws.eoddata.com/Data}ArrayOfDATAFORMAT_COLUMN" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Header" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncludeSuffix" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TabColumnSeperator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ColumnSeperator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TextQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FilenamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FilenameExchangeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FilenameDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludeHeaderRow" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HourFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateTimeSeperator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExchangeFilenameFormatDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExchangeFilenameFormatDateRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SymbolFilenameFormatDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SymbolFilenameFormatDateRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATAFORMAT", propOrder = {
    "columns"
})
public class DATAFORMAT {

    @XmlElement(name = "COLUMNS")
    protected ArrayOfDATAFORMATCOLUMN columns;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Header")
    protected String header;
    @XmlAttribute(name = "DateFormat")
    protected String dateFormat;
    @XmlAttribute(name = "Extension")
    protected String extension;
    @XmlAttribute(name = "IncludeSuffix", required = true)
    protected boolean includeSuffix;
    @XmlAttribute(name = "TabColumnSeperator", required = true)
    protected boolean tabColumnSeperator;
    @XmlAttribute(name = "ColumnSeperator")
    protected String columnSeperator;
    @XmlAttribute(name = "TextQualifier")
    protected String textQualifier;
    @XmlAttribute(name = "FilenamePrefix")
    protected String filenamePrefix;
    @XmlAttribute(name = "FilenameExchangeCode", required = true)
    protected boolean filenameExchangeCode;
    @XmlAttribute(name = "FilenameDate", required = true)
    protected boolean filenameDate;
    @XmlAttribute(name = "IncludeHeaderRow", required = true)
    protected boolean includeHeaderRow;
    @XmlAttribute(name = "HourFormat")
    protected String hourFormat;
    @XmlAttribute(name = "DateTimeSeperator")
    protected String dateTimeSeperator;
    @XmlAttribute(name = "ExchangeFilenameFormatDate")
    protected String exchangeFilenameFormatDate;
    @XmlAttribute(name = "ExchangeFilenameFormatDateRange")
    protected String exchangeFilenameFormatDateRange;
    @XmlAttribute(name = "SymbolFilenameFormatDate")
    protected String symbolFilenameFormatDate;
    @XmlAttribute(name = "SymbolFilenameFormatDateRange")
    protected String symbolFilenameFormatDateRange;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDATAFORMATCOLUMN }
     *     
     */
    public ArrayOfDATAFORMATCOLUMN getCOLUMNS() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDATAFORMATCOLUMN }
     *     
     */
    public void setCOLUMNS(ArrayOfDATAFORMATCOLUMN value) {
        this.columns = value;
    }

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
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the includeSuffix property.
     * 
     */
    public boolean isIncludeSuffix() {
        return includeSuffix;
    }

    /**
     * Sets the value of the includeSuffix property.
     * 
     */
    public void setIncludeSuffix(boolean value) {
        this.includeSuffix = value;
    }

    /**
     * Gets the value of the tabColumnSeperator property.
     * 
     */
    public boolean isTabColumnSeperator() {
        return tabColumnSeperator;
    }

    /**
     * Sets the value of the tabColumnSeperator property.
     * 
     */
    public void setTabColumnSeperator(boolean value) {
        this.tabColumnSeperator = value;
    }

    /**
     * Gets the value of the columnSeperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnSeperator() {
        return columnSeperator;
    }

    /**
     * Sets the value of the columnSeperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnSeperator(String value) {
        this.columnSeperator = value;
    }

    /**
     * Gets the value of the textQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextQualifier() {
        return textQualifier;
    }

    /**
     * Sets the value of the textQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextQualifier(String value) {
        this.textQualifier = value;
    }

    /**
     * Gets the value of the filenamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenamePrefix() {
        return filenamePrefix;
    }

    /**
     * Sets the value of the filenamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenamePrefix(String value) {
        this.filenamePrefix = value;
    }

    /**
     * Gets the value of the filenameExchangeCode property.
     * 
     */
    public boolean isFilenameExchangeCode() {
        return filenameExchangeCode;
    }

    /**
     * Sets the value of the filenameExchangeCode property.
     * 
     */
    public void setFilenameExchangeCode(boolean value) {
        this.filenameExchangeCode = value;
    }

    /**
     * Gets the value of the filenameDate property.
     * 
     */
    public boolean isFilenameDate() {
        return filenameDate;
    }

    /**
     * Sets the value of the filenameDate property.
     * 
     */
    public void setFilenameDate(boolean value) {
        this.filenameDate = value;
    }

    /**
     * Gets the value of the includeHeaderRow property.
     * 
     */
    public boolean isIncludeHeaderRow() {
        return includeHeaderRow;
    }

    /**
     * Sets the value of the includeHeaderRow property.
     * 
     */
    public void setIncludeHeaderRow(boolean value) {
        this.includeHeaderRow = value;
    }

    /**
     * Gets the value of the hourFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourFormat() {
        return hourFormat;
    }

    /**
     * Sets the value of the hourFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourFormat(String value) {
        this.hourFormat = value;
    }

    /**
     * Gets the value of the dateTimeSeperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeSeperator() {
        return dateTimeSeperator;
    }

    /**
     * Sets the value of the dateTimeSeperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeSeperator(String value) {
        this.dateTimeSeperator = value;
    }

    /**
     * Gets the value of the exchangeFilenameFormatDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeFilenameFormatDate() {
        return exchangeFilenameFormatDate;
    }

    /**
     * Sets the value of the exchangeFilenameFormatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeFilenameFormatDate(String value) {
        this.exchangeFilenameFormatDate = value;
    }

    /**
     * Gets the value of the exchangeFilenameFormatDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeFilenameFormatDateRange() {
        return exchangeFilenameFormatDateRange;
    }

    /**
     * Sets the value of the exchangeFilenameFormatDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeFilenameFormatDateRange(String value) {
        this.exchangeFilenameFormatDateRange = value;
    }

    /**
     * Gets the value of the symbolFilenameFormatDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolFilenameFormatDate() {
        return symbolFilenameFormatDate;
    }

    /**
     * Sets the value of the symbolFilenameFormatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolFilenameFormatDate(String value) {
        this.symbolFilenameFormatDate = value;
    }

    /**
     * Gets the value of the symbolFilenameFormatDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolFilenameFormatDateRange() {
        return symbolFilenameFormatDateRange;
    }

    /**
     * Sets the value of the symbolFilenameFormatDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolFilenameFormatDateRange(String value) {
        this.symbolFilenameFormatDateRange = value;
    }

}
