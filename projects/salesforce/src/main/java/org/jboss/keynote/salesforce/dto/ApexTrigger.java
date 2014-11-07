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
 * Salesforce DTO for SObject ApexTrigger
 */
@XStreamAlias("ApexTrigger")
public class ApexTrigger extends AbstractSObjectBase {

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // TableEnumOrId
    @XStreamConverter(PicklistEnumConverter.class)
    private TableEnumOrIdEnum TableEnumOrId;

    @JsonProperty("TableEnumOrId")
    public TableEnumOrIdEnum getTableEnumOrId() {
        return this.TableEnumOrId;
    }

    @JsonProperty("TableEnumOrId")
    public void setTableEnumOrId(TableEnumOrIdEnum TableEnumOrId) {
        this.TableEnumOrId = TableEnumOrId;
    }

    // UsageBeforeInsert
    private Boolean UsageBeforeInsert;

    @JsonProperty("UsageBeforeInsert")
    public Boolean getUsageBeforeInsert() {
        return this.UsageBeforeInsert;
    }

    @JsonProperty("UsageBeforeInsert")
    public void setUsageBeforeInsert(Boolean UsageBeforeInsert) {
        this.UsageBeforeInsert = UsageBeforeInsert;
    }

    // UsageAfterInsert
    private Boolean UsageAfterInsert;

    @JsonProperty("UsageAfterInsert")
    public Boolean getUsageAfterInsert() {
        return this.UsageAfterInsert;
    }

    @JsonProperty("UsageAfterInsert")
    public void setUsageAfterInsert(Boolean UsageAfterInsert) {
        this.UsageAfterInsert = UsageAfterInsert;
    }

    // UsageBeforeUpdate
    private Boolean UsageBeforeUpdate;

    @JsonProperty("UsageBeforeUpdate")
    public Boolean getUsageBeforeUpdate() {
        return this.UsageBeforeUpdate;
    }

    @JsonProperty("UsageBeforeUpdate")
    public void setUsageBeforeUpdate(Boolean UsageBeforeUpdate) {
        this.UsageBeforeUpdate = UsageBeforeUpdate;
    }

    // UsageAfterUpdate
    private Boolean UsageAfterUpdate;

    @JsonProperty("UsageAfterUpdate")
    public Boolean getUsageAfterUpdate() {
        return this.UsageAfterUpdate;
    }

    @JsonProperty("UsageAfterUpdate")
    public void setUsageAfterUpdate(Boolean UsageAfterUpdate) {
        this.UsageAfterUpdate = UsageAfterUpdate;
    }

    // UsageBeforeDelete
    private Boolean UsageBeforeDelete;

    @JsonProperty("UsageBeforeDelete")
    public Boolean getUsageBeforeDelete() {
        return this.UsageBeforeDelete;
    }

    @JsonProperty("UsageBeforeDelete")
    public void setUsageBeforeDelete(Boolean UsageBeforeDelete) {
        this.UsageBeforeDelete = UsageBeforeDelete;
    }

    // UsageAfterDelete
    private Boolean UsageAfterDelete;

    @JsonProperty("UsageAfterDelete")
    public Boolean getUsageAfterDelete() {
        return this.UsageAfterDelete;
    }

    @JsonProperty("UsageAfterDelete")
    public void setUsageAfterDelete(Boolean UsageAfterDelete) {
        this.UsageAfterDelete = UsageAfterDelete;
    }

    // UsageIsBulk
    private Boolean UsageIsBulk;

    @JsonProperty("UsageIsBulk")
    public Boolean getUsageIsBulk() {
        return this.UsageIsBulk;
    }

    @JsonProperty("UsageIsBulk")
    public void setUsageIsBulk(Boolean UsageIsBulk) {
        this.UsageIsBulk = UsageIsBulk;
    }

    // UsageAfterUndelete
    private Boolean UsageAfterUndelete;

    @JsonProperty("UsageAfterUndelete")
    public Boolean getUsageAfterUndelete() {
        return this.UsageAfterUndelete;
    }

    @JsonProperty("UsageAfterUndelete")
    public void setUsageAfterUndelete(Boolean UsageAfterUndelete) {
        this.UsageAfterUndelete = UsageAfterUndelete;
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

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // IsValid
    private Boolean IsValid;

    @JsonProperty("IsValid")
    public Boolean getIsValid() {
        return this.IsValid;
    }

    @JsonProperty("IsValid")
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    // BodyCrc
    private Double BodyCrc;

    @JsonProperty("BodyCrc")
    public Double getBodyCrc() {
        return this.BodyCrc;
    }

    @JsonProperty("BodyCrc")
    public void setBodyCrc(Double BodyCrc) {
        this.BodyCrc = BodyCrc;
    }

    // Body
    private String Body;

    @JsonProperty("Body")
    public String getBody() {
        return this.Body;
    }

    @JsonProperty("Body")
    public void setBody(String Body) {
        this.Body = Body;
    }

    // LengthWithoutComments
    private Integer LengthWithoutComments;

    @JsonProperty("LengthWithoutComments")
    public Integer getLengthWithoutComments() {
        return this.LengthWithoutComments;
    }

    @JsonProperty("LengthWithoutComments")
    public void setLengthWithoutComments(Integer LengthWithoutComments) {
        this.LengthWithoutComments = LengthWithoutComments;
    }

}
