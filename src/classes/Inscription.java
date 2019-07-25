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
public class Inscription {
    private int id;
    private int id_etu;
    private String nom;
    private String prenom;
    private String classe;
    private String filiere;
    private String annee;
    private int fraisIns;
    private int fraisAca;
    private Date dateIns;

    public Inscription(String nom, String prenom, String classe, String filiere, String annee, int fraisIns, int fraisAca, Date dateIns) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.annee = annee;
        this.fraisIns = fraisIns;
        this.fraisAca = fraisAca;
        this.dateIns = dateIns;
    }
    

    public Inscription(int id, int id_etu, String nom, String prenom, String classe, String filiere, String annee, int fraisIns, int fraisAca, Date dateIns) {
        this.id = id;
        this.id_etu = id_etu;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.annee = annee;
        this.fraisIns = fraisIns;
        this.fraisAca = fraisAca;
        this.dateIns = dateIns;
    }

    public Inscription(int id_etu, String nom, String prenom, String classe, String filiere, String annee, int fraisIns, int fraisAca, Date dateIns) {
        this.id_etu = id_etu;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.annee = annee;
        this.fraisIns = fraisIns;
        this.fraisAca = fraisAca;
        this.dateIns = dateIns;
    }

    public Inscription() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_etu() {
        return id_etu;
    }

    public void setId_etu(int id_etu) {
        this.id_etu = id_etu;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getFraisIns() {
        return fraisIns;
    }

    public void setFraisIns(int fraisIns) {
        this.fraisIns = fraisIns;
    }

    public int getFraisAca() {
        return fraisAca;
    }

    public void setFraisAca(int fraisAca) {
        this.fraisAca = fraisAca;
    }

    public Date getDateIns() {
        return dateIns;
    }

    public void setDateIns(Date dateIns) {
        this.dateIns = dateIns;
    }
    
    
}
