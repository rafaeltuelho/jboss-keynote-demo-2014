/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LanguageLocaleKey
 */
public enum LanguageLocaleKeyEnum {

    // en_US
    EN_US("en_US"),
    // de
    DE("de"),
    // es
    ES("es"),
    // fr
    FR("fr"),
    // it
    IT("it"),
    // ja
    JA("ja"),
    // sv
    SV("sv"),
    // ko
    KO("ko"),
    // zh_TW
    ZH_TW("zh_TW"),
    // zh_CN
    ZH_CN("zh_CN"),
    // pt_BR
    PT_BR("pt_BR"),
    // nl_NL
    NL_NL("nl_NL"),
    // da
    DA("da"),
    // th
    TH("th"),
    // fi
    FI("fi"),
    // ru
    RU("ru"),
    // es_MX
    ES_MX("es_MX");

    final String value;

    private LanguageLocaleKeyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LanguageLocaleKeyEnum fromValue(String value) {
        for (LanguageLocaleKeyEnum e : LanguageLocaleKeyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}