package com.acme.jee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
//@RestController
// @RequestMapping(value = "/")
public class HelloController {

    @Autowired
    // @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", produces = "text/plain", method = RequestMethod.GET)
    // @RequestMapping(value = "/hello", produces = "text/plain", method = RequestMethod.GET)
    public String sayHello(
            @RequestParam(required = false, value = "name") String name
            // @RequestParam(required = false, value = "name") String name
    ) {
        return helloService.getText(name);
    }
}
