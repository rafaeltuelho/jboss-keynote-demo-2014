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
 * Salesforce DTO for SObject ContentDocument
 */
@XStreamAlias("ContentDocument")
public class ContentDocument extends AbstractSObjectBase {

    // IsArchived
    private Boolean IsArchived;

    @JsonProperty("IsArchived")
    public Boolean getIsArchived() {
        return this.IsArchived;
    }

    @JsonProperty("IsArchived")
    public void setIsArchived(Boolean IsArchived) {
        this.IsArchived = IsArchived;
    }

    // ArchivedById
    private String ArchivedById;

    @JsonProperty("ArchivedById")
    public String getArchivedById() {
        return this.ArchivedById;
    }

    @JsonProperty("ArchivedById")
    public void setArchivedById(String ArchivedById) {
        this.ArchivedById = ArchivedById;
    }

    // ArchivedDate
    private org.joda.time.DateTime ArchivedDate;

    @JsonProperty("ArchivedDate")
    public org.joda.time.DateTime getArchivedDate() {
        return this.ArchivedDate;
    }

    @JsonProperty("ArchivedDate")
    public void setArchivedDate(org.joda.time.DateTime ArchivedDate) {
        this.ArchivedDate = ArchivedDate;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // PublishStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private PublishStatusEnum PublishStatus;

    @JsonProperty("PublishStatus")
    public PublishStatusEnum getPublishStatus() {
        return this.PublishStatus;
    }

    @JsonProperty("PublishStatus")
    public void setPublishStatus(PublishStatusEnum PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    // LatestPublishedVersionId
    private String LatestPublishedVersionId;

    @JsonProperty("LatestPublishedVersionId")
    public String getLatestPublishedVersionId() {
        return this.LatestPublishedVersionId;
    }

    @JsonProperty("LatestPublishedVersionId")
    public void setLatestPublishedVersionId(String LatestPublishedVersionId) {
        this.LatestPublishedVersionId = LatestPublishedVersionId;
    }

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

}
