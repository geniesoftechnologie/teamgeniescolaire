/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Frais_academique;
import classes.Frais_inscription;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Frais_inscriptionDao extends Dao<Frais_inscription>{

    @Override
    public Frais_inscription rechercher(long id) {
        ResultSet result = null;
        Frais_inscription fi = new Frais_inscription();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM frais_inscription WHERE idf_i = "+id);
           if(result.next()){
               fi.setIdf_i(result.getInt("idf_i"));
               fi.setMontant(result.getInt("montant"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return fi;
    }

    @Override
    public void inserer(Frais_inscription fi) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO frais_inscription (montant) VALUES (?)");
            prepare.setInt(1, fi.getMontant());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_inscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Frais_inscription fi, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE frais_inscription SET montant = ? WHERE idf_i ="+id);
            prepare.setInt(1, fi.getMontant());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_inscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM frais_inscription WHERE idf_i ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_inscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Frais_inscription> liste() {
        List<Frais_inscription> fi = new ArrayList();
        Frais_inscription obj = new Frais_inscription();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM frais_inscription");
            while(result.next()){
            obj.setIdf_i(result.getInt("idf_i"));
            obj.setMontant(result.getInt("montant"));
            fi.add(obj);
            obj = new Frais_inscription();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fi;
    }
    
}
