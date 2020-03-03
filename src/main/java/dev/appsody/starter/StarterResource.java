package dev.appsody.starter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resources")
public class StarterResource {

    @GET
    public String getRequest() {
        return "StarterResource response";
    }
}
