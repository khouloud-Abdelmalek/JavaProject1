// Classe Animal
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré pour initialiser l'animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Nom: " + name + ", Famille: " + family + ", Âge: " + age + ", Mammifère: " + (isMammal ? "Oui" : "Non");
    }
}
