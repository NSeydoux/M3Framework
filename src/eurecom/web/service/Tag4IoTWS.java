package eurecom.web.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**

 * @author Gyrard Amelie
 * Tag4IoT To analyze/get popular terms in ontologies
 * 
 */

@Path("/tag4iot")
public class Tag4IoTWS {
	
	
	/**
	 * Get list of ontologies that we already try to get popular terms without generating issues
	 * Last updated June 17 2015
	 * @param 
	 * @return list of ontologies, name - url
	 * E.g., /tag4iot/getListOnto/
	 */
	@GET
	@Path("/getListOnto/")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTotalNumberOntology() {
		String table_onto_ok = "Onto 1; Onto 2";

		return Response.status(200).entity(table_onto_ok).build();
	}
	
}
