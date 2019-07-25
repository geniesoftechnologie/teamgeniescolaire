/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Connect {
    private static String url="jdbc:mysql://localhost/scolarite";
    private static String user="root";
    private static String passwd="";
    private static Connection connect;
    
    public static Connection getInstance(){
      if(connect == null){
          try{
              connect = (Connection)DriverManager.getConnection(url, user, passwd);
          }catch(SQLException e){
              e.printStackTrace();
          }
      } 
      return connect;
    }
}
