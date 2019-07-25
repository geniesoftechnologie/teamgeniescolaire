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
public class Classe {
    private int idc;
    private int idf;
    private String nomf;
    private String lib;

    public Classe() {
    }

    public Classe(int idf, String nomf, String lib) {
        this.idf = idf;
        this.nomf = nomf;
        this.lib = lib;
    }

    public Classe(int idc, int idf, String nomf, String lib) {
        this.idc = idc;
        this.idf = idf;
        this.nomf = nomf;
        this.lib = lib;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getNomf() {
        return nomf;
    }

    public void setNomf(String nomf) {
        this.nomf = nomf;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
    
    
}
