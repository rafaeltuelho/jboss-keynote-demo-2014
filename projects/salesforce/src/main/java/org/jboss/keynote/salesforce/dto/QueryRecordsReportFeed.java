/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ReportFeed
 */
public class QueryRecordsReportFeed extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ReportFeed> records;

    public List<ReportFeed> getRecords() {
        return records;
    }

    public void setRecords(List<ReportFeed> records) {
        this.records = records;
    }
}
