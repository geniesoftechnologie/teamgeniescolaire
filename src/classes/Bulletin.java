/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author HP
 */
public class Bulletin {
    private int id;
    private int id_etu;
    private String nom;
    private String prenom;
    private String classe;
    private String filiere;
    private String annee;
    private String semestre;
    private Float java;
    private Float lang;
    private Float php;
    private Float sys;
    private Float math;
    private Float reseau;
    private Float somme;
    private Float moyenne;
    private String rang;

    public Bulletin() {
    }

    public Bulletin(int id, int id_etu, String nom, String prenom, String classe, String filiere, String annee, String semestre, Float java, Float lang, Float php, Float sys, Float math, Float reseau, Float somme, Float moyenne, String rang) {
        this.id = id;
        this.id_etu = id_etu;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.annee = annee;
        this.semestre = semestre;
        this.java = java;
        this.lang = lang;
        this.php = php;
        this.sys = sys;
        this.math = math;
        this.reseau = reseau;
        this.somme = somme;
        this.moyenne = moyenne;
        this.rang = rang;
    }

    public Bulletin(int id_etu, String nom, String prenom, String classe, String filiere, String annee, String semestre, Float java, Float lang, Float php, Float sys, Float math, Float reseau, Float somme, Float moyenne, String rang) {
        this.id_etu = id_etu;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.filiere = filiere;
        this.annee = annee;
        this.semestre = semestre;
        this.java = java;
        this.lang = lang;
        this.php = php;
        this.sys = sys;
        this.math = math;
        this.reseau = reseau;
        this.somme = somme;
        this.moyenne = moyenne;
        this.rang = rang;
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Float getJava() {
        return java;
    }

    public void setJava(Float java) {
        this.java = java;
    }

    public Float getLang() {
        return lang;
    }

    public void setLang(Float lang) {
        this.lang = lang;
    }

    public Float getPhp() {
        return php;
    }

    public void setPhp(Float php) {
        this.php = php;
    }

    public Float getSys() {
        return sys;
    }

    public void setSys(Float sys) {
        this.sys = sys;
    }

    public Float getMath() {
        return math;
    }

    public void setMath(Float math) {
        this.math = math;
    }

    public Float getReseau() {
        return reseau;
    }

    public void setReseau(Float reseau) {
        this.reseau = reseau;
    }

    public Float getSomme() {
        return somme;
    }

    public void setSomme(Float somme) {
        this.somme = somme;
    }

    public Float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Float moyenne) {
        this.moyenne = moyenne;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
    
    
    
    
}
