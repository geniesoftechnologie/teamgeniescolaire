/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Etudiant;
import classes.Paiement;
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
 public class PaiementDao extends Dao<Paiement> {

    @Override
    public Paiement rechercher(long id) {
        ResultSet result = null;
       Paiement i = new Paiement();
        try {
           result = this.connect.createStatement().executeQuery("SELECT * FROM Paiement WHERE id = "+id);
           if(result.next()){
               i.setId(result.getInt("id"));
               i.setId_etu(result.getInt("id_etu"));
               i.setNom(result.getString("nom"));
               i.setPrenom(result.getString("prenom"));
               i.setClasse(result.getString("classe"));
               i.setFiliere(result.getString("filiere"));
               i.setAnnee(result.getString("annee"));
               i.setMontant(result.getInt("montant"));
               i.setDateIns(result.getDate("dateIns"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return i;

    }

    @Override
    public void inserer(Paiement i) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO Paiement(id_etu,nom, prenom,classe,filiere,annee,montant,dateIns ) VALUES (?,?,?,?,?,?,?,?)");
            prepare.setInt(1, i.getId_etu());
            prepare.setString(2, i.getNom());
            prepare.setString(3, i.getPrenom());
            prepare.setString(4, i.getClasse());
            prepare.setString(5, i.getFiliere());
            prepare.setString(6, i.getAnnee());
            prepare.setInt(7,i.getMontant());
            prepare.setString(8, amj.format(i.getDateIns()));
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modifier(Paiement i, long id) {
        SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE Paiement SET id_etu =?, nom = ?, prenom = ?,classe = ?,filiere = ?,annee = ?,montant = ?,dateIns = ? WHERE id ="+id);
            prepare.setInt(1, i.getId_etu());
            prepare.setString(2, i.getNom());
            prepare.setString(3, i.getPrenom());
            prepare.setString(4, i.getClasse());
            prepare.setString(5, i.getFiliere());
            prepare.setString(6, i.getAnnee());
            prepare.setInt(7,i.getMontant());
            prepare.setString(8, amj.format(i.getDateIns()));
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM Paiement WHERE id ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Paiement> liste() {
        List<Paiement> insc = new ArrayList();
        Paiement obj = new Paiement();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM Paiement");
            while(result.next()){
            obj.setId(result.getInt("id"));
            obj.setId_etu(result.getInt("id_etu"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("prenom"));
            obj.setClasse(result.getString("classe"));
            obj.setFiliere(result.getString("filiere"));
            obj.setAnnee(result.getString("annee"));
            obj.setMontant(result.getInt("montant"));
            obj.setDateIns(result.getDate("dateIns"));
            insc.add(obj);
            obj = new Paiement();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return insc;
    }
 public int payById (int id){
            int montant = 0;
        try {
            ResultSet result = null;
           result = this.connect.createStatement().executeQuery("SELECT montant as montants FROM Paiement WHERE id = "+id);
           if(result.next()){
               montant =result.getInt("montants");
                      }
        }catch (SQLException ex) {
            Logger.getLogger(PaiementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return montant;
        }
}
