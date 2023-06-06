package com.acme.jee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class PersonController {
    @EJB
    private LocalHelloHomeInterface helloBean;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String getAnA() {
        HelloComponentInterface helloComponentInterface = helloBean.create();
        return helloComponentInterface.sayHello("Unknown User");
    }
}
