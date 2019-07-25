/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date daten;
    private String phone;
    private String adresse;

    public Etudiant(int id, String nom, String prenom, String sexe, Date daten, String phone, String adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.daten = daten;
        this.phone = phone;
        this.adresse = adresse;
    }

    public Etudiant(String nom, String prenom, String sexe, Date daten, String phone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.daten = daten;
        this.phone = phone;
        this.adresse = adresse;
    }

    public Etudiant() {
    }

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDaten() {
        return daten;
    }

    public void setDaten(Date daten) {
        this.daten = daten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
}
