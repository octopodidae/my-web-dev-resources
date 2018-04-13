/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebdevresources.models;

/**
 *
 * @author blaurancin
 */
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
 
 
public class ConnectionBDPostgreSQL { 
     
    /** 
     * URL de connection 
    */ 
    private static String url = "jdbc:postgresql://localhost:5432/mywebdevresources"; 
     
    private static String user = "bla"; 
     
    private static String passwd ="berlau"; 
 
    /** 
     * Objet Connection 
     */ 
    private static Connection connect; 
 
 
    /** 
     * Méthode d’accès à l’instance unique 
     * du singleton 
     * @return connect l’instance de la connection 
     */ 
    public static Connection getInstance() { 
            if(connect == null){ 
                
                    try { 
                        try { 
                            Class.forName("org.postgresql.Driver"); 
                        } catch (ClassNotFoundException ex) { 
                            Logger.getLogger(ConnectionBDPostgreSQL.class 
.getName()).log(Level.SEVERE, null, ex); 
                        } 
                            connect = DriverManager.getConnection(url, user, 
passwd); 
                    } catch (SQLException e) { 
                            e.printStackTrace(); 
                            System.out.println("connexion erreur erreur"); 
                    } 
            } 
            return connect; 
    }     
}
