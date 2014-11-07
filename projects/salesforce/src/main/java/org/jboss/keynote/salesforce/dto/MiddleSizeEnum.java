/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MiddleSize
 */
public enum MiddleSizeEnum {

    // Narrow
    NARROW("Narrow"),
    // Medium
    MEDIUM("Medium"),
    // Wide
    WIDE("Wide");

    final String value;

    private MiddleSizeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MiddleSizeEnum fromValue(String value) {
        for (MiddleSizeEnum e : MiddleSizeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
