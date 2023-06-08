package com.acme.jee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class PersonController {
    @EJB
    private LocalHelloHomeInterface helloBean;

    @EJB
    private GoodByeBean goodByeBean;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String sayHello() {
        HelloComponentInterface helloComponentInterface = helloBean.create();
        return helloComponentInterface.sayHello("Unknown User");
    }

    @GET
    @Path("/goodbye")
    @Produces("text/plain")
    public String sayGoodbye() {
        return goodByeBean.sayGoodBye();
    }
}
