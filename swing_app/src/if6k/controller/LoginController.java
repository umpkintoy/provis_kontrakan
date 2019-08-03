/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.controller;

import if6k.db.BaseContract;
import if6k.db.UserLoginContract;
import if6k.model.UserModel;

/**
 *
 * @author shancheas
 */
public class LoginController extends BaseController<UserLoginContract>{
    
    UserModel mModel = new UserModel();
    
    public LoginController(UserLoginContract contract) {
        super(contract);
    }
    
    public void doLogin(String username, String password) {
        if (username.trim().isEmpty()) {
            mContract.showMessage("Username tidak boleh kosong!");
        }
        
        if (password.trim().isEmpty()) {
            mContract.showMessage("Password tidak boleh kosong!");
        }
        
        if (mModel.authentication(username, password)) {
            mContract.showMessage("Login Berhasil");
            mContract.onLoginSuccess();
        } else {
            mContract.showMessage("Username atau password salah!");
        }
    }
    
}
