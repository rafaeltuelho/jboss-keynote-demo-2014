/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccessType
 */
public enum AccessTypeEnum {

    // Shared
    SHARED("Shared"),
    // Public
    PUBLIC("Public"),
    // Hidden
    HIDDEN("Hidden"),
    // PublicInternal
    PUBLICINTERNAL("PublicInternal");

    final String value;

    private AccessTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccessTypeEnum fromValue(String value) {
        for (AccessTypeEnum e : AccessTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
