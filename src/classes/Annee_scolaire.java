/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author hp
 */
public class Annee_scolaire {
    private int ida;
    private String date_scolaire;

    public Annee_scolaire(int ida, String date_scolaire) {
        this.ida = ida;
        this.date_scolaire = date_scolaire;
    }

    public Annee_scolaire(String date_scolaire) {
        this.date_scolaire = date_scolaire;
    }

    public Annee_scolaire() {
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getDate_scolaire() {
        return date_scolaire;
    }

    public void setDate_scolaire(String date_scolaire) {
        this.date_scolaire = date_scolaire;
    }
    
}
