//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.27 at 11:19:52 AM EDT 
//


package com.netcrest.pado.internal.config.dtd.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description"
})
@XmlRootElement(name = "gemfire-parent")
public class GemfireParent {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "locators", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String locators;
    @XmlAttribute(name = "root-region-path")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rootRegionPath;
    @XmlAttribute(name = "pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poolName;
    protected String description;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocators() {
        return locators;
    }

    /**
     * Sets the value of the locators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocators(String value) {
        this.locators = value;
    }

    /**
     * Gets the value of the rootRegionPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootRegionPath() {
        return rootRegionPath;
    }

    /**
     * Sets the value of the rootRegionPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootRegionPath(String value) {
        this.rootRegionPath = value;
    }

    /**
     * Gets the value of the poolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Sets the value of the poolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolName(String value) {
        this.poolName = value;
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

}
