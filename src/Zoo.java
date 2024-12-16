public class Zoo {
    Animal[] animals; // Tableau d'animaux
    String name;      // Nom du zoo
    String city;      // Ville du zoo
    final int MAX_CAGES = 25; // Nombre maximal de cages
    int animalCount = 0; // Compteur d'animaux

    // Constructeur paramétré
    public Zoo(String name, String city) {
        animals = new Animal[MAX_CAGES]; // Limité à 25 animaux
        this.name = name;
        this.city = city;
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (animalCount < MAX_CAGES) {
            // Vérification de l'unicité de l'animal
            for (int i = 0; i < animalCount; i++) {
                if (animals[i].name.equals(animal.name)) {
                    System.out.println("Cet animal est déjà dans le zoo.");
                    return false;
                }
            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }
    }

    // Méthode pour afficher tous les animaux du zoo
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour rechercher un animal par son nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // Retourne l'indice de l'animal
            }
        }
        return -1; // Si l'animal n'est pas trouvé
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                // Décalage des animaux pour combler le vide
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null; // Suppression de l'animal à la fin
                animalCount--;
                return true;
            }
        }
        System.out.println("L'animal n'a pas été trouvé.");
        return false;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    // Méthode pour comparer deux zoos selon le nombre d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            return null; // Les zoos ont le même nombre d'animaux
        }
    }
}
