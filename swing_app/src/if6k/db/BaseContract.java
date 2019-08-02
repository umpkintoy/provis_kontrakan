/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.db;

import java.util.List;

/**
 *
 * @author shancheas
 */
public interface BaseContract {
    public void onDataLoaded(List<Object[]> data);
}
