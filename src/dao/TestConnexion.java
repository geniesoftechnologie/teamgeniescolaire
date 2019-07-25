/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author hp
 */
public class TestConnexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Connect.getInstance()!=null){
            System.out.println("la connexion a reussie");
        }else{
            System.out.println("la connexion a echoué");
        }
    }
    
}
