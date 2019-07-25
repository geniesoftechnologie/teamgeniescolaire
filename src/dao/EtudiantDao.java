/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Etudiant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
 public class EtudiantDao extends Dao<Etudiant> {

    @Override
    public Etudiant rechercher(long id) {
         ResultSet result = null;
       Etudiant e = new Etudiant();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM etudiant WHERE id = "+id);
           if(result.next()){
               e.setId(result.getInt("id"));
               e.setNom(result.getString("nom"));
               e.setPrenom(result.getString("prenom"));
               e.setSexe(result.getString("sexe"));
               e.setDaten(result.getDate("date_naiss"));
               e.setPhone(result.getString("phone"));
               e.setAdresse(result.getString("adresse"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return e;
    }

    @Override
    public void inserer(Etudiant e) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO etudiant(nom, prenom, sexe, date_naiss, phone, adresse) VALUES (?,?,?,?,?,?)");
            prepare.setString(1, e.getNom());
            prepare.setString(2, e.getPrenom());
            prepare.setString(3, e.getSexe());
            prepare.setString(4, amj.format(e.getDaten()));
            prepare.setString(5, e.getPhone());
            prepare.setString(6, e.getAdresse());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Etudiant e, long id) {
           SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE etudiant SET nom = ? , prenom = ?, sexe = ?, date_naiss = ? , phone = ?, adresse = ? WHERE id ="+id);
            prepare.setString(1, e.getNom());
            prepare.setString(2, e.getPrenom());
            prepare.setString(3, e.getSexe());
            prepare.setString(4, amj.format(e.getDaten()));
            prepare.setString(5, e.getPhone());
            prepare.setString(6, e.getAdresse());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
         try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM etudiant WHERE id ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Etudiant> liste() {
        List<Etudiant> etu = new ArrayList();
        Etudiant obj = new Etudiant();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM etudiant");
            while(result.next()){
            obj.setId(result.getInt("id"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("prenom"));
            obj.setSexe(result.getString("sexe"));
            obj.setDaten(result.getDate("date_naiss"));
            obj.setPhone(result.getString("phone"));
            obj.setAdresse(result.getString("adresse"));
            etu.add(obj);
            obj = new Etudiant();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return etu;
    }

    public int numetudiant(){
        int max=0;
        ResultSet result = null;
        try{
            result = this.connect.createStatement().executeQuery("SELECT MAX(id) as maximum FROM etudiant");
            if(result.next()){
                max= result.getInt("maximum");
            }
        }catch(SQLException ex){
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null ,ex);
        }
        return max;
    }
    
}
