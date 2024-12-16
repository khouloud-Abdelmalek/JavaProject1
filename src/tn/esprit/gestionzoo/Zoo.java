package tn.esprit.gestionzoo;

public class Zoo {
    private Animal[] animals; // Tableau d'animaux
    private String name;      // Nom du zoo
    private String city;      // Ville du zoo
    private final int MAX_CAGES = 25; // Nombre maximal de cages
    private int animalCount = 0; // Compteur d'animaux

    // Constructeur paramétré
    public Zoo(String name, String city) {
        setName(name);  // Utilisation du setter pour valider le nom
        this.city = city;
        animals = new Animal[MAX_CAGES];
    }

    // Getters et setters avec encapsulation et validation
    public String getName() {
        return name;
    }

    // Validation du nom du zoo (ne peut pas être vide)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne doit pas être vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }
        if (animalCount < MAX_CAGES) {
            // Vérification de l'unicité de l'animal
            for (int i = 0; i < animalCount; i++) {
                if (animals[i].getName().equals(animal.getName())) {
                    System.out.println("Cet animal est déjà dans le zoo.");
                    return false;
                }
            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
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
            if (animals[i].getName().equals(animal.getName())) {
                return i; // Retourne l'indice de l'animal
            }
        }
        return -1; // Si l'animal n'est pas trouvé
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
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
