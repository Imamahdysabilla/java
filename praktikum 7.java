/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imam_praktikum.pkg7;

/**
 *
 * @author Praktikan
 */
class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiUts;
    private double nilaiTugas;
    private double nilaiUas;
    private double NA;   

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String npm, double nilaiUts, double nilaiTugas, double nilaiUas) {
        this.nama = nama;
        this.npm = npm;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }
    
    
    
    public void printData(){
        System.out.println("nama:" +nama);
        System.out.println("npm:" +npm);
        System.out.println("nilai Uts:" +nilaiUts);
        System.out.println("nilai Uas:" +nilaiUas);
        System.out.println("nilai Tugas:" +nilaiTugas);
    }
    
    public int sumValue(){
        return 10+3;
    }
    
    public void hitungNA(){
        NA = (nilaiTugas * 0.3) + (nilaiUts * 0.35) + (nilaiUas * 0.35);
        System.out.println("nilai akhir:" +NA);
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        NA = (nilaiTugas * 0.3) + (nilaiUts * 0.35) + (nilaiUas * 0.35);
        System.out.println("nilai akhir:" +NA);
    }
    
    public void hitungNA(String pesan){
        System.out.println(pesan);
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public double getNA() {
        return NA;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }
    
    
}