/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.blog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bardoz
 */
public class UserFactory {
    
    /**
     * Pattern singleton.
     */
    private static UserFactory instance;
    private ArrayList<User> userList = new ArrayList<>();
    
    private UserFactory()
    {
        User user1 = new User();
        user1.setId(0);
        user1.setName("nomefalso");
        user1.setSurname("cognomefalsissimo");
        user1.setEmail("mailmoltofalsa@google.it");
        user1.setPassword("passwordbrutta");
        user1.setUrlProfImg("img/profimgnomefalso.png");
        
        User user2 = new User();
        user2.setId(1);
        user2.setName("pippo");
        user2.setSurname("paperino");
        user2.setEmail("pippopaperino@pipppppo.it");
        user2.setPassword("passwordinutile");
        user2.setUrlProfImg("img/profimgpippopaperino.png");
        
        User user3 = new User();
        user3.setId(2);
        user3.setName("donald");
        user3.setSurname("trump");
        user3.setEmail("imrichbitch@trump.cia");
        user3.setPassword("123");
        user3.setUrlProfImg("img/trumpstar.png");
        
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }
    
    public static UserFactory getInstance()
    {
        if (instance == null)
            instance = new UserFactory();
        return instance;
    }
    
    public ArrayList<User> getUsers()
    {
        ArrayList<User> usersFromDB = new ArrayList<>();
        
        try {
            Connection conn = DbManager.getInstance().getDbConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from users";
            ResultSet set = stmt.executeQuery(sql);
            
            while (set.next()) {
                User userToAdd = new User();
                userToAdd.setId(set.getInt("id_user"));
                userToAdd.setName(set.getString("name"));
                userToAdd.setSurname(set.getString("surname"));
                userToAdd.setEmail(set.getString("email"));
                userToAdd.setPassword(set.getString("password"));
                userToAdd.setUrlProfImg(set.getString("urlProfImg"));
                
                usersFromDB.add(userToAdd);
            }
            
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserFactory.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        return usersFromDB;
    }
    
    public User getUserById(int id)
    {
        for (User user : userList)
            if (user.getId() == id)
                return user;
        
        return null;
    }
    
    public boolean login(String email, String password)
    {
        for(User user : userList)
            if (user.getEmail().equals(email) && user.getPassword().equals(password))
                return true;
        
        return false;
    }
    
    public User getUserByEmail(String email)
    {
        for (User user: userList)
            if (user.getEmail().equals(email))
                return user;
        
        return null;
    }

}
