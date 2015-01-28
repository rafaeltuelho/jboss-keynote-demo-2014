/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SobjectType
 */
public enum SobjectTypeEnum {

    // Account
    ACCOUNT("Account"),
    // Asset
    ASSET("Asset"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CampaignMember
    CAMPAIGNMEMBER("CampaignMember"),
    // Case
    CASE("Case"),
    // Contact
    CONTACT("Contact"),
    // Contract
    CONTRACT("Contract"),
    // Event
    EVENT("Event"),
    // Idea
    IDEA("Idea"),
    // Lead
    LEAD("Lead"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // OpportunityLineItem
    OPPORTUNITYLINEITEM("OpportunityLineItem"),
    // Order
    ORDER("Order"),
    // OrderItem
    ORDERITEM("OrderItem"),
    // Pricebook2
    PRICEBOOK2("Pricebook2"),
    // PricebookEntry
    PRICEBOOKENTRY("PricebookEntry"),
    // Product2
    PRODUCT2("Product2"),
    // Solution
    SOLUTION("Solution"),
    // Task
    TASK("Task"),
    // User
    USER("User"),
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
    // WorkGoalCollaborator
    WORKGOALCOLLABORATOR("WorkGoalCollaborator"),
    // WorkGoalLink
    WORKGOALLINK("WorkGoalLink"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private SobjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SobjectTypeEnum fromValue(String value) {
        for (SobjectTypeEnum e : SobjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}