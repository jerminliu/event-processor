/**
 * Copyright (c) APVMA, 2013.
 */
package au.gov.apvma.event.processor.service.impl;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import au.gov.apvma.event.processor.service.EventService;

/**
 * @author peter
 *
 */
@MessageEndpoint
public class EventServiceImpl implements EventService {

	/* (non-Javadoc)
	 * @see au.gov.apvma.event.processor.service.EventService#registerEvent()
	 */
	@Override
	@ServiceActivator
	public void registerEvent() {
		// TODO Auto-generated method stub

	}

}
