/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imam;

/**
 *
 * @author Praktikan
 */
public class Imam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa  mhsl = new Mahasiswa();
       
       mhsl.nama="imam ahdy sabilla";
       mhsl.npm="2217051141";
       
      
       mhsl.insertNilaiUas(90);
       mhsl.insertNilaiUts(90);
       
       mhsl.dataMhs();
    }
    
}
