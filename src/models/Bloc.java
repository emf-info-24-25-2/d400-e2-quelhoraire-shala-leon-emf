package models;

import java.util.Arrays;

public class Bloc {

    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;

    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        this.modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];

        ModuleInfo Matu = new ModuleInfo("Matu");

        modules[0] = Matu;
        modules[1] = Matu;
        modules[2] = Matu;
        modules[3] = Matu;
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean reussi = false;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {

            }
        }
        return reussi;
    }

    public void afficherHoraire() {

    }

    public boolean estTotalementPlanifie() {

        boolean totalementPlanifie = false;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                totalementPlanifie = true;
                break;
            }
        }
        return totalementPlanifie;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean contientModule = false;

        return contientModule;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}