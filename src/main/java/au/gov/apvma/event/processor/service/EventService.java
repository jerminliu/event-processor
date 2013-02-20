/**
 * Copyright (c) APVMA, 2013.
 */
package au.gov.apvma.event.processor.service;

import au.gov.apvma.event.processor.model.gen.CcTxRequest;

/**
 * A service that handles an event.
 * 
 * @author peter
 *
 */
public interface EventService {

	/**
	 * The event handler.
	 * 
	 * @param ccTxRequest The message that describes the event.
	 */
	public void registerEvent(CcTxRequest ccTxRequest);
}
