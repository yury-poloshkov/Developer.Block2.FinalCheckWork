package animalsregistry.core.impl;

import animalsregistry.core.Operation;
import animalsregistry.repository.Animal;

import java.util.ArrayList;

public class Train implements Operation {
    private final String command = "TRAIN";

    private ArrayList<Animal> animals;

    public Train(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void run(){

    }

    @Override
    public String toString() {
        return command;
    }
}
