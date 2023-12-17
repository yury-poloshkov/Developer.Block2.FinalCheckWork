package animalsregistry;

import animalsregistry.core.Operation;
import animalsregistry.core.impl.Find;
import animalsregistry.core.impl.List;
import animalsregistry.core.impl.Register;
import animalsregistry.core.impl.Train;
import animalsregistry.repository.Animal;
import animalsregistry.ui.MainView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Operation mainView = new MainView(initUI(animals));
        mainView.run();
    }

    private static ArrayList<Operation> initUI(ArrayList<Animal> animals) {
        ArrayList<Operation> mainUI = new ArrayList<>();
        mainUI.add(new Register(animals));
        mainUI.add(new Find(animals));
        mainUI.add(new List(animals));
        mainUI.add(new Train(animals));
        mainUI.add(new MainView(null));
        return mainUI;
    }
}