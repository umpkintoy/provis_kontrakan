/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.model;

import java.util.Date;

/**
 *
 * @author shancheas
 */
public class Penyewa {
    int id;
    String nama;
    String nik;
    int telpon;
    String daerahAsal;
    Date tanggalMulai;

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getTelpon() {
        return telpon;
    }

    public String getDaerahAsal() {
        return daerahAsal;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }
    
    
}
