package dao;


import classes.Bulletin;
import dao.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BulletinDao extends Dao<Bulletin>{

    @Override
    public Bulletin rechercher(long id) {
        ResultSet result = null;
        Bulletin c = new Bulletin();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM bulletin WHERE id = "+id);
           if(result.next()){
               c.setId(result.getInt("id"));
               c.setId_etu(result.getInt("id_etu"));
               c.setNom(result.getString("nom"));
               c.setPrenom(result.getString("prenom"));
               c.setClasse(result.getString("classe"));
               c.setFiliere(result.getString("filiere"));
               c.setAnnee(result.getString("annee"));
               c.setSemestre(result.getString("semestre"));
               c.setJava(result.getFloat("java"));
               c.setLang(result.getFloat("langc"));
               c.setPhp(result.getFloat("php"));
               c.setSys(result.getFloat("sys"));
               c.setMath(result.getFloat("math"));
               c.setReseau(result.getFloat("reseau"));
               c.setSomme(result.getFloat("somme"));
               c.setMoyenne(result.getFloat("moy"));
               c.setRang(result.getString("etat"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(BulletinDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return c;
    }

    @Override
    public void inserer(Bulletin c) {
       try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO bulletin (id_etu,nom,prenom,classe,filiere,annee,semestre,java,langc,php,sys,math,reseau,somme,moy,etat) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, c.getId_etu());
            prepare.setString(2, c.getNom());
            prepare.setString(3, c.getPrenom());
            prepare.setString(4, c.getClasse());
            prepare.setString(5, c.getFiliere());
            prepare.setString(6, c.getAnnee());
            prepare.setString(7, c.getSemestre());
            prepare.setFloat(8, c.getJava());
            prepare.setFloat(9, c.getLang());
            prepare.setFloat(10, c.getPhp());
            prepare.setFloat(11, c.getSys());
            prepare.setFloat(12, c.getMath());
            prepare.setFloat(13, c.getReseau());
            prepare.setFloat(14, c.getSomme());
            prepare.setFloat(15, c.getMoyenne());
            prepare.setString(16, c.getRang());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BulletinDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Bulletin c, long id) {
          try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE bulletin SET id_etu = ?,nom =?, prenom = ?, classe = ?, filiere=?,annee=?,semestre=?,java=?,langc=?,php=?,sys=?,math=?,reseau = ?, somme=?, moy =?, etat=?  WHERE id ="+id);
            prepare.setInt(1, c.getId_etu());
            prepare.setString(2, c.getNom());
            prepare.setString(3, c.getPrenom());
            prepare.setString(4, c.getClasse());
            prepare.setString(5, c.getFiliere());
            prepare.setString(6, c.getAnnee());
            prepare.setString(7, c.getSemestre());
            prepare.setFloat(8, c.getJava());
            prepare.setFloat(9, c.getLang());
            prepare.setFloat(10, c.getPhp());
            prepare.setFloat(11, c.getSys());
            prepare.setFloat(12, c.getMath());
            prepare.setFloat(13, c.getReseau());
            prepare.setFloat(14, c.getSomme());
            prepare.setFloat(15, c.getMoyenne());
            prepare.setString(16, c.getRang());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BulletinDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
          try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM bulletin WHERE id ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BulletinDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Bulletin> liste() {
        List<Bulletin> cl = new ArrayList();
        Bulletin obj = new Bulletin();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM bulletin");
            while(result.next()){
            obj.setId(result.getInt("id"));
            obj.setId_etu(result.getInt("id_etu"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("Prenom"));
            obj.setClasse(result.getString("classe"));
            obj.setFiliere(result.getString("filiere"));
            obj.setAnnee(result.getString("annee"));
            obj.setSemestre(result.getString("semestre"));
            obj.setJava(result.getFloat("java"));
            obj.setLang(result.getFloat("langc"));
            obj.setPhp(result.getFloat("php"));
            obj.setSys(result.getFloat("sys"));
            obj.setMath(result.getFloat("math"));
            obj.setReseau(result.getFloat("reseau"));
            obj.setSomme(result.getFloat("somme"));
            obj.setMoyenne(result.getFloat("moy"));
            obj.setRang(result.getString("etat"));
            cl.add(obj);
            obj = new Bulletin();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BulletinDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cl;
    }
    
}
