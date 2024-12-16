import java.util.HashMap;
import java.util.Map;

public class AffectationHashMap {

    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();

        public void ajouterEmployeDepartement(Employe e, Departement d) {
            affectations.put(e, d);
        }

        public void afficherEmployesEtDepartements() {
            for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
                System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
            }

            public void afficherEmployesEtDepartements() {
                for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
                    System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
                }

                public void supprimerEmploye(Employe e){
                    if (affectations.containsKey(e)) {
                        affectations.remove(e);
                        System.out.println("L'employé " + e + " a été supprimé de la collection.");
                    } else {
                        System.out.println("L'employé " + e + " n'est pas trouvé dans la collection.");
                    }
                    public void afficherEmployes () {
                        System.out.println("Liste des employés :");
                        for (Employe employe : affectations.keySet()) {
                            System.out.println(employe);
                        }
                    }
                    public void afficherDepartements () {
                        System.out.println("Liste des départements :");
                        Set<Departement> departementsUniques = new HashSet<>(affectations.values());
                        for (Departement departement : departementsUniques) {
                            System.out.println(departement);
                        }
                    }

                    public boolean rechercherEmploye (Employe e){
                        return affectations.containsKey(e);
                    }

                    public boolean rechercherDepartement (Departement d){
                        return affectations.containsValue(d);
                    }

                    public TreeMap<Employe, Departement> trierMap () {
                        return new TreeMap<>(affectations); // TreeMap trie automatiquement si les clés implémentent Comparable
                    }
                }}}}


}


