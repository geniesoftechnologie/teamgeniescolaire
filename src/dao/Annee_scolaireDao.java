/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Annee_scolaire;
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
public class Annee_scolaireDao extends Dao<Annee_scolaire>{

    @Override
    public Annee_scolaire rechercher(long id) {
        ResultSet result = null;
        Annee_scolaire a = new Annee_scolaire();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM annee_scolaire WHERE ida = "+id);
           if(result.next()){
               a.setIda(result.getInt("ida"));
               a.setDate_scolaire(result.getString("montant"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Annee_scolaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return a;
    }

    @Override
    public void inserer(Annee_scolaire a) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO annee_scolaire (annee_sco) VALUES (?)");
            prepare.setString(1, a.getDate_scolaire());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Annee_scolaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Annee_scolaire a, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE annee_scolaire SET annee_sco = ? WHERE ida ="+id);
            prepare.setString(1, a.getDate_scolaire());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Annee_scolaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM annee_scolaire WHERE ida ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Annee_scolaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Annee_scolaire> liste() {
        List<Annee_scolaire> a = new ArrayList();
        Annee_scolaire obj = new Annee_scolaire();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM annee_scolaire");
            while(result.next()){
            obj.setIda(result.getInt("ida"));
            obj.setDate_scolaire(result.getString("annee_sco"));
            a.add(obj);
            obj = new Annee_scolaire();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Annee_scolaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
}
