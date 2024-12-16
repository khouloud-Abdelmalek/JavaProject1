package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals; // Tableau d'animaux
    private Aquatic[] aquaticAnimals; // Tableau d'animaux aquatiques
    private String name;
    private String city;
    private final int MAX_CAGES = 25;
    private final int MAX_AQUATIC = 10;
    private int animalCount = 0;
    private int aquaticCount = 0;

    // Constructeur paramétré
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[MAX_CAGES];
        aquaticAnimals = new Aquatic[MAX_AQUATIC];
    }

    // Méthode pour ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < MAX_AQUATIC) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
        } else {
            System.out.println("Le zoo ne peut pas contenir plus d'animaux aquatiques.");
        }
    }

    // Méthode pour afficher tous les animaux aquatiques et leur comportement
    public void displayAquaticAnimalsSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Méthode pour afficher le nombre d'animaux aquatiques par type
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }

    // Méthode pour renvoyer la profondeur maximale de nage des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];  // Downcasting
                float depth = penguin.maxSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    // Autres méthodes (ajout d'animaux, recherche, suppression)
    // ...
}
