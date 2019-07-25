/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author hp
 */
public abstract class Dao<T> {
    public Connection connect = Connect.getInstance();
    public Dao(){
        
    }
    public abstract T rechercher (long paramLong);
    public abstract void inserer (T paramT);
    public abstract void modifier(T paramT, long paramLong);
    public abstract void supprimer(long paramLong);
    public abstract List<T> liste();
}
