/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccountSource
 */
public enum AccountSourceEnum {

    // Web
    WEB("Web"),
    // Phone Inquiry
    PHONE_INQUIRY("Phone Inquiry"),
    // Partner Referral
    PARTNER_REFERRAL("Partner Referral"),
    // Purchased List
    PURCHASED_LIST("Purchased List"),
    // Other
    OTHER("Other");

    final String value;

    private AccountSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccountSourceEnum fromValue(String value) {
        for (AccountSourceEnum e : AccountSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
