/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TableEnumOrId
 */
public enum TableEnumOrIdEnum {

    // Account
    ACCOUNT("Account"),
    // Asset
    ASSET("Asset"),
    // Campaign
    CAMPAIGN("Campaign"),
    // Case
    CASE("Case"),
    // Contact
    CONTACT("Contact"),
    // Contract
    CONTRACT("Contract"),
    // KnowledgeArticle
    KNOWLEDGEARTICLE("KnowledgeArticle"),
    // KnowledgeArticleVersion
    KNOWLEDGEARTICLEVERSION("KnowledgeArticleVersion"),
    // Lead
    LEAD("Lead"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // Order
    ORDER("Order"),
    // Product2
    PRODUCT2("Product2"),
    // Solution
    SOLUTION("Solution"),
    // WorkCoaching
    WORKCOACHING("WorkCoaching"),
    // WorkFeedback
    WORKFEEDBACK("WorkFeedback"),
    // WorkFeedbackQuestion
    WORKFEEDBACKQUESTION("WorkFeedbackQuestion"),
    // WorkFeedbackQuestionSet
    WORKFEEDBACKQUESTIONSET("WorkFeedbackQuestionSet"),
    // WorkFeedbackRequest
    WORKFEEDBACKREQUEST("WorkFeedbackRequest"),
    // WorkGoal
    WORKGOAL("WorkGoal"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private TableEnumOrIdEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TableEnumOrIdEnum fromValue(String value) {
        for (TableEnumOrIdEnum e : TableEnumOrIdEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
