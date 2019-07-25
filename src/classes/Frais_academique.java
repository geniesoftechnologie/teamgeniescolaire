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
public class Frais_academique {
    private int idf_a;
    private int montant;

    public Frais_academique(int idf_a, int montant) {
        this.idf_a = idf_a;
        this.montant = montant;
    }

    public Frais_academique(int montant) {
        this.montant = montant;
    }

    public Frais_academique() {
    }

    public int getIdf_a() {
        return idf_a;
    }

    public void setIdf_a(int idf_a) {
        this.idf_a = idf_a;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
}
