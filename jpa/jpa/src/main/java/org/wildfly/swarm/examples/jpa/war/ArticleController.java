//package org.wildfly.swarm.examples.jpa.war;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//
//import org.wildfly.swarm.examples.jpa.war.model.Article;
//import org.wildfly.swarm.examples.jpa.war.model.output.ArticleOutput;
//import org.wildfly.swarm.examples.jpa.war.model.repository.ArticleRepository;
//import org.wildfly.swarm.examples.jpa.war.model.repository.CompanyRepository;
//import org.wildfly.swarm.examples.jpa.war.model.repository.PersonRepository;
//
////import com.redhat.sb.model.repository.ArticleRepository;
////import com.redhat.sb.model.repository.CompanyRepository;
////import com.redhat.sb.model.repository.PersonRepository;
////import org.springframework.data.domain.PageRequest;
////import org.springframework.web.bind.annotation.*;
//
////@RestController
////@RequestMapping(value = "/article")
//@Path(value = "/article")
//public class ArticleController {
//    private static final Integer PAGE_SIZE=5;
//
////    @Autowired
//@PersistenceContext
//    private ArticleRepository repository;
//
////    @Autowired
//@PersistenceContext
//    private PersonRepository personRepository;
//
////    @Autowired
//@PersistenceContext
//    private CompanyRepository companyRepository;
//
////    @RequestMapping(value = "/get", method= RequestMethod.GET)
//@GET
//@Path(value = "/get")
//@Produces("application/text")
//    public List<Article> getAll(){
//        return repository.findAll();
//    }
//
////    @RequestMapping(value = "/author", method = RequestMethod.POST)
//@POST
//@Path(value = "/author")
//@Produces("application/text")
////    public List<ArticleOutput> fromAuthor(@RequestHeader("author") Integer author){
//    public List<ArticleOutput> fromAuthor(@QueryParam("author") Integer author){
//        return repository.findByAuthor(personRepository.findById(author).get()).stream()
//                .map(ArticleOutput::fromArticle)
//                .limit(5)
//                .collect(Collectors.toList());
//    }
//
////    @RequestMapping(value = "/company/page", method = RequestMethod.POST)
//@POST
//@Path(value = "/company/page")
//@Produces("application/text")
////    public List<ArticleOutput> fromCompany(@RequestHeader("company") Integer company, @RequestHeader("page") Integer page){
//    public List<ArticleOutput> fromCompany(@QueryParam("company") Integer company, @QueryParam("page") Integer page){
//        return repository.findByWrittenFor(
//                companyRepository.findById(company).get(), PageRequest.of(page,PAGE_SIZE))
//                .stream()
//                .map(ArticleOutput::fromArticle)
//                .collect(Collectors.toList());
//    }
//
////    @RequestMapping(value = "/company/author", method = RequestMethod.POST)
//@POST
//@Path(value = "/company/author")
//@Produces("application/text")
//    public List<ArticleOutput> fromAuthorForCompany(@QueryParam("company") Integer company,
//                                                   @QueryParam("author") Integer author) {
//        return repository.findByAuthorAndWrittenFor(
//                personRepository.findById(author).get(),
//                companyRepository.findById(company).get())
//                .stream()
//                .map(ArticleOutput::fromArticle)
//                .collect(Collectors.toList());
//    }
//
////    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//@POST
//@Path(value = "/insert")
//@Produces("application/text")
//    public void insertArticle(@QueryParam("company") Integer company,
//                              @QueryParam("author") Integer author,
//                              @QueryParam("content") String content){
//        Article article =new Article();
//        article.setAuthor(personRepository.findById(author).get());
//        article.setWrittenFor(companyRepository.findById(company).get());
//        article.setText(content);
//        article.setPublished(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//
//        repository.save(article);
//    }
//}
