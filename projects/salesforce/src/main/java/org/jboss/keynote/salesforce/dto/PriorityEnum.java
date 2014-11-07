/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Priority
 */
public enum PriorityEnum {

    // High
    HIGH("High"),
    // Normal
    NORMAL("Normal"),
    // Low
    LOW("Low");

    final String value;

    private PriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PriorityEnum fromValue(String value) {
        for (PriorityEnum e : PriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
