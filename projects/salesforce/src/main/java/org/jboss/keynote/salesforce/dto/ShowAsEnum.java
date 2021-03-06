/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ShowAs
 */
public enum ShowAsEnum {

    // Busy
    BUSY("Busy"),
    // OutOfOffice
    OUTOFOFFICE("OutOfOffice"),
    // Free
    FREE("Free");

    final String value;

    private ShowAsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ShowAsEnum fromValue(String value) {
        for (ShowAsEnum e : ShowAsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
