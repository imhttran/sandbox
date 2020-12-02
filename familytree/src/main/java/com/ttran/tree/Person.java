package com.ttran.tree;


import java.util.Objects;

public class Person {
    private Integer id;
    private Integer parentId;
    private String title;

    private Person(Integer id, Integer parentId, String title) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
    }

    public static Person newPerson(Integer id, Integer parentId, String title){
        return new Person(id, parentId, title);
    }

    public Integer getId() {
        return id;
    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
    public Integer getParentId() {
        return parentId;
    }
//
//    public void setParentId(Integer parentId) {
//        this.parentId = parentId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId().equals(person.getId()) &&
//                getParentId().equals(person.getParentId()) &&
                title.equals(person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getParentId(), title);
    }
}
