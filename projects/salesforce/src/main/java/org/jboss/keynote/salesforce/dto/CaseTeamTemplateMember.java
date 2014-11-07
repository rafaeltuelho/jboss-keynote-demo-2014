/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject CaseTeamTemplateMember
 */
@XStreamAlias("CaseTeamTemplateMember")
public class CaseTeamTemplateMember extends AbstractSObjectBase {

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

    // MemberId
    private String MemberId;

    @JsonProperty("MemberId")
    public String getMemberId() {
        return this.MemberId;
    }

    @JsonProperty("MemberId")
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    // TeamRoleId
    private String TeamRoleId;

    @JsonProperty("TeamRoleId")
    public String getTeamRoleId() {
        return this.TeamRoleId;
    }

    @JsonProperty("TeamRoleId")
    public void setTeamRoleId(String TeamRoleId) {
        this.TeamRoleId = TeamRoleId;
    }

}
