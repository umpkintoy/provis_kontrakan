/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.controller;

import if6k.db.BaseContract;
import if6k.model.PenyewaModel;

/**
 *
 * @author shancheas
 */
public class PenyewaController extends BaseController{
    
    PenyewaModel mModel = new PenyewaModel();
    
    public PenyewaController(BaseContract contract) {
        super(contract);
    }
    
    public void loadContent() {
        mContract.onDataLoaded(mModel.all());
    }
    
}
