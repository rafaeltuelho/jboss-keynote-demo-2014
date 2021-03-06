/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MaxAccessLevel
 */
public enum MaxAccessLevelEnum {

    // None
    NONE("None"),
    // Read
    READ("Read"),
    // Edit
    EDIT("Edit"),
    // Delete
    DELETE("Delete"),
    // Transfer
    TRANSFER("Transfer"),
    // All
    ALL("All");

    final String value;

    private MaxAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MaxAccessLevelEnum fromValue(String value) {
        for (MaxAccessLevelEnum e : MaxAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
