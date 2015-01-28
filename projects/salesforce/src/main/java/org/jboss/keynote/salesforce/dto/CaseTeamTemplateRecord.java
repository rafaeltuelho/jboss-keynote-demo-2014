/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject CaseTeamTemplateRecord
 */
@XStreamAlias("CaseTeamTemplateRecord")
public class CaseTeamTemplateRecord extends AbstractSObjectBase {

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

    // TeamTemplateId
    private String TeamTemplateId;

    @JsonProperty("TeamTemplateId")
    public String getTeamTemplateId() {
        return this.TeamTemplateId;
    }

    @JsonProperty("TeamTemplateId")
    public void setTeamTemplateId(String TeamTemplateId) {
        this.TeamTemplateId = TeamTemplateId;
    }

}