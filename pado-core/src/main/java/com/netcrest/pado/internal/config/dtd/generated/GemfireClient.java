//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 04:41:05 PM EDT 
//


package com.netcrest.pado.internal.config.dtd.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description"
})
@XmlRootElement(name = "gemfire-client")
public class GemfireClient {

    @XmlAttribute(name = "locators")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String locators;
    @XmlAttribute(name = "pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poolName;
    @XmlAttribute(name = "shared-pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedPoolName;
    @XmlAttribute(name = "index-matrix-pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indexMatrixPoolName;
    @XmlAttribute(name = "pool-single-hop-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String poolSingleHopEnabled;
    @XmlAttribute(name = "pool-multiuser-authentication-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String poolMultiuserAuthenticationEnabled;
    protected String description;

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
     * Gets the value of the sharedPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedPoolName() {
        return sharedPoolName;
    }

    /**
     * Sets the value of the sharedPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedPoolName(String value) {
        this.sharedPoolName = value;
    }

    /**
     * Gets the value of the indexMatrixPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexMatrixPoolName() {
        return indexMatrixPoolName;
    }

    /**
     * Sets the value of the indexMatrixPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexMatrixPoolName(String value) {
        this.indexMatrixPoolName = value;
    }

    /**
     * Gets the value of the poolSingleHopEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolSingleHopEnabled() {
        if (poolSingleHopEnabled == null) {
            return "false";
        } else {
            return poolSingleHopEnabled;
        }
    }

    /**
     * Sets the value of the poolSingleHopEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolSingleHopEnabled(String value) {
        this.poolSingleHopEnabled = value;
    }

    /**
     * Gets the value of the poolMultiuserAuthenticationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolMultiuserAuthenticationEnabled() {
        if (poolMultiuserAuthenticationEnabled == null) {
            return "false";
        } else {
            return poolMultiuserAuthenticationEnabled;
        }
    }

    /**
     * Sets the value of the poolMultiuserAuthenticationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolMultiuserAuthenticationEnabled(String value) {
        this.poolMultiuserAuthenticationEnabled = value;
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
