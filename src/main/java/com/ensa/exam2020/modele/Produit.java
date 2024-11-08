package com.ensa.exam2020.modele;

public class Produit {
    private int id;
    private String nom;
    private String description;
    private int prix;
    private Commercial commercial;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }



}
