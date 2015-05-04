
package test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Analisis {
    Scanner scan = new Scanner(System.in);
    Ruangan dataObject = new Ruangan();
    boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u; ;

    public boolean Luas_ruangan() {
    if(dataObject.getPanjang_ruang() != dataObject.getLebar_ruang()){
            JOptionPane.showInputDialog("bentuk : persegi panjang");
            JOptionPane.showInputDialog("sesuai");
            a = true;
    }else{
            JOptionPane.showInputDialog("tidak sesuai");
            a = false;
        }
        return a;
    }

    public boolean Pengkondisian_rasio() {
        if(hitung_rasio() >= 0.5){
            JOptionPane.showInputDialog("sesuai");
            b = true;
        }
        else{
            JOptionPane.showInputDialog("tidak sesuai");
            b = false;
        }
        return b;
    }

     public boolean Penkondisian_luas() {
        if (dataObject.getPanjang_ruang() != dataObject.getLebar_ruang()) {
            JOptionPane.showMessageDialog(null, "Persegi Panjang");
            JOptionPane.showMessageDialog(null, "Hasil Sesuai");
        }else{
            JOptionPane.showInputDialog(null,"tidak sesuai");
            c = false;
        }
        return c;
}

    public boolean Analisis_jumlah_cendela_dan_pintu() {
        if(dataObject.getJumlah_cendela() >= 1){
            JOptionPane.showInputDialog(null,"sesuai");
            d = true;
        }else{
            JOptionPane.showInputDialog(null,"tidak sesuai");
            d = false;
        }
        return d;  //  JOptionPane.showMessageDialog(null, "Jumlah pintu sesuai");
        }
    public boolean Analisis_jumlah_pintu(){
        if(dataObject.getJumlah_pintu() >= 2){
            JOptionPane.showInputDialog(null,"sesuai");
            e = true;
        }else{
            JOptionPane.showInputDialog(null,"tidak sesuai");
            e = false;
        }
        return e;
        }
    public boolean Analisis_kelistrikan() {
        if (dataObject.getStop_kontak() >= 4) {
            JOptionPane.showMessageDialog(null, "Hasil jumlah stop kontak sesuai dengan ruangan");
        }
        if (dataObject.getKondisi_stop_kontak().equalsIgnoreCase("baik")) {
            JOptionPane.showMessageDialog(null, "Keadaan stop kontak baik");
        }
        if (dataObject.getPosisi_stop_kontak().equalsIgnoreCase("pojok") && dataObject.getKondisi_stop_kontak().equalsIgnoreCase("dekat dosen")) {
            JOptionPane.showMessageDialog(null, "Tempat dan kondisi stop kontak Sesuai");
        f = true ;
        }else{
            JOptionPane.showInputDialog(null, "Stop kontak tidak sesuai");
            f = false;
        }
        return f;
    }
    public boolean Pengkondisian_kabel_lcd() {
        if (dataObject.getJumlah_kabel_LCD() >= 1) {
            JOptionPane.showMessageDialog(null,"Jumlah kabel LCD Sesua");
        }
        if (dataObject.getKondisi_kabel_LCD().equalsIgnoreCase("baik")) {
            JOptionPane.showMessageDialog(null, "kondisi kabel LCD sedang baik dan sesuai");
        }
        if (dataObject.getPosisi_kabel_LCD().equalsIgnoreCase("Pojok")) {
            JOptionPane.showMessageDialog(null, "Posisi kabel LCD Sesua");
            g = true ;
        }else{
            JOptionPane.showInputDialog(null, "Tidak sesuai");
            g = false;
        }
        return g;
    }
    public boolean Penkondisian_lampu() {
        if (dataObject.getJumlah_lampu() >= 18) {
            JOptionPane.showMessageDialog(null, "Jumlah lampu yang tersedia sesuai");
        }
        if (dataObject.getKondisi_lampu().equalsIgnoreCase("Baik")) {
            JOptionPane.showMessageDialog(null, "Kondisi Lampu dalam keadaan baik");
            h = true ;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            h = false;
        }
        return h;
    }
    public boolean Pengkondisian_kipas_angin() {
        if (dataObject.getKipas_angin() >= 2) {
            JOptionPane.showMessageDialog(null, "Jumlah kipas angin sudah sesuai dengan yang di inginkan");
        }
        if (dataObject.getKondisi_kipas_angin().equalsIgnoreCase("baik")) {
            JOptionPane.showMessageDialog(null, "Kondisi kipas angin sedang baik");
        }
        if (dataObject.getPosisi_kipas_angin().equalsIgnoreCase("atap")) {
            JOptionPane.showMessageDialog(null, "posisi kipas angin sesuai dengan yang di butuhkan");
            i = true ;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            i = false ;
        }
        return i;
    }
    public boolean Pendkondisian_ac() {
        if (dataObject.getJumlah_AC() >= 1) {
            JOptionPane.showMessageDialog(null, "Jumlah kondisi AC sesuai");
        }
        if (dataObject.getKondisi_AC().equalsIgnoreCase("baik")) {
            JOptionPane.showMessageDialog(null, "Kondisi ac masih baik");
        }
        if (dataObject.getPosisi_AC().equalsIgnoreCase("belakang") || dataObject.getPosisi_AC().equalsIgnoreCase("samping")) {
            JOptionPane.showMessageDialog(null, "Posisi AC pada tempat yang tepat");
            j = true;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            j = false ;
        }
        return j;
    }
    public boolean Pengkondisian_SSID() {
        if (dataObject.getSSID().equalsIgnoreCase("UMM Hotspot")) {
            JOptionPane.showMessageDialog(null, "SSID yang anda gunakan Sesuai");
        }
        if (dataObject.getBandwith() >= 512) {
            JOptionPane.showMessageDialog(null, "Anda dapat login");
        k = true ;
        }else{
            JOptionPane.showInputDialog(null, "Tidak seseuai");
        }
        return k;
    }
   public boolean Pengkondisian_CCTV() {
        if (dataObject.getCctv() >= 2) {
            JOptionPane.showMessageDialog(null, "Jumlah CCTV sudah sesuai");
        }
        if (dataObject.getKondisi_cctv().equalsIgnoreCase("baik")) {
            JOptionPane.showMessageDialog(null, "Kondisi CCTV dalam keadaan baik");
        }
        if (dataObject.getPosisi_cctv().equalsIgnoreCase("Depan") || dataObject.getPosisi_cctv().equalsIgnoreCase("belakang")) {
            JOptionPane.showMessageDialog(null, "letak CCTV sesuai dengan apa yang di butuhkan");
        l = true ;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            l = false ;
        }
        return l;
    }
   public boolean Pengkondisian_kebersihan() {
        if (dataObject.getKondisi_lantai().equalsIgnoreCase("bersih") && dataObject.getKondisi_dinding().equalsIgnoreCase("bersih") && dataObject.getKondisi_atap().equalsIgnoreCase("bersih") && dataObject.getKondisi_pintu().equalsIgnoreCase("bersih") && dataObject.getKondisi_jendela().equalsIgnoreCase("bersih")) {
            JOptionPane.showMessageDialog(null, "Kondisi kebersihan dalam keadaan bersih");
            JOptionPane.showInputDialog(null,"Sesuai");
            m = true ;
        } else {
            JOptionPane.showMessageDialog(null, "kondisi kebersihan dalam keadaan buruk");
            m = false ;
        }
        return m ;
    }
   public boolean Penkondisian_sirkulasi_udara() {
        if (dataObject.getKondisi_udara().equalsIgnoreCase("Lancar")) {
            JOptionPane.showMessageDialog(null, "Kondisi Udara Lancar dan baik");
            n = true ;
        } else {
            JOptionPane.showMessageDialog(null, "kondisi udara kurang baik");
            n = false ;
        }
        return n;
    }
   public boolean Penkondisian_cahaya() {
        if (dataObject.getCahaya() >= 250) {
            JOptionPane.showMessageDialog(null, "Kondisi cahaya dalam keadaan baik sesuai");
            o = true ;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            o = false ;
        }
        return o;
    }
   public boolean Pengkondisian_kelembapan() {
        if (dataObject.getKelembaban() >= 70 && dataObject.getKelembaban() <= 80) {
            JOptionPane.showMessageDialog(null, "Kelembapan kelas ini sesuai");
            p = true ;
        } else {
            JOptionPane.showMessageDialog(null, "Kelembapan kelas ini tidak sesuai");
            p = false ;
        }
        return p;
    }
    public boolean Penkondisian_suhu() {
        if (dataObject.getSuhu() >= 25 && dataObject.getSuhu() <= 35) {
            JOptionPane.showMessageDialog(null, "Suhu ruangan Sesuai");
            q = true ;
        } else {
            JOptionPane.showMessageDialog(null, "Suhu ruangan tidak sesuai");
            q = false ;
        }
        return q ;
    }
    public boolean Pengkondisian_kebisingan() {
        if (dataObject.getKebisingan().equalsIgnoreCase("tidak")) {
            JOptionPane.showMessageDialog(null, "Kelas anda baik dan sesuai");
            r = true ;
        } else {
            JOptionPane.showMessageDialog(null, "Sebaiknya anda pindah saja karena kelas tidak sesuai");
            r = false ;
        }
        return r;
    }
    public boolean Pengkondisian_bau() {
        if (dataObject.getBau().equalsIgnoreCase("ya")) {
            JOptionPane.showMessageDialog(null, "Kelas anda tidak layak di tempati karena tidak sesuai");
        }
        if (dataObject.getBau().equalsIgnoreCase("tidak")) {
            JOptionPane.showMessageDialog(null, "Kelas cocok di tempati karena sesuai");
            s = true ;
        }else{
            JOptionPane.showInputDialog(null,"Tidak sesuai");
            s =  false ;
        }
        return s;
    }
    public boolean Pengkondisian_bocornya() {
        if (dataObject.getKebocoran().equalsIgnoreCase("ya")) {
            JOptionPane.showMessageDialog(null, "Kelas tidak sesuai");
            t = true ;
        }
        if (dataObject.getKebocoran().equalsIgnoreCase("tidak")){
            JOptionPane.showMessageDialog(null, "Kelas sesuai");
            t = false ;
        }
        return t;
    }
    public boolean Pengkondisian_keausan() {
        if (dataObject.getKeausan().equalsIgnoreCase("aus")) {
            JOptionPane.showMessageDialog(null, "Kelas tidak layak di pakai");
            u = true ;
        }
        if (dataObject.getKeausan().equalsIgnoreCase("tidak")) {
            JOptionPane.showMessageDialog(null, "Kelas layak dipakai");
            u = false ;
        }
        return u;
    }

    private double hitung_rasio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
