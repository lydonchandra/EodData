
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATAFORMAT_COLUMN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATAFORMAT_COLUMN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SortOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DataFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ColumnCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ColumnTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ColumnType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Header" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATAFORMAT_COLUMN")
public class DATAFORMATCOLUMN {

    @XmlAttribute(name = "SortOrder", required = true)
    protected int sortOrder;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "DataFormat")
    protected String dataFormat;
    @XmlAttribute(name = "ColumnCode")
    protected String columnCode;
    @XmlAttribute(name = "ColumnName")
    protected String columnName;
    @XmlAttribute(name = "ColumnTypeId", required = true)
    protected int columnTypeId;
    @XmlAttribute(name = "ColumnType")
    protected String columnType;
    @XmlAttribute(name = "Header")
    protected String header;

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
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
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormat(String value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the columnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnCode() {
        return columnCode;
    }

    /**
     * Sets the value of the columnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnCode(String value) {
        this.columnCode = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnTypeId property.
     * 
     */
    public int getColumnTypeId() {
        return columnTypeId;
    }

    /**
     * Sets the value of the columnTypeId property.
     * 
     */
    public void setColumnTypeId(int value) {
        this.columnTypeId = value;
    }

    /**
     * Gets the value of the columnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * Sets the value of the columnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnType(String value) {
        this.columnType = value;
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

}
