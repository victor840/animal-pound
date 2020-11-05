package com.codedifferently.animal.pound;

import com.codedifferently.animal.pound.animals.GOAT;
import com.codedifferently.animal.pound.animals.Llama;

import java.util.Date;

public class MainApplication {
    public static void main(String[] args) {
        Llama larry = new Llama("Larry", new Date(),36);
        System.out.println("Lets make some doggies " +larry);

        GOAT vicDaGoat = new GOAT("KC", new Date(), 1);
        System.out.println("Vic Da GOAT! " +vicDaGoat.speak());
    }
}
