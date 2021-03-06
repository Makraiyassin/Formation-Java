package com.bxlFormation.coursAlex.ExoStream;

public class Habitant {

    private String nom;
    private String prenom;
    private String rue;
    private int numero;
    private double totalTaxes;

    public Habitant(String nom, String prenom, String rue, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.numero = numero;
    }
    public Habitant(String nom, String prenom, String rue, int numero, double totalTaxes) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.numero = numero;
        this.totalTaxes = totalTaxes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public void payerTaxe(double montant){
        this.totalTaxes += montant;
    }
    @Override
    public String toString() {
        return "Habitant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", rue='" + rue + '\'' +
                ", numero=" + numero +
                ", totalTaxes=" + totalTaxes +
                '}';
    }
}
