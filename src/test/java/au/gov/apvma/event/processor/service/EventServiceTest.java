/**
 * Copyright (c) APVMA, 2013.
 */
package au.gov.apvma.event.processor.service;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.junit.Assert;
import org.junit.Test;

import au.gov.apvma.event.processor.model.gen.CcTxRequest;
import au.gov.apvma.event.processor.service.impl.EventServiceImpl;

/**
 * @author peter
 *
 */
public class EventServiceTest {

	/**
	 * @param ccTxRequest
	 */
	@Test
	public void registerEvent() {
		
		EventService eventService = new EventServiceImpl();
		CcTxRequest ccTxRequest = new CcTxRequest();
		ccTxRequest.setId(1);
		ccTxRequest.setTxnId(1);
		
		try {
			ccTxRequest.setCreatedAt(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
			ccTxRequest.setFromUser("pete");
			eventService.registerEvent(ccTxRequest);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
