/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shancheas
 */
public abstract class BaseView extends JFrame {
    public void showPaneMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
}
