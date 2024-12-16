public class ZooManagement {
    public static void main(String[] args) {
        // Création de l'animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création du zoo (myZoo) avec un maximum de 25 cages
        Zoo myZoo = new Zoo("My Zoo", "Paris", 25);

        // Affichage des informations de l'animal
        System.out.println(lion);

        // Affichage des informations du zoo
        myZoo.displayZoo();

        // Test des deux instructions
        System.out.println(myZoo);           // Affiche via la méthode toString
        System.out.println(myZoo.toString()) ; // Affiche via la méthode toString
    }
}
