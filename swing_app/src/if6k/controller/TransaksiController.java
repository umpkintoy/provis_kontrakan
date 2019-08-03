/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.controller;

import if6k.db.BaseContract;
import if6k.model.TransaksiModel;

/**
 *
 * @author shancheas
 */
public class TransaksiController extends BaseController {
    
    TransaksiModel mModel = new TransaksiModel();
    
    public TransaksiController(BaseContract contract) {
        super(contract);
    }
    
    public void loadContent() {
        mContract.onDataLoaded(mModel.all());
    }
}
