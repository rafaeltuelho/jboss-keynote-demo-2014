/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type FeedComment
 */
public class QueryRecordsFeedComment extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<FeedComment> records;

    public List<FeedComment> getRecords() {
        return records;
    }

    public void setRecords(List<FeedComment> records) {
        this.records = records;
    }
}
