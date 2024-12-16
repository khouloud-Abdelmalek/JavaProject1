package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un zoo
        Zoo myZoo = new Zoo("Paris Zoo", "Paris");

        // Création d'animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        // Ajouter des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        // Création d'animaux aquatiques
        Dolphin dolphin = new Dolphin("Flipper", 3, "Océan Atlantique");
        Penguin penguin = new Penguin("Pingu", 2, "Antarctique");

        // Ajouter des animaux aquatiques
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Afficher les animaux aquatiques et leurs comportements
        myZoo.displayAquaticAnimalsSwim();

        // Afficher le nombre de dauphins et de pingouins
        myZoo.displayNumberOfAquaticsByType();

        // Afficher la profondeur maximale de nage des pingouins
        System.out.println("Profondeur maximale de nage des pingouins : " + myZoo.maxPenguinSwimmingDepth() + " mètres");

        scanner.close();
    }
}
