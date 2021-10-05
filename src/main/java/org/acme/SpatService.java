package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("search")
@RegisterRestClient(configKey = "spat-database")
public interface SpatService {

    @GET
    @Path("spat")
    public Spat getSpat();

}
