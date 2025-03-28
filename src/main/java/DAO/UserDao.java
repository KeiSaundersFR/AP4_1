/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.MySQLConnection;
import java.sql.PreparedStatement;
import model.MySQLConnection;

/**
 *
 * @author t.xiong
 */
public class UserDao {

    private final MySQLConnection connexion;
    
    public UserDao()
    {
        this.connexion = MySQLConnection.getConnexion();
    }
    
}
