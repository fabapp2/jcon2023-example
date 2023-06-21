package com.acme.jee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/") //@RestController
public class HelloController {

    @EJB // @Autowired
    private HelloService helloService;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    // GetMapping("/hello")
    public String sayHello() {
        return helloService.getText();
    }
}
