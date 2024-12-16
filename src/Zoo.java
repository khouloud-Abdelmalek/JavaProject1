// Classe Zoo
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré pour initialiser le zoo
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Méthode displayZoo pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages;
    }
}