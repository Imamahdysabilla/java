/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama;
    public String npm;
    private double nilaiUas;
    private double nilaiUts;
    
    public void insertNilaiUas(double nilai){
        nilaiUas = nilai;
    }
    public void insertNilaiUts(double nilai){
        nilaiUts = nilai;
    }
    public void dataMhs(){
        System.out.println("Nama :" +nama);
        System.out.println("NPM :" +npm);
        System.out.println("UTS :" +nilaiUts);
        System.out.println("UAS :" +nilaiUas);
        System.out.println(nilaiAkhir());
    }
    
    public double nilaiAkhir(){
        return (nilaiUts + nilaiUas)/2;
    }
}
