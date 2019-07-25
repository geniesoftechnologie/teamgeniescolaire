/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Classe;
import classes.Etudiant;
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
public class ClasseDao extends Dao<Classe> {

    @Override
    public Classe rechercher(long id) {
        ResultSet result = null;
        Classe c = new Classe();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM classes WHERE idc = "+id);
           if(result.next()){
               c.setIdc(result.getInt("idc"));
               c.setIdf(result.getInt("idf"));
               c.setNomf(result.getString("nomF"));
               c.setLib(result.getString("libelleC"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return c;
    }

    @Override
    public void inserer(Classe c) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO classes (idf,nomF,libelleC) VALUES (?,?,?)");
            prepare.setInt(1, c.getIdf());
            prepare.setString(2, c.getNomf());
            prepare.setString(3, c.getLib());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Classe e, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE classes SET idf = ?,nomF =?,libelleC=? WHERE idc ="+id);
            prepare.setInt(1, e.getIdf());
            prepare.setString(2,e.getNomf() );
            prepare.setString(3,e.getLib());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM classes WHERE idc ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Classe> liste() {
        List<Classe> cl = new ArrayList();
        Classe obj = new Classe();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM classes");
            while(result.next()){
            obj.setIdc(result.getInt("idc"));
            obj.setIdf(result.getInt("idf"));
            obj.setNomf(result.getString("nomF"));
            obj.setLib(result.getString("libelleC"));
            cl.add(obj);
            obj = new Classe();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cl;
    }
    
}
