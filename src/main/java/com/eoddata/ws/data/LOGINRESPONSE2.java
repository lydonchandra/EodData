
package com.eoddata.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOGINRESPONSE2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOGINRESPONSE2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Token" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DataFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Header" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Suffix" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOGINRESPONSE2")
public class LOGINRESPONSE2 {

    @XmlAttribute(name = "Message")
    protected String message;
    @XmlAttribute(name = "Token")
    protected String token;
    @XmlAttribute(name = "DataFormat")
    protected String dataFormat;
    @XmlAttribute(name = "Header", required = true)
    protected boolean header;
    @XmlAttribute(name = "Suffix", required = true)
    protected boolean suffix;

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
     * Gets the value of the header property.
     * 
     */
    public boolean isHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     */
    public void setHeader(boolean value) {
        this.header = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     */
    public boolean isSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     */
    public void setSuffix(boolean value) {
        this.suffix = value;
    }

}
