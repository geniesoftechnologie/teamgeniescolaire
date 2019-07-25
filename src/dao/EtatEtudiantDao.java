/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Etudiant;
import classes.EtatEtudiant;
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
 public class EtatEtudiantDao extends Dao<EtatEtudiant> {

    @Override
    public EtatEtudiant rechercher(long id) {
        ResultSet result = null;
       EtatEtudiant i = new EtatEtudiant();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM etatetudiant WHERE id = "+id);
           if(result.next()){
               i.setId(result.getInt("id"));
               i.setNom(result.getString("nom"));
               i.setPrenom(result.getString("prenom"));
               i.setClasse(result.getString("classe"));
               i.setFiliere(result.getString("filiere"));
               i.setPaiement(result.getInt("paiement"));
               i.setDette(result.getInt("dette"));
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return i;

    }

    @Override
    public void inserer(EtatEtudiant i) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO etatetudiant(id,nom, prenom,classe,filiere,paiement,dette ) VALUES (?,?,?,?,?,?,?)");
            prepare.setInt(1, i.getId());
            prepare.setString(2, i.getNom());
            prepare.setString(3, i.getPrenom());
            prepare.setString(4, i.getClasse());
            prepare.setString(5, i.getFiliere());
            prepare.setInt(6, i.getPaiement());
            prepare.setInt(7, i.getDette());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modifier(EtatEtudiant i, long id) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE etatetudiant SET id =?, nom = ?, prenom = ?,classe = ?,filiere = ?,paiement = ?,dette= ? WHERE id ="+id);
            prepare.setInt(1, i.getId());
            prepare.setString(2, i.getNom());
            prepare.setString(3, i.getPrenom());
            prepare.setString(4, i.getClasse());
            prepare.setString(5, i.getFiliere());
            prepare.setInt(6, i.getPaiement());
            prepare.setInt(7, i.getDette());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM etatetudiant WHERE id ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<EtatEtudiant> liste() {
        List<EtatEtudiant> insc = new ArrayList();
        EtatEtudiant obj = new EtatEtudiant();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM etatetudiant");
            while(result.next()){
            obj.setId(result.getInt("id"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("prenom"));
            obj.setClasse(result.getString("classe"));
            obj.setFiliere(result.getString("filiere"));
            obj.setPaiement(result.getInt("paiement"));
            obj.setDette(result.getInt("dette")); 
            insc.add(obj);
            obj = new EtatEtudiant();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return insc;
    }
    
    public void actualiser(EtatEtudiant i, long id) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE etatetudiant SET nom =?, prenom = ?,classe = ?, filiere = ?, paiement = ?,dette= ? WHERE id ="+id);
            prepare.setString(1, i.getNom());
            prepare.setString(2, i.getPrenom());
            prepare.setString(3, i.getClasse());
            prepare.setString(4, i.getFiliere());
            prepare.setInt(5, i.getPaiement());
            prepare.setInt(6, i.getDette());
            
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualiser2(EtatEtudiant i, long id) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE etatetudiant SET classe = ?, filiere = ?, paiement = ?,dette= ? WHERE id ="+id);
            prepare.setString(1, i.getClasse());
            prepare.setString(2, i.getFiliere());
            prepare.setInt(3, i.getPaiement());
            prepare.setInt(4, i.getDette());
            
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    
    public int paiementetudiant( long id){
        int paiement=0;
        ResultSet result = null;
        try{
            result = this.connect.createStatement().executeQuery("SELECT paiement FROM etatetudiant where id= "+id);
            if(result.next()){
                paiement= result.getInt("paiement");
            }
        }catch(SQLException ex){
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null ,ex);
        }
        return paiement;
    }
    
    public int detteetudiant( long id){
        int dette=0;
        ResultSet result = null;
        try{
            result = this.connect.createStatement().executeQuery("SELECT dette FROM etatetudiant where id= "+id);
            if(result.next()){
                dette= result.getInt("dette");
            }
        }catch(SQLException ex){
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null ,ex);
        }
        return dette;
    }
 public List<EtatEtudiant> listeRetart() {
        List<EtatEtudiant> insc = new ArrayList();
        EtatEtudiant obj = new EtatEtudiant();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM etatetudiant where Dette > 400000 ");
            while(result.next()){
            obj.setId(result.getInt("id"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("prenom"));
            obj.setClasse(result.getString("classe"));
            obj.setFiliere(result.getString("filiere"));
            obj.setPaiement(result.getInt("paiement"));
            obj.setDette(result.getInt("dette")); 
            insc.add(obj);
            obj = new EtatEtudiant();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return insc;
    }
 public int montantById( long id){
        int somme=0;
        ResultSet result = null;
        try{
            result = this.connect.createStatement().executeQuery("SELECT paiement as montants FROM etatetudiant where id= "+id);
            if(result.next()){
                somme= result.getInt("montants");
            }
        }catch(SQLException ex){
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null ,ex);
        }
        return somme;
    }
    
     public int detteById( long id){
        int somme=0;
        ResultSet result = null;
        try{
            result = this.connect.createStatement().executeQuery("SELECT Dette as dette FROM etatetudiant where id= "+id);
            if(result.next()){
                somme= result.getInt("dette");
            }
        }catch(SQLException ex){
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null ,ex);
        }
        return somme;
    }
     
     public void actualiserModifier(EtatEtudiant i, long id) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE etatetudiant SET  paiement = ?,dette= ? WHERE id ="+id);
            prepare.setInt(1, i.getPaiement());
            prepare.setInt(2, i.getDette());
            
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EtatEtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

