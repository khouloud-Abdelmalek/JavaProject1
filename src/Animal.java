public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Redéfinition de la méthode toString pour un affichage personnalisé
    @Override
    public String toString() {
        return "Animal [Name: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal + "]";
    }
}

