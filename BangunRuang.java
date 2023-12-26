package pkg22166017.pbo.lat61;

/**
 *
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public abstract class BangunRuang {
    public abstract double hitungVolume();
}

class Bola extends BangunRuang {
    private double jarijari;
    
    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(jarijari, 3);
    }
}

class Tabung extends BangunRuang {
    private double jarijari;
    private double tinggi;
    
    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}

class Kerucut extends BangunRuang {
    private double jarijari;
    private double tinggi;
    
    public Kerucut(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
  
    public static void main(String[] args) {
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(10, 21);
        Kerucut kerucut = new Kerucut(14, 9);

        System.out.println("Volume Bola: " + bola.hitungVolume());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
    }
}
