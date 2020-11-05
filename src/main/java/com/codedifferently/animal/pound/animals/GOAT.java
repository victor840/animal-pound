package com.codedifferently.animal.pound.animals;

import java.util.Date;

public class GOAT extends Mammal {
    public GOAT(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    @Override
    public String speak() {
        return "I see you big Dawg :-)";
    }
}
