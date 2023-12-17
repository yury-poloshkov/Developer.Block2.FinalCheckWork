package animalsregistry.repository;

import animalsregistry.core.Animals;
import animalsregistry.core.Skills;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    private int id;
    private String name;
    private Animals type;
    private double weight;
    private String color;
    private LocalDate birthDate;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private int cage;
    private ArrayList<Skills> skills;







}
