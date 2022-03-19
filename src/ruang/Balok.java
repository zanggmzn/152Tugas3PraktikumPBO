/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.PersegiPanjang; 
/**
 *
 * @author asus
 */

public class Balok extends PersegiPanjang implements MenghitungRuang{
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public float luasPermukaan() {
         return 2*(this.luas()+panjang*tinggi+lebar*tinggi);
    }

    @Override
    public float volume() {
        return this.luas()*tinggi;
    }
}
