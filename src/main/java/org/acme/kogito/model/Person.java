package org.acme.kogito.model;

public class Person {

    private String name;
    private int age;
    private boolean adult;
    private boolean isQuarkus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return adult;
    }

    public boolean isQuarkus() {
        return isQuarkus;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setQuarkus(boolean quarkus) {
        this.isQuarkus = quarkus;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", adult=" + adult + ", quarkus=" + isQuarkus + "]";
    }

}
