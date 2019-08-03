/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.model;

import if6k.db.BaseConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shancheas
 */
public class KontrakanModel extends BaseConnection{

    @Override
    protected String tableName() {
        return "kontrakan";
    }
    
    public List<Object[]> all() {
        List<Object[]> data = new ArrayList<>();
        try {
            ResultSet results = getAll();
            while (results.next()) {
                data.add(new Object[]{
                    results.getString(2),
                    results.getString(4),
                    results.getString(3),
                    results.getString(5),
                    results.getInt(7) == 0 ? "Terisi" : "Kosong",
                    results.getString(6),
                    "So Lee Heen",
                });
            }
            return data;
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
