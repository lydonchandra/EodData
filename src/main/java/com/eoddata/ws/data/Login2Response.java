
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
 *         &lt;element name="Login2Result" type="{http://ws.eoddata.com/Data}LOGINRESPONSE2" minOccurs="0"/>
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
    "login2Result"
})
@XmlRootElement(name = "Login2Response")
public class Login2Response {

    @XmlElement(name = "Login2Result")
    protected LOGINRESPONSE2 login2Result;

    /**
     * Gets the value of the login2Result property.
     * 
     * @return
     *     possible object is
     *     {@link LOGINRESPONSE2 }
     *     
     */
    public LOGINRESPONSE2 getLogin2Result() {
        return login2Result;
    }

    /**
     * Sets the value of the login2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOGINRESPONSE2 }
     *     
     */
    public void setLogin2Result(LOGINRESPONSE2 value) {
        this.login2Result = value;
    }

}
