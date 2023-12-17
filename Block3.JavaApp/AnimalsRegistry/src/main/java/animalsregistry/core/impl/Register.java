package animalsregistry.core.impl;

import animalsregistry.core.Counter;
import animalsregistry.core.Operation;
import animalsregistry.repository.Animal;

import java.util.ArrayList;

public class Register implements Operation {
    private final String command = "REGISTER";

    private ArrayList<Animal> animals;

    public Register(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void run(){

//        newAnimalsCounter.add();
        Counter.COUNTER.getAndIncrement();
    }

    @Override
    public String toString() {
        return command;
    }
}
