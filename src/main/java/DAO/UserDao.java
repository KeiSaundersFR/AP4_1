/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MySQLConnection;
import model.User;

/**
 *
 * @author t.xiong
 */
public class UserDao {

    private final Connection connexion;

    public UserDao() {
        this.connexion = MySQLConnection.getConnexion();
    }

    public ArrayList<User> getAll() {
        try {
            String query = "SELECT * FROM utilisateur;";
            
            PreparedStatement ps = this.connexion.prepareStatement(query);
            ResultSet res = ps.executeQuery();

            ArrayList<User> userList = new ArrayList<User>();

            while (res.next()) {
                int id = res.getInt("ID_Utilisateur");
                String identifant = res.getString("IDENTIFIANT");
                String mdp = res.getString("MOT_DE_PASSE");
                String role = res.getString("ROLE");

                userList.add(new User(id, identifant, mdp, role));
            }

            return userList;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }

    }

}
