/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class ModTani {
    private int no;
    private String nama_bibit;
    private double harga_bibit;
    private double biaya_perawatan;
    private double hasil_kg;
    private double hasil_harga_kg;
    private double modal;
    private double total_hasil;
    private double ratio_kotor;

    //NO =======================================
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }

    //NAMA =======================================
    public String getNama_bibit() {
        return nama_bibit;
    }
    public void setNama_bibit(String nama_bibit) {
        this.nama_bibit = nama_bibit;
    }

    //HARGA BIBIT =======================================
    public double getHarga_bibit() {
        return harga_bibit;
    }
    public void setHarga_bibit(double harga_bibit) {
        this.harga_bibit = harga_bibit;
    }

    //BIAYA PERAWATAN =======================================
    public double getBiaya_perawatan() {
        return biaya_perawatan;
    }
    public void setBiaya_perawatan(double biaya_perawatan) {
        this.biaya_perawatan = biaya_perawatan;
    }

    //HASIL BERAT =======================================
    public double getHasil_kg() {
        return hasil_kg;
    }
    public void setHasil_kg(double hasil_kg) {
        this.hasil_kg = hasil_kg;
    }

    //HASIL HARGA PER KG =======================================
    public double getHasil_harga_kg() {
        return hasil_harga_kg;
    }
    public void setHasil_harga_kg(double hasil_harga_kg) {
        this.hasil_harga_kg = hasil_harga_kg;
    }
    
    //MODAL =======================================
    public double getModal() {
        return modal;
    }
    public void setModal(double modal) {
        this.modal = getHarga_bibit() + getBiaya_perawatan();
    }

    //TOTAL HASIL =======================================
    public double getTotal_hasil() {
        return total_hasil;
    }
    public void setTotal_hasil(double total_hasil) {
        this.total_hasil = getHasil_kg() * getHasil_harga_kg();
    }

    //RATIO KOTOR (PERBANDINGAN ANTARA [SELISIH HASIL KOTOR DAN MODAL] DENGAN MODAL) 
    public double getRatio_kotor() {
        return ratio_kotor;
    }
    public void setRatio_kotor(double ratio_kotor) {
        this.ratio_kotor = ((getTotal_hasil() - getModal()) / getTotal_hasil()) * 100;
    }
    
}