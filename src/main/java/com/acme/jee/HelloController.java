package com.acme.jee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
//@RestController
// @RequestMapping(value = "/")
public class HelloController {

    @EJB
    // @Autowired
    private HelloService helloService;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    // @RequestMapping(value = "/hello", produces = "text/plain", method = RequestMethod.GET)
    public String sayHello() {
        return helloService.getText();
    }
}
