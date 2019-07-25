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
public class EtatEtudiant {
    private int id;
    private int idetu;
    private String nom;
    private String prenom;
    private String classe;
    private String filiere;
    private int paiement;
    private int dette;
    
    public EtatEtudiant() {
    }
     
    public EtatEtudiant(int id, String classe, String filiere, int paiement, int dette) {
        this.id = id;
        this.classe = classe;
        this.filiere = filiere;
        this.paiement = paiement;
        this.dette = dette;
    }

    public EtatEtudiant(int paiement, int dette) {
        this.paiement = paiement;
        this.dette = dette;
    }

   

    public EtatEtudiant(String nom, String prenom, String classe, String filiere, int paiement, int dette) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.paiement = paiement;
        this.dette = dette;
    }

    public EtatEtudiant(int id, String nom, String prenom, String classe, String filiere, int paiement, int dette) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.paiement = paiement;
        this.dette = dette;
    }
    
    public EtatEtudiant(int id, int idetu, String nom, String prenom, String classe, String filiere, int paiement, int dette) {
        this.id = id;
        this.idetu = idetu;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.paiement = paiement;
        this.dette = dette;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdetu() {
        return idetu;
    }

    public void setIdetu(int idetu) {
        this.idetu = idetu;
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

    public int getPaiement() {
        return paiement;
    }

    public void setPaiement(int paiement) {
        this.paiement = paiement;
    }

    public int getDette() {
        return dette;
    }

    public void setDette(int dette) {
        this.dette = dette;
    }
    
    
}
