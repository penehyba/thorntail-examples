//package org.wildfly.swarm.examples.jpa.war.model;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "company")
//public class Company {
//    @Id
//    @GeneratedValue
//    @Column(name="id")
//    private int id;
//
//    @Column(name="name")
//    private String name;
//
//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "employee",
//            joinColumns = @JoinColumn(name= "companyId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name= "personId", referencedColumnName = "id")
//    )
//    private Set<Person> employees = new HashSet<>();
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Person> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Set<Person> employees) {
//        this.employees = employees;
//    }
//
//    @Override
//    public String toString() {
//        return "Company{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employees=" + employees +
//                '}';
//    }
//}
