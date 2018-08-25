//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.25 at 01:43:04 AM CDT 
//


package com.jaxb.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addline1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Addline2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", namespace = "http://www.example.org/Address", propOrder = {
    "addline1",
    "addline2",
    "city",
    "state",
    "zip"
})
public class Address {

    @XmlElement(name = "Addline1", required = true)
    protected String addline1;
    @XmlElement(name = "Addline2", required = true)
    protected String addline2;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Zip", required = true)
    protected String zip;

    /**
     * Gets the value of the addline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddline1() {
        return addline1;
    }

    /**
     * Sets the value of the addline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddline1(String value) {
        this.addline1 = value;
    }

    /**
     * Gets the value of the addline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddline2() {
        return addline2;
    }

    /**
     * Sets the value of the addline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddline2(String value) {
        this.addline2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

	@Override
	public String toString() {
		return "Address [addline1=" + addline1 + ", addline2=" + addline2 + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}

    
}