package org.jboss.keynote.processors;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.util.CamelLogger;
import org.jboss.keynote.model.User;
import org.jboss.keynote.salesforce.dto.Contact;
import org.jboss.keynote.salesforce.dto.QueryRecordsContact;

import java.util.List;


/**
 * SF Object Query result processor, which used for parsing results from Salesfoce and convert them to string if desired format
 *
 * @author: Rafael T. C. Soares (rsoares@redhat.com)
 */
public class SObjectQueryResultProcessor implements Processor {
    private final CamelLogger logger = new CamelLogger(SObjectQueryResultProcessor.class.getCanonicalName(), LoggingLevel.INFO);

    @Override
    public void process(Exchange exchange) throws Exception {
        Object response = exchange.getIn().getBody();
        User user = null;
        
        StringBuilder sb = new StringBuilder();
        if(response instanceof QueryRecordsContact){
        	QueryRecordsContact queryRecordsContact = (QueryRecordsContact) response;
        	List<Contact> contacts = queryRecordsContact.getRecords();
        	
        	if (contacts != null && contacts.size() > 0){
        		Contact contact  = contacts.get(0);
        		logger.log("Contact found in Sales Force: " + contact.getFirstName() + "/" + contact.getId());
        		logger.log(contact.toString());
        		
        		user = new User();
        		user.setDept(contact.getDepartment());
        		user.setEmail(contact.getEmail());
        		user.setFirstName(contact.getFirstName());
        		user.setId(contact.getId());
        		user.setLastName(contact.getLastName());
        		user.setMobilePhone(contact.getMobilePhone());
        	}
        	else{
        		logger.log("contact not found in Sales Force...");        		
        	}
        	
            exchange.getOut().setBody(user);
        }

    }

}
