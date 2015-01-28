/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type EmailTemplate
 */
public class QueryRecordsEmailTemplate extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<EmailTemplate> records;

    public List<EmailTemplate> getRecords() {
        return records;
    }

    public void setRecords(List<EmailTemplate> records) {
        this.records = records;
    }
}