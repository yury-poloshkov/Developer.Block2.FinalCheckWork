package animalsregistry.core.impl;

import animalsregistry.core.Operation;
import animalsregistry.repository.Animal;

import java.util.ArrayList;

public class List implements Operation {
    private final String command = "LIST";

    private ArrayList<Animal> animals;

    public List(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void run(){
        for (Animal animal: animals){
            System.out.println(animal.toString());
        }
    }

    @Override
    public String toString() {
        return command;
    }
}
