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
public class CreateUserDao {

    private final MySQLConnection connexion;
    
    public CreateUserDao()
    {
        this.connexion = MySQLConnection.getConnexion();
    }
    
}
