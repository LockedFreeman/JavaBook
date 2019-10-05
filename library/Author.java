package library;

public class Author {

    private String name;
    private String surName;
    private int age;
    private int numberPhone;

    public Author() {

    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", numberPone=" + numberPhone +
                '}';
    }


}
