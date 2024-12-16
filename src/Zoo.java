public class Zoo {
    Animal[] animals;
    String name;
    String city;
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
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }
    }
}
