/**
 * Copyright (c) APVMA, 2013.
 */
package au.gov.apvma.event.processor.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import au.gov.apvma.event.processor.service.EventService;

/**
 * @author peter
 *
 */
@MessageEndpoint
public class EventServiceImpl implements EventService {

	private static final Logger log = LoggerFactory.getLogger(EventService.class);
	
	/* (non-Javadoc)
	 * @see au.gov.apvma.event.processor.service.EventService#registerEvent()
	 */
	@Override
	@ServiceActivator
	public void registerEvent() {
		// TODO Auto-generated method stub

		log.info("-------------------------------------->>>>>>>>>>>  fired the event!!!!!!!!!");
	}

}
