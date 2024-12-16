public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Paris");

        // Création d'animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        // Tentative d'ajout des animaux
        System.out.println(myZoo.addAnimal(lion)); // true
        System.out.println(myZoo.addAnimal(tiger)); // true

        // Essayez d'ajouter plus d'animaux que la capacité
        for (int i = 0; i < 30; i++) {
            System.out.println(myZoo.addAnimal(new Animal("Felidae", "Animal" + i, 3, true)));
        }
    }
}
