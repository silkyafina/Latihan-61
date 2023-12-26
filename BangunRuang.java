/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat61;

/**
 *
 * @author User
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public abstract class BangunRuang {
    protected double jarijari;
    protected int tinggi;
    
    public BangunRuang(double jarijari, int tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }   
    
    public double getJarijari(){
        return jarijari;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public abstract double hitungVolume();
}

class Bola extends BangunRuang {
    public Bola(double jarijari, int tinggi) {
        super(jarijari, tinggi);
    }

    @Override
    public double hitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(jarijari, 3);
    }
}

class Tabung extends BangunRuang {
    public Tabung(double jarijari, int tinggi) {
        super(jarijari, tinggi);
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}

class Kerucut extends BangunRuang {
    public Kerucut(double jarijari, int tinggi) {
        super(jarijari, tinggi);
    }

    @Override
    public double hitungVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
    
    public static void main(String[] args) {
        Bola bola = new Bola(7.0, 0);
        Tabung tabung = new Tabung(10, 21);
        Kerucut kerucut = new Kerucut(14, 9);

        System.out.println("Volume Bola: " + bola.hitungVolume());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
    }
}

    

    


   
