/**
 * Copyright (c) APVMA, 2013.
 */
package au.gov.apvma.event.processor.service;

import au.gov.apvma.event.processor.model.gen.CcTxRequest;

/**
 * @author peter
 *
 */
public interface EventService {

	/**
	 * @param ccTxRequest
	 */
	public void registerEvent(CcTxRequest ccTxRequest);

}
