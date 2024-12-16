public class Employe implements Comparable<Employe> {
    private int identifiant;
    private String nom;


    public Employe(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.identifiant, autre.identifiant);
    }

    @Override
    public String toString() {
        return "Employé[id=" + identifiant + ", nom=" + nom + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(identifiant);
        result = 31 * result + nom.hashCode();
        return result;
    }
}

