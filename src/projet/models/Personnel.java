/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.models;


import java.util.Date;

/**
 *
 * @author user
 */
public class Personnel {
     private int matricule;
   
  private String nom;
  private String prenom;
  private int soldeConge;
  private Date Date_debutTravail;
  private String type;
  private String description;
  private String image;

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
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

    public int getSoldeConge() {
        return soldeConge;
    }

    public void setSoldeConge(int soldeConge) {
        this.soldeConge = soldeConge;
    }

    public Date getDate_debutTravail() {
        return Date_debutTravail;
    }

    public void setDate_debutTravail(Date Date_debutTravail) {
        this.Date_debutTravail = Date_debutTravail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Personnel(int matricule, String nom, String prenom, int soldeConge, String type, String description, String image) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.soldeConge = soldeConge;
        this.Date_debutTravail = Date_debutTravail;
        this.type = type;
        this.description = description;
        this.image = image;
    }

    public Personnel(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personnel() {
    }

    @Override
    public String toString() {
        return "Personnel{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", soldeConge=" + soldeConge + ", Date_debutTravail=" + Date_debutTravail + ", type=" + type + ", description=" + description + ", image=" + image + '}';
    }
}
