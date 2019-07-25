/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Filiere;
import classes.Frais_academique;
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
public class Frais_academiqueDao extends Dao<Frais_academique>{

    @Override
    public Frais_academique rechercher(long id) {
        ResultSet result = null;
        Frais_academique fa = new Frais_academique();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM frais_academique WHERE idf_a = "+id);
           if(result.next()){
               fa.setIdf_a(result.getInt("idf_a"));
               fa.setMontant(result.getInt("montant"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return fa;
    }

    @Override
    public void inserer(Frais_academique fa) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO frais_academique (montant) VALUES (?)");
            prepare.setInt(1, fa.getMontant());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Frais_academique fa, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE frais_academique SET montant = ? WHERE idf_a ="+id);
            prepare.setInt(1, fa.getMontant());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM frais_academique WHERE idf_a ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Frais_academique> liste() {
        List<Frais_academique> fa = new ArrayList();
        Frais_academique obj = new Frais_academique();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM frais_academique");
            while(result.next()){
            obj.setIdf_a(result.getInt("idf_a"));
            obj.setMontant(result.getInt("montant"));
            fa.add(obj);
            obj = new Frais_academique();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Frais_academiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fa;
    }
    
}
