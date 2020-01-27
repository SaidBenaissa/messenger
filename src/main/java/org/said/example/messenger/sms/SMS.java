package org.said.example.messenger.sms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sms")
public class SMS {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getSMS(){
		return "----- Thank you ------";
		
	}
	

}
