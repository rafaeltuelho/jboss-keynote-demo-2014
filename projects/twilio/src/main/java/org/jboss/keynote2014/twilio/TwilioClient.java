package org.jboss.keynote2014.twilio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.jboss.keynote2014.json.utils.HttpClientUtils;
import org.jboss.keynote2014.json.utils.JSONClientUtils;
import org.jboss.keynote2014.json.utils.JSONResponse;

public class TwilioClient
{
    // Login credentials
    private static final String ACCOUNT_SID = "AC25e1a1ff2c73be43271d838d7a9fc4bf";
    private static final String AUTH_TOKEN = "d84a5e200acc17c7d9edc3a473d1067c";
    // SMS send message endpoint
    private static final String ENDPOINT = "https://api.twilio.com/2010-04-01/Accounts/" + ACCOUNT_SID + "/Messages.json";
    // Twilio Mobile Numbers
    private static final String[] MOBILE_NUMBERS = { "+18559761671" };
    private static final int NUM_MOBILE_NUMBERS = MOBILE_NUMBERS.length;
    private static final String MY_MOBILE_NUMBER = "+557181813636";
    
    // JSON keys
    private static final String TO = "To";
    private static final String FROM = "From";
    private static final String BODY = "Body";
    // Mobile Number counter
    private static final AtomicInteger COUNTER = new AtomicInteger(0);
    
    public boolean sendSMS(final String to, final String body)
        throws ClientProtocolException, IOException
    {
        // Truncate the message to 140 characters
        final String message;
        if (body.length() > 140) {
            message = body.substring(0, 140) + " ...";
        } else {
            message = body;
        }
        
        final String authorisation = HttpClientUtils.getHttpClientUtils().generateAuthorisation(ACCOUNT_SID, AUTH_TOKEN);
        
        final Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpClientUtils.AUTHORIZATION, HttpClientUtils.BASIC + " " + authorisation);
        
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(TO, to);
        final int next = (COUNTER.getAndAdd(1) % NUM_MOBILE_NUMBERS);
        
        parameters.put(FROM, MOBILE_NUMBERS[next]);
        parameters.put(BODY,  message);
        
        JSONResponse execute = JSONClientUtils.execute(ENDPOINT, headers, parameters);
        if( execute.getStatusCode() != HttpStatus.SC_CREATED) {
            System.out.println("Failed sending SMS to " + to);
            System.out.println("  Message: " + execute.getPayloadAsJSONObject().get("message"));
            System.out.println("   Status: " + execute.getPayloadAsJSONObject().get("status"));
            System.out.println("More info: " + execute.getPayloadAsJSONObject().get("more_info"));
            System.out.println("     Code: " + execute.getPayloadAsJSONObject().get("code"));
            return  false;
        } else {
            System.out.println("Message sent to " + to);
            return true;
        }
    }


    public static void main(final String[] args)
        throws ClientProtocolException, IOException
    {
        final TwilioClient client = new TwilioClient();
//        final String[] text = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth" };
        final String[] text = { "First", "Second" };
        for (int count = 0 ; count < text.length ; count++) {
            if (client.sendSMS(MY_MOBILE_NUMBER, text[count] + " test message sent from all twilio numbers")) {
                System.out.println("Success");
            } else {
                System.out.println("Failed to send SMS");
            }
        }
    }
}
