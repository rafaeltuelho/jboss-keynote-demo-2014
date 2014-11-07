/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ControllerType
 */
public enum ControllerTypeEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 4
    _4("4"),
    // 2
    _2("2"),
    // 3
    _3("3"),
    // 5
    _5("5");

    final String value;

    private ControllerTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ControllerTypeEnum fromValue(String value) {
        for (ControllerTypeEnum e : ControllerTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
