//package org.wildfly.swarm.examples.jpa.war.model.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.wildfly.swarm.examples.jpa.war.model.Person;
//
//@Transactional
//public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
//    Optional<Person> findById(Integer id);
//    List<Person> findAll();
//}
