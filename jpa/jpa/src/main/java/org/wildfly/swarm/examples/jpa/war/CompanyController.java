//package org.wildfly.swarm.examples.jpa.war;
//
//import java.util.List;
//
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//
//import org.wildfly.swarm.examples.jpa.war.model.Company;
//import org.wildfly.swarm.examples.jpa.war.model.repository.CompanyRepository;
//
////@RestController
////@RequestMapping("/company")
//@Path(value = "/company")
//public class CompanyController {
//    //    @Autowired
//    @PersistenceContext
//    private CompanyRepository repository;
//
//    //    @RequestMapping(value = "/get", method= RequestMethod.GET)
//    @GET
//    @Path(value = "/get")
//    @Produces("application/text")
//    public List<Company> getAll() {
//        return repository.findAll();
//    }
//}
