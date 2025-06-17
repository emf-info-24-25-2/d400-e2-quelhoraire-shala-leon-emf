package models;

import java.util.Arrays;

public class Professeur {

    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.modulesEnseignes = new ModuleInfo[0];
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean moduleDejaPris = false;

        // on a un nom ?
        if (nomDuModule != null) {
            // Se balader dans le tableau modulesEnseignes
            for (int i = 0; i < modulesEnseignes.length; i++) {
                // verifier si l'index est égal au nom du module donner
                if (modulesEnseignes[i].getNom() == nomDuModule) {
                    // Dire vrai si c'est le cas
                    moduleDejaPris = true;
                    // On stop la recherche
                    break;
                }
            }
        }
        return moduleDejaPris;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        // Je me souviens plus de comment faire un tableau sans trous
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == null) {
                modulesEnseignes[i] = module;
            }
        }
    }

    public void viderModules() {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes != null) {
                modulesEnseignes[i] = null;
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + nom.toUpperCase();
    }
}
