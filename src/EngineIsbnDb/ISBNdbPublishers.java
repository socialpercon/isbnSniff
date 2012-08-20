//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.19 at 07:10:59 PM BST 
//


package EngineIsbnDb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PublisherList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PublisherData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Categories">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Category">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="category_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="publisher_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="total_results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="page_size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="page_number" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="shown_results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="server_time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisherList"
})
@XmlRootElement(name = "ISBNdb")
public class ISBNdbPublishers {

    @XmlElement(name = "PublisherList", required = true)
    protected ISBNdbPublishers.PublisherList publisherList;
    @XmlAttribute(name = "server_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverTime;

    /**
     * Gets the value of the publisherList property.
     * 
     * @return
     *     possible object is
     *     {@link ISBNdbPublishers.PublisherList }
     *     
     */
    public ISBNdbPublishers.PublisherList getPublisherList() {
        return publisherList;
    }

    /**
     * Sets the value of the publisherList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISBNdbPublishers.PublisherList }
     *     
     */
    public void setPublisherList(ISBNdbPublishers.PublisherList value) {
        this.publisherList = value;
    }

    /**
     * Gets the value of the serverTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerTime() {
        return serverTime;
    }

    /**
     * Sets the value of the serverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerTime(XMLGregorianCalendar value) {
        this.serverTime = value;
    }


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
     *         &lt;element name="PublisherData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Categories">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Category">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="category_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="publisher_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="total_results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="page_size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="page_number" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="shown_results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publisherData"
    })
    public static class PublisherList {

        @XmlElement(name = "PublisherData", required = true)
        protected ISBNdbPublishers.PublisherList.PublisherData publisherData;
        @XmlAttribute(name = "total_results", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short totalResults;
        @XmlAttribute(name = "page_size", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short pageSize;
        @XmlAttribute(name = "page_number", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short pageNumber;
        @XmlAttribute(name = "shown_results", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short shownResults;

        /**
         * Gets the value of the publisherData property.
         * 
         * @return
         *     possible object is
         *     {@link ISBNdbPublishers.PublisherList.PublisherData }
         *     
         */
        public ISBNdbPublishers.PublisherList.PublisherData getPublisherData() {
            return publisherData;
        }

        /**
         * Sets the value of the publisherData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ISBNdbPublishers.PublisherList.PublisherData }
         *     
         */
        public void setPublisherData(ISBNdbPublishers.PublisherList.PublisherData value) {
            this.publisherData = value;
        }

        /**
         * Gets the value of the totalResults property.
         * 
         */
        public short getTotalResults() {
            return totalResults;
        }

        /**
         * Sets the value of the totalResults property.
         * 
         */
        public void setTotalResults(short value) {
            this.totalResults = value;
        }

        /**
         * Gets the value of the pageSize property.
         * 
         */
        public short getPageSize() {
            return pageSize;
        }

        /**
         * Sets the value of the pageSize property.
         * 
         */
        public void setPageSize(short value) {
            this.pageSize = value;
        }

        /**
         * Gets the value of the pageNumber property.
         * 
         */
        public short getPageNumber() {
            return pageNumber;
        }

        /**
         * Sets the value of the pageNumber property.
         * 
         */
        public void setPageNumber(short value) {
            this.pageNumber = value;
        }

        /**
         * Gets the value of the shownResults property.
         * 
         */
        public short getShownResults() {
            return shownResults;
        }

        /**
         * Sets the value of the shownResults property.
         * 
         */
        public void setShownResults(short value) {
            this.shownResults = value;
        }


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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Categories">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Category">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="category_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="publisher_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "categories"
        })
        public static class PublisherData {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Categories", required = true)
            protected ISBNdbPublishers.PublisherList.PublisherData.Categories categories;
            @XmlAttribute(name = "publisher_id", required = true)
            protected String publisherId;

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
             * Gets the value of the categories property.
             * 
             * @return
             *     possible object is
             *     {@link ISBNdbPublishers.PublisherList.PublisherData.Categories }
             *     
             */
            public ISBNdbPublishers.PublisherList.PublisherData.Categories getCategories() {
                return categories;
            }

            /**
             * Sets the value of the categories property.
             * 
             * @param value
             *     allowed object is
             *     {@link ISBNdbPublishers.PublisherList.PublisherData.Categories }
             *     
             */
            public void setCategories(ISBNdbPublishers.PublisherList.PublisherData.Categories value) {
                this.categories = value;
            }

            /**
             * Gets the value of the publisherId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublisherId() {
                return publisherId;
            }

            /**
             * Sets the value of the publisherId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublisherId(String value) {
                this.publisherId = value;
            }


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
             *         &lt;element name="Category">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="category_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "category"
            })
            public static class Categories {

                @XmlElement(name = "Category", required = true)
                protected ISBNdbPublishers.PublisherList.PublisherData.Categories.Category category;

                /**
                 * Gets the value of the category property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ISBNdbPublishers.PublisherList.PublisherData.Categories.Category }
                 *     
                 */
                public ISBNdbPublishers.PublisherList.PublisherData.Categories.Category getCategory() {
                    return category;
                }

                /**
                 * Sets the value of the category property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ISBNdbPublishers.PublisherList.PublisherData.Categories.Category }
                 *     
                 */
                public void setCategory(ISBNdbPublishers.PublisherList.PublisherData.Categories.Category value) {
                    this.category = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="category_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Category {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "category_id", required = true)
                    protected String categoryId;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the categoryId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategoryId() {
                        return categoryId;
                    }

                    /**
                     * Sets the value of the categoryId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategoryId(String value) {
                        this.categoryId = value;
                    }

                }

            }

        }

    }

}
