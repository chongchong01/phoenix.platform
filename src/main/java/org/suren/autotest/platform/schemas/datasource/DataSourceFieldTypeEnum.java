//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.22 at 09:12:27 PM CST 
//


package org.suren.autotest.platform.schemas.datasource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataSourceFieldTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataSourceFieldTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="index"/>
 *     &lt;enumeration value="value"/>
 *     &lt;enumeration value="callback"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataSourceFieldTypeEnum")
@XmlEnum
public enum DataSourceFieldTypeEnum {


    /**
     * 
     * 						属性名为text。
     * 					
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * 
     * 						属性名为index。
     * 					
     * 
     */
    @XmlEnumValue("index")
    INDEX("index"),

    /**
     * 
     * 						属性名为value。
     * 					
     * 
     */
    @XmlEnumValue("value")
    VALUE("value"),

    /**
     * 
     * 						属性名为callback。
     * 					
     * 
     */
    @XmlEnumValue("callback")
    CALLBACK("callback");
    private final String value;

    DataSourceFieldTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataSourceFieldTypeEnum fromValue(String v) {
        for (DataSourceFieldTypeEnum c: DataSourceFieldTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
