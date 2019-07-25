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
public class Frais_inscription {
    private int idf_i;
    private int montant;

    public Frais_inscription(int idf_i, int montant) {
        this.idf_i = idf_i;
        this.montant = montant;
    }

    public Frais_inscription(int montant) {
        this.montant = montant;
    }

    public Frais_inscription() {
    }

    public int getIdf_i() {
        return idf_i;
    }

    public void setIdf_i(int idf_i) {
        this.idf_i = idf_i;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
}
