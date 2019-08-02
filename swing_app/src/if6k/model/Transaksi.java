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
public class Transaksi {
    int id;
    Date tanggalTransaksi;
    Penyewa penyewa;
    Kontrakan kontrakan;

    public int getId() {
        return id;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public Kontrakan getKontrakan() {
        return kontrakan;
    }
}
