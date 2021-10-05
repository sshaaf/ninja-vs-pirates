package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class SpatResource {

    @RestClient
    SpatService spatService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       return "Hello RESTEasy";
    }

    @GET
    @Path("/spat")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSpat(){
        return Response.ok(spatService.getSpat()).build();
    }

}