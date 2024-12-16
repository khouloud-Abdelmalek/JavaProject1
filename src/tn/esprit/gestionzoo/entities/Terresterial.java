package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("This terrestrial animal is eating plants.");
        } else {
            System.out.println("This terrestrial animal does not eat plants.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("This terrestrial animal is eating meat.");
        } else {
            System.out.println("This terrestrial animal does not eat meat.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
