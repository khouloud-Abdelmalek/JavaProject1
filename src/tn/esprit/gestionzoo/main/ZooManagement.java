package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.Zoo;
import tn.esprit.gestionzoo.Animal;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nom du zoo et le nombre de cages
        System.out.println("Entrez le nom du zoo:");
        String zooName = scanner.nextLine();

        System.out.println("Entrez le nombre de cages:");
        int nbrCages = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne après l'entier

        // Création d'un objet Zoo
        Zoo myZoo = new Zoo(zooName, "Paris");

        // Création d'animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        // Ajouter des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        // Afficher les animaux
        myZoo.displayAnimals();

        // Rechercher un animal dans le zoo
        int index = myZoo.searchAnimal(lion);
        System.out.println("Lion trouvé à l'indice: " + index);

        // Supprimer un animal
        myZoo.removeAnimal(tiger);
        myZoo.displayAnimals();

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Another Zoo", "London");
        anotherZoo.addAnimal(new Animal("Felidae", "Jaguar", 6, true));
        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + largerZoo.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        scanner.close();
    }
}
