package br.com.bradesco-hbtn-java.heranca;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal() {
        setName("Animal");
    }
}