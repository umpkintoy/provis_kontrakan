/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.model;

import if6k.db.BaseConnection;
import java.sql.ResultSet;

/**
 *
 * @author shancheas
 */
public class UserModel extends BaseConnection{

    @Override
    protected String tableName() {
        return "admin";
    }
    
    public boolean authentication(String username, String password) {
        try {
            String query = "SELECT * FROM " + tableName() + " WHERE username = '" + username + "' AND password = md5('" + password + "')";
            ResultSet results = state.executeQuery(query);
            
            int count = 0;
            while(results.next()) {
                count++;
            }
            
            return count > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
