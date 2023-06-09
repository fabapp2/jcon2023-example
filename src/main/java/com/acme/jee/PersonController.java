package com.acme.jee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class PersonController {

    @EJB
    private TextBean helloBean;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String sayHello() {
        return helloBean.getText();
    }
}
