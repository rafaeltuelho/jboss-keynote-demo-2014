/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject PushTopic
 */
@XStreamAlias("PushTopic")
public class PushTopic extends AbstractSObjectBase {

    // Query
    private String Query;

    @JsonProperty("Query")
    public String getQuery() {
        return this.Query;
    }

    @JsonProperty("Query")
    public void setQuery(String Query) {
        this.Query = Query;
    }

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // NotifyForFields
    @XStreamConverter(PicklistEnumConverter.class)
    private NotifyForFieldsEnum NotifyForFields;

    @JsonProperty("NotifyForFields")
    public NotifyForFieldsEnum getNotifyForFields() {
        return this.NotifyForFields;
    }

    @JsonProperty("NotifyForFields")
    public void setNotifyForFields(NotifyForFieldsEnum NotifyForFields) {
        this.NotifyForFields = NotifyForFields;
    }

    // NotifyForOperations
    @XStreamConverter(PicklistEnumConverter.class)
    private NotifyForOperationsEnum NotifyForOperations;

    @JsonProperty("NotifyForOperations")
    public NotifyForOperationsEnum getNotifyForOperations() {
        return this.NotifyForOperations;
    }

    @JsonProperty("NotifyForOperations")
    public void setNotifyForOperations(NotifyForOperationsEnum NotifyForOperations) {
        this.NotifyForOperations = NotifyForOperations;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
