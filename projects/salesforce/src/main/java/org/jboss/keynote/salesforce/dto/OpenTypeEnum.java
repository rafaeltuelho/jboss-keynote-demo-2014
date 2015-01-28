/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpenType
 */
public enum OpenTypeEnum {

    // newWindow
    NEWWINDOW("newWindow"),
    // sidebar
    SIDEBAR("sidebar"),
    // noSidebar
    NOSIDEBAR("noSidebar"),
    // replace
    REPLACE("replace"),
    // onClickJavaScript
    ONCLICKJAVASCRIPT("onClickJavaScript");

    final String value;

    private OpenTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpenTypeEnum fromValue(String value) {
        for (OpenTypeEnum e : OpenTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}