//package org.wildfly.swarm.examples.jpa.war.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "article")
//public class Article {
//
//    @Id
//    @GeneratedValue
//    @Column(name="id")
//    private int id;
//
//    @Column(name="text")
//    private String text;
//
//    @Column(name="published")
//    private String published;
//
//    @ManyToOne
//    @JoinColumn(name = "author")
//    private Person author;
//
//    @ManyToOne
//    @JoinColumn(name = "writtenFor")
//    private Company writtenFor;
//
//    public Article() {
//    }
//
//    public Article(String text, String published, Person author, Company writtenFor) {
//        this.text = text;
//        this.published = published;
//        this.author = author;
//        this.writtenFor = writtenFor;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getPublished() {
//        return published;
//    }
//
//    public void setPublished(String published) {
//        this.published = published;
//    }
//
//    public Person getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Person author) {
//        this.author = author;
//    }
//
//    public Company getWrittenFor() {
//        return writtenFor;
//    }
//
//    public void setWrittenFor(Company writtenFor) {
//        this.writtenFor = writtenFor;
//    }
//}
//
