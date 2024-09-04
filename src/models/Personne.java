package models;

public class Personne {
    private final String nom;
    private final String prenom;
    private final String rue;
    private final String localite;
    private final int npa;
    
    public Personne(String nom, String prenom, String rue, String localite, int npa) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.localite = localite;
        this.npa = npa;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRue() {
        return rue;
    }

    public String getLocalite() {
        return localite;
    }

    public int getNpa() {
        return npa;
    }
    
}
