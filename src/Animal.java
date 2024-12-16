package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);  // Utilisation du setter pour valider l'âge
        this.isMammal = isMammal;
    }

    // Getters et setters avec encapsulation et validation
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Validation de l'âge
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge de l'animal ne peut pas être négatif.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // Méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal [Name: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal + "]";
    }
}
