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
public class Filiere {
    private int idf;
    private String lib;

    public Filiere(int idf, String lib) {
        this.idf = idf;
        this.lib = lib;
    }

    public Filiere(String lib) {
        this.lib = lib;
    }

    public Filiere() {
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
    
}
