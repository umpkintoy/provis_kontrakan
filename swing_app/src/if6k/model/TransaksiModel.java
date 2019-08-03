/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.model;

import if6k.db.BaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shancheas
 */
public class TransaksiModel extends BaseConnection{

    @Override
    protected String tableName() {
        return "transaksi";
    }
    
    private ResultSet allTransaction() throws SQLException {
        String query = "SELECT \n" +
                "transaksi.tanggal_transaksi, \n" +
                "kontrakan.biaya_sewa, kontrakan.nomor, \n" +
                "penyewa.nama \n" +
                "FROM transaksi INNER JOIN kontrakan \n" +
                "INNER JOIN penyewa";
        return state.executeQuery(query);
    }
    
    public List<Object[]> all() {
        List<Object[]> data = new ArrayList<>();
        try {
            ResultSet results = allTransaction();
            while (results.next()) {
                data.add(new Object[]{
                    results.getString(1),
                    results.getString(4),
                    "Kontrakan nomor " + results.getString(3),
                    results.getString(2),
                });
            }
            return data;
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
