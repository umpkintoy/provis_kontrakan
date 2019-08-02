/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.model;

import if6k.db.BaseConnection;

/**
 *
 * @author shancheas
 */
public class TransaksiModel extends BaseConnection{

    @Override
    protected String tableName() {
        return "transaksi";
    }
    
}
