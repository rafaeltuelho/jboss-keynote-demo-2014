/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PeriodPrefix
 */
public enum PeriodPrefixEnum {

    // Period
    PERIOD("Period"),
    // FP
    FP("FP"),
    // P
    P("P"),
    // Month
    MONTH("Month");

    final String value;

    private PeriodPrefixEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PeriodPrefixEnum fromValue(String value) {
        for (PeriodPrefixEnum e : PeriodPrefixEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
