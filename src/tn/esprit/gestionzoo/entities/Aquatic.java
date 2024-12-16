package tn.esprit.gestionzoo.entities;

public abstract class Aquatic {
    private String name;
    private int age;
    private String habitat;  // Habitat de l'animal aquatique

    // Constructeur
    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Méthode abstraite à redéfinir dans les sous-classes
    public abstract void swim();

    // Méthode equals() pour comparer les animaux aquatiques
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return age == aquatic.age &&
                name.equals(aquatic.name) &&
                habitat.equals(aquatic.habitat);
    }
}


