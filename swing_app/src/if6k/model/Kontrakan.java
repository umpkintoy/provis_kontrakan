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
public class Kontrakan {
    int id;
    String alamat;
    String tipe;
    int nomor;
    int biaya;
    Date tanggalDiisi;
    boolean isAvailable;
    Pemilik pemilik;

    public int getId() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTipe() {
        return tipe;
    }

    public int getNomor() {
        return nomor;
    }

    public int getBiaya() {
        return biaya;
    }

    public Date getTanggalDiisi() {
        return tanggalDiisi;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }
    
    
}
