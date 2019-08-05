/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import classes.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bureau
 */ 
public class UserDao extends Dao <User>{

    @Override
    public User rechercher(long id) {
         ResultSet result = null;
        User u = new User();
        try {
            
            result = this.connect.createStatement().executeQuery("SELECT * FROM vendeur WHERE idv ="+id);
            if(result.next() ){
                u.setIdu(result.getInt("idv"));
                u.setNom(result.getString("nom"));
                u.setPrenom(result.getString("prenom"));
                u.setLogin(result.getString("login"));
                u.setPassword(result.getString("pasword"));
                u.setProfil(result.getString("profil"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return u;
    }

    @Override
    public void inserer(User u) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO vendeur(nom, prenom, login, password, profil) VALUES (?,?,?,?,?)");
            prepare.setString(1, u.getNom());
            prepare.setString(2, u.getPrenom());
            prepare.setString(3, u.getLogin());
            prepare.setString(4, u.getPassword());
            prepare.setString(5, u.getProfil());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void supprimer(long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM vendeur WHERE idv ="+id);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(User u, long id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE vendeur SET nom = ? , prenom = ?, login = ?, pasword = ?, profil = ? WHERE idv ="+id);
            prepare.setString(1, u.getNom());
            prepare.setString(2, u.getPrenom());
            prepare.setString(3, u.getLogin());
            prepare.setString(4, u.getPassword());
            prepare.setString(5, u.getProfil());
            prepare.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> liste() {
        List<User> user = new ArrayList();
        User obj = new User();
        ResultSet result;
        try {
            result = this.connect.createStatement().executeQuery("SELECT * FROM vendeur");
            while(result.next()){
            obj.setIdu(result.getInt("idv"));
            obj.setNom(result.getString("nom"));
            obj.setPrenom(result.getString("prenom"));
            obj.setLogin(result.getString("login"));
            obj.setPassword(result.getString("pasword"));
            obj.setProfil(result.getString("profil"));
            user.add(obj);
            obj = new User();   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
   
    
    
    }
    

