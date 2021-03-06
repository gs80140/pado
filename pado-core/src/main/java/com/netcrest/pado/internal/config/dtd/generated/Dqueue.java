//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.27 at 07:13:38 PM EST 
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
    "listener",
    "filter",
    "description"
})
@XmlRootElement(name = "dqueue")
public class Dqueue {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "preserve-order")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preserveOrder;
    @XmlAttribute(name = "total-num-buckets")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalNumBuckets;
    @XmlAttribute(name = "batch-size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String batchSize;
    @XmlAttribute(name = "batch-time-interval-in-msec")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String batchTimeIntervalInMsec;
    @XmlAttribute(name = "colocated-with")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colocatedWith;
    protected Listener listener;
    protected Filter filter;
    protected String description;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "client";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the preserveOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreserveOrder() {
        if (preserveOrder == null) {
            return "false";
        } else {
            return preserveOrder;
        }
    }

    /**
     * Sets the value of the preserveOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreserveOrder(String value) {
        this.preserveOrder = value;
    }

    /**
     * Gets the value of the totalNumBuckets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNumBuckets() {
        return totalNumBuckets;
    }

    /**
     * Sets the value of the totalNumBuckets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNumBuckets(String value) {
        this.totalNumBuckets = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchSize(String value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the batchTimeIntervalInMsec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchTimeIntervalInMsec() {
        return batchTimeIntervalInMsec;
    }

    /**
     * Sets the value of the batchTimeIntervalInMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchTimeIntervalInMsec(String value) {
        this.batchTimeIntervalInMsec = value;
    }

    /**
     * Gets the value of the colocatedWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColocatedWith() {
        return colocatedWith;
    }

    /**
     * Sets the value of the colocatedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColocatedWith(String value) {
        this.colocatedWith = value;
    }

    /**
     * Gets the value of the listener property.
     * 
     * @return
     *     possible object is
     *     {@link Listener }
     *     
     */
    public Listener getListener() {
        return listener;
    }

    /**
     * Sets the value of the listener property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listener }
     *     
     */
    public void setListener(Listener value) {
        this.listener = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
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
