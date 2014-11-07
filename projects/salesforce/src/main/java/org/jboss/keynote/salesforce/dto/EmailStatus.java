/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject EmailStatus
 */
@XStreamAlias("EmailStatus")
public class EmailStatus extends AbstractSObjectBase {

    // TaskId
    private String TaskId;

    @JsonProperty("TaskId")
    public String getTaskId() {
        return this.TaskId;
    }

    @JsonProperty("TaskId")
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    // WhoId
    private String WhoId;

    @JsonProperty("WhoId")
    public String getWhoId() {
        return this.WhoId;
    }

    @JsonProperty("WhoId")
    public void setWhoId(String WhoId) {
        this.WhoId = WhoId;
    }

    // TimesOpened
    private Integer TimesOpened;

    @JsonProperty("TimesOpened")
    public Integer getTimesOpened() {
        return this.TimesOpened;
    }

    @JsonProperty("TimesOpened")
    public void setTimesOpened(Integer TimesOpened) {
        this.TimesOpened = TimesOpened;
    }

    // FirstOpenDate
    private org.joda.time.DateTime FirstOpenDate;

    @JsonProperty("FirstOpenDate")
    public org.joda.time.DateTime getFirstOpenDate() {
        return this.FirstOpenDate;
    }

    @JsonProperty("FirstOpenDate")
    public void setFirstOpenDate(org.joda.time.DateTime FirstOpenDate) {
        this.FirstOpenDate = FirstOpenDate;
    }

    // LastOpenDate
    private org.joda.time.DateTime LastOpenDate;

    @JsonProperty("LastOpenDate")
    public org.joda.time.DateTime getLastOpenDate() {
        return this.LastOpenDate;
    }

    @JsonProperty("LastOpenDate")
    public void setLastOpenDate(org.joda.time.DateTime LastOpenDate) {
        this.LastOpenDate = LastOpenDate;
    }

    // EmailTemplateName
    private String EmailTemplateName;

    @JsonProperty("EmailTemplateName")
    public String getEmailTemplateName() {
        return this.EmailTemplateName;
    }

    @JsonProperty("EmailTemplateName")
    public void setEmailTemplateName(String EmailTemplateName) {
        this.EmailTemplateName = EmailTemplateName;
    }

}
