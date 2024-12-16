package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);

        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        myZoo.addAquaticAnimal(p);

        Terrestrial tiger = new Terrestrial("Felidae", "Tiger", 5, true, 4);
        tiger.eatMeat(Food.MEAT);  // Tiger eating meat
        tiger.eatPlant(Food.PLANT);  // Tiger not eating plant
        tiger.eatPlantAndMeat(Food.BOTH);  // Tiger eating both

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
            aquatics[i].eatMeat(Food.MEAT);  // Example of eating meat
        }

        System.out.println(myZoo);
    }
}
