/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject HashtagDefinition
 */
@XStreamAlias("HashtagDefinition")
public class HashtagDefinition extends AbstractSObjectBase {

    // NameNorm
    private String NameNorm;

    @JsonProperty("NameNorm")
    public String getNameNorm() {
        return this.NameNorm;
    }

    @JsonProperty("NameNorm")
    public void setNameNorm(String NameNorm) {
        this.NameNorm = NameNorm;
    }

    // HashtagCount
    private Integer HashtagCount;

    @JsonProperty("HashtagCount")
    public Integer getHashtagCount() {
        return this.HashtagCount;
    }

    @JsonProperty("HashtagCount")
    public void setHashtagCount(Integer HashtagCount) {
        this.HashtagCount = HashtagCount;
    }

}
