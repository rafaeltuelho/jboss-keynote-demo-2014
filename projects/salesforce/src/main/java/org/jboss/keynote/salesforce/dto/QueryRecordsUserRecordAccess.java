/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type UserRecordAccess
 */
public class QueryRecordsUserRecordAccess extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<UserRecordAccess> records;

    public List<UserRecordAccess> getRecords() {
        return records;
    }

    public void setRecords(List<UserRecordAccess> records) {
        this.records = records;
    }
}
