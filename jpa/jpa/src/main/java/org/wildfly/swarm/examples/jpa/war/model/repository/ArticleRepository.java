//package org.wildfly.swarm.examples.jpa.war.model.repository;
//
//import java.awt.print.Pageable;
//import java.util.List;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.wildfly.swarm.examples.jpa.war.model.Article;
//import org.wildfly.swarm.examples.jpa.war.model.Company;
//import org.wildfly.swarm.examples.jpa.war.model.Person;
//
//@Transactional
////public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {
//public interface ArticleRepository extends JpaRepository {
//    Optional<Article> findById(Integer id);
//    List<Article> findAll();
//    List<Article> findByAuthor(Person author);
//    List<Article> findByWrittenFor(Company company, Pageable pageable);
//    List<Article> findByAuthorAndWrittenFor(Person author, Company company);
//}
