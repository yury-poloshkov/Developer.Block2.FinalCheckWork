package animalsregistry.core.impl;

import animalsregistry.core.Operation;
import animalsregistry.repository.Animal;

import java.util.ArrayList;

public class Find implements Operation {
    private final String command = "FIND";

    private ArrayList<Animal> animals;

    public Find(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void run(){

    }

    @Override
    public String toString() {
        return command;
    }
}
