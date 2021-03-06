//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.27 at 07:13:38 PM EST 
//


package com.netcrest.pado.internal.config.dtd.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
    "gemfireParent",
    "gemfireClient",
    "dqueue",
    "description"
})
@XmlRootElement(name = "gemfire")
public class Gemfire {

    @XmlAttribute(name = "locators")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String locators;
    @XmlAttribute(name = "is-parent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isParent;
    @XmlAttribute(name = "init-delay")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String initDelay;
    @XmlAttribute(name = "grid-info-update-delay")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gridInfoUpdateDelay;
    @XmlAttribute(name = "grid-info-update-interval")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gridInfoUpdateInterval;
    @XmlAttribute(name = "root-region-path")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rootRegionPath;
    @XmlAttribute(name = "router-region-total-num-buckets")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String routerRegionTotalNumBuckets;
    @XmlAttribute(name = "pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poolName;
    @XmlAttribute(name = "shared-pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedPoolName;
    @XmlAttribute(name = "index-matrix-pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indexMatrixPoolName;
    @XmlElement(name = "gemfire-parent")
    protected List<GemfireParent> gemfireParent;
    @XmlElement(name = "gemfire-client")
    protected GemfireClient gemfireClient;
    protected List<Dqueue> dqueue;
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
     * Gets the value of the isParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsParent() {
        if (isParent == null) {
            return "false";
        } else {
            return isParent;
        }
    }

    /**
     * Sets the value of the isParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsParent(String value) {
        this.isParent = value;
    }

    /**
     * Gets the value of the initDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitDelay() {
        if (initDelay == null) {
            return "5000";
        } else {
            return initDelay;
        }
    }

    /**
     * Sets the value of the initDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitDelay(String value) {
        this.initDelay = value;
    }

    /**
     * Gets the value of the gridInfoUpdateDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridInfoUpdateDelay() {
        if (gridInfoUpdateDelay == null) {
            return "10000";
        } else {
            return gridInfoUpdateDelay;
        }
    }

    /**
     * Sets the value of the gridInfoUpdateDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridInfoUpdateDelay(String value) {
        this.gridInfoUpdateDelay = value;
    }

    /**
     * Gets the value of the gridInfoUpdateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridInfoUpdateInterval() {
        if (gridInfoUpdateInterval == null) {
            return "60000";
        } else {
            return gridInfoUpdateInterval;
        }
    }

    /**
     * Sets the value of the gridInfoUpdateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridInfoUpdateInterval(String value) {
        this.gridInfoUpdateInterval = value;
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
     * Gets the value of the routerRegionTotalNumBuckets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterRegionTotalNumBuckets() {
        if (routerRegionTotalNumBuckets == null) {
            return "113";
        } else {
            return routerRegionTotalNumBuckets;
        }
    }

    /**
     * Sets the value of the routerRegionTotalNumBuckets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterRegionTotalNumBuckets(String value) {
        this.routerRegionTotalNumBuckets = value;
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
     * Gets the value of the gemfireParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gemfireParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGemfireParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GemfireParent }
     * 
     * 
     */
    public List<GemfireParent> getGemfireParent() {
        if (gemfireParent == null) {
            gemfireParent = new ArrayList<GemfireParent>();
        }
        return this.gemfireParent;
    }

    /**
     * Gets the value of the gemfireClient property.
     * 
     * @return
     *     possible object is
     *     {@link GemfireClient }
     *     
     */
    public GemfireClient getGemfireClient() {
        return gemfireClient;
    }

    /**
     * Sets the value of the gemfireClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link GemfireClient }
     *     
     */
    public void setGemfireClient(GemfireClient value) {
        this.gemfireClient = value;
    }

    /**
     * Gets the value of the dqueue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dqueue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDqueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dqueue }
     * 
     * 
     */
    public List<Dqueue> getDqueue() {
        if (dqueue == null) {
            dqueue = new ArrayList<Dqueue>();
        }
        return this.dqueue;
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
