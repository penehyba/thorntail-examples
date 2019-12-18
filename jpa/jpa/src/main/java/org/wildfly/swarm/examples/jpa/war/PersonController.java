//package org.wildfly.swarm.examples.jpa.war;
//
//import java.util.List;
//
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.DefaultValue;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//
//import org.springframework.data.domain.PageRequest;
//import org.springframework.web.bind.annotation.*;
//import org.wildfly.swarm.examples.jpa.war.model.Person;
//import org.wildfly.swarm.examples.jpa.war.model.repository.PersonRepository;
//
////@RestController
////@RequestMapping("/person")
////@WebServlet(name = "PersonServlet", urlPatterns = "/person")
//@Path("/person")
//public class PersonController {
//    private static final Integer PAGE_SIZE = 5;
//
//    //    @Autowired
//    @PersistenceContext
//    private PersonRepository repository;
//
//    //    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    @GET
//    @Path(value = "/get")
//    @Produces("application/text")
//    public List<Person> getAll() {
//        return repository.findAll();
//    }
//
//    //    @RequestMapping(value = "/page", method = RequestMethod.POST)
//    @GET
//    @Path(value = "/page")
//    @Produces("application/text")
//    // @QueryParam("name") @DefaultValue("World") String name
////    public List<Person> personPage(@RequestHeader("page") Integer page) {
//    public List<Person> personPage(@QueryParam("page") @DefaultValue(1) Integer page) {
//        return repository.findAll(PageRequest.of(page, PAGE_SIZE)).getContent();
//    }
//}
