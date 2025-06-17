package models;

public class ModuleInfo {

    private String nom;
    private Professeur professeur;

    public ModuleInfo(String nom) {
        this.nom = nom;
        this.professeur = null;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        if (professeur.enseigneCeModule(nom)) {
            return nom + " avec " + professeur.toString();
        } else {
            return nom;
        }
    }
}