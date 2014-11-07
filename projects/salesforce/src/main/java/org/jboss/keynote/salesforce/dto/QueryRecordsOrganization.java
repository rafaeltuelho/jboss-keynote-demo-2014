/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Organization
 */
public class QueryRecordsOrganization extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Organization> records;

    public List<Organization> getRecords() {
        return records;
    }

    public void setRecords(List<Organization> records) {
        this.records = records;
    }
}
