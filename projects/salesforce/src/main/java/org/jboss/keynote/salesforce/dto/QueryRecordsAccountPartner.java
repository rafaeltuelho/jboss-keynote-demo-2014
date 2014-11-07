/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type AccountPartner
 */
public class QueryRecordsAccountPartner extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<AccountPartner> records;

    public List<AccountPartner> getRecords() {
        return records;
    }

    public void setRecords(List<AccountPartner> records) {
        this.records = records;
    }
}
