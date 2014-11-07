/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PortalType
 */
public enum PortalTypeEnum {

    // None
    NONE("None"),
    // CustomerPortal
    CUSTOMERPORTAL("CustomerPortal"),
    // Partner
    PARTNER("Partner");

    final String value;

    private PortalTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PortalTypeEnum fromValue(String value) {
        for (PortalTypeEnum e : PortalTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
