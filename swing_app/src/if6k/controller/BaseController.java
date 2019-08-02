/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.controller;

import if6k.db.BaseContract;

/**
 *
 * @author shancheas
 */
public abstract class BaseController {
    protected BaseContract mContract;
    
    public BaseController(BaseContract contract) {
        mContract = contract;
    }
}
