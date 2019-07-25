/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Classe;
import classes.Filiere;
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
public class FiliereDao extends Dao<Filiere>{

    @Override
    public Filiere rechercher(long id) {
        ResultSet result = null;
        Filiere f = new Filiere();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM filiere WHERE idf = "+id);
           if(result.next()){
               f.setIdf(result.getInt("idf"));
               f.setLib(result.getString("lib"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return f;
    }

    @Override
    public void inserer(Filiere f) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO filiere (lib) VALUES (?)");
            prepare.setString(1, f.getLib());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Filiere f, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE filiere SET lib = ? WHERE idf ="+id);
            prepare.setString(1, f.getLib());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM filiere WHERE idf ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Filiere> liste() {
        List<Filiere> f = new ArrayList();
        Filiere obj = new Filiere();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM filiere");
            while(result.next()){
            obj.setIdf(result.getInt("idf"));
            obj.setLib(result.getString("lib"));
            f.add(obj);
            obj = new Filiere();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
}
