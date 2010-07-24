
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
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeSuffix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "token",
    "dataFormat",
    "includeHeader",
    "includeSuffix"
})
@XmlRootElement(name = "UpdateDataFormat")
public class UpdateDataFormat {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "DataFormat")
    protected String dataFormat;
    @XmlElement(name = "IncludeHeader")
    protected boolean includeHeader;
    @XmlElement(name = "IncludeSuffix")
    protected boolean includeSuffix;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
     * Gets the value of the includeHeader property.
     * 
     */
    public boolean isIncludeHeader() {
        return includeHeader;
    }

    /**
     * Sets the value of the includeHeader property.
     * 
     */
    public void setIncludeHeader(boolean value) {
        this.includeHeader = value;
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

}
