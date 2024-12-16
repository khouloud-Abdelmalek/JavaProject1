import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Déclaration des variables
        int nbrCages = 20;
        String zooName = "my zoo";

        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du nom du zoo
        System.out.print("Veuillez entrer le nom du zoo : ");
        zooName = scanner.nextLine();

        // Demande du nombre de cages avec validation
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Veuillez entrer le nombre de cages : ");
                nbrCages = Integer.parseInt(scanner.nextLine());
                if (nbrCages > 0) {
                    validInput = true; // Sortir de la boucle si l'entrée est valide
                } else {
                    System.out.println("Le nombre de cages doit être un entier positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un entier.");
            }
        }

        // Affichage des données saisies
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Fermeture du scanner
        scanner.close();
    }
}
