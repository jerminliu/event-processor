Spring Integration WS Sample
============================

Spring's ws-inbound-gateway sample is a good start, but somewhat unsatisfying. The message is constructed by hand as a string, and the web service is not self describing.

This one generates JAXB classes and bindings, and WSDL, from an XSD describing the message. You'll probably want to take the generated WSDL and serve it up statically before you go to prod (to avoid inadvertent interface changes when in BAU), but this sample is to get you going in dev.

I had to hunt around in both the Integration and Web Services doco to find out the info I needed, so thought this may be worth sharing.

A couple of notes on the XSD:
* Spring Web Services looks for messages with a suffix of 'Request' or 'Response' and creates operations for them when generating WSDL. You should be able to define your own suffix with `requestSuffix` and `responseSuffix` parameters, but that didn't work for me.
* The only message element that I actually wanted was txnId. The others all seem to be required by the framework.

This sample is meant for running Spring Integration inside a servlet container.

Deploy
------
You can run the application from:
* within eclipse (Right-click on the WAR project --> Run As --> Run on Server)
* the command line:
	- `mvn tomcat7:run`
* or alternatively:
	- `mvn package`
	- deploy the created war file (under `/target/*.war`) to a servlet container such as Tomcat

Usage
-----
With the event processor deployed and running, point your favourite ws testing tool (like [soapUI] (http://www.soapui.org/)) at http://localhost:8080/event-processor/events/eventService.wsdl and it should do the rest for you. Note that there is no response from this ws, it is a fire and forget notification. Check the container logs for what went on.
	
License
-------

Copyright 2013 Peter Svehla

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0
