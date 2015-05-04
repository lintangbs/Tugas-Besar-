package test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {

    Scanner scan = new Scanner(System.in);
    Ruangan dataObject = new Ruangan();
    int luas_ruangan;
    int rasio;

    public void Inputan1() {
        dataObject.setNama_ruang(JOptionPane.showInputDialog("Masukkan Nama Ruang"));
        dataObject.setLokasi_ruang(JOptionPane.showInputDialog("Masukkan lokasi ruangan"));
        dataObject.setFakultas(JOptionPane.showInputDialog("Masukkan Nama fakultas"));
        String Panjang_ruangan = JOptionPane.showInputDialog("Masukkan panjang ruangan");
        dataObject.setPanjang_ruang(Integer.parseInt(Panjang_ruangan));
        String Lebar_ruangan = JOptionPane.showInputDialog("Masukkan Lebar Ruangan");
        dataObject.setLebar_ruang(Integer.parseInt(Lebar_ruangan));
    }

    public void Inputan2() {
        String jumlah_pintu = JOptionPane.showInputDialog("masukkan jumlah pintu");
        dataObject.setJumlah_pintu(Integer.parseInt(jumlah_pintu));
        String jumlah_cendela = JOptionPane.showInputDialog("Masukkan Jumlah cendela");
        dataObject.setJumlah_cendela(Integer.parseInt(jumlah_cendela));
    }

    public void Inputan3() {
        String jumlah_kursi = JOptionPane.showInputDialog("Masukkan jumlah kursi");
        dataObject.setJumlah_kursi(Integer.parseInt(jumlah_kursi));
    }

    public void Tampil() {
        JOptionPane.showMessageDialog(null, "Nama ruang : " + dataObject.getNama_ruang() + "\nLokasi Ruang : " + dataObject.getLokasi_ruang() + "\nFakultas : " + dataObject.getLokasi_ruang() + "\nPanjang Ruang : " + dataObject.getPanjang_ruang() + "\nLebar ruangan : " + dataObject.getLebar_ruang());
    }

    public void Inputan4() {
        String jumlah_stop_kontak = (JOptionPane.showInputDialog("Masukkan jumlah stop kontak"));
        dataObject.setStop_kontak(Integer.parseInt(jumlah_stop_kontak));
        dataObject.setKondisi_stop_kontak(JOptionPane.showInputDialog("kondisi_stop_kontak"));
        dataObject.setPosisi_stop_kontak(JOptionPane.showInputDialog("Masukkan Posisi"));
    }
    
    public void Inputan5() {
        String jumlah_Kabel_lcd = (JOptionPane.showInputDialog("Masukkan jumlah Kabel LCD"));
        dataObject.setJumlah_kabel_LCD(Integer.parseInt(jumlah_Kabel_lcd));
        dataObject.setKondisi_kabel_LCD(JOptionPane.showInputDialog("kondisi_stop_kontak"));
        dataObject.setPosisi_kabel_LCD(JOptionPane.showInputDialog("Masukkan Posisi kabel LCD"));
    }

    public void Inputan6() {
        String Jumlah_lampu = JOptionPane.showInputDialog("Masukkan jumlah lampu");
        dataObject.setJumlah_lampu(Integer.parseInt(Jumlah_lampu));
        dataObject.setKondisi_lampu(JOptionPane.showInputDialog("Masukkan kondisi lampu"));
        dataObject.setPosisi_lampu(JOptionPane.showInputDialog("Masukkan posisi lampu"));
    }

    public void Inputan7() {
        String jumlah_kipas_angin = JOptionPane.showInputDialog("Masukkan jumlah kipas angin");
        dataObject.setKipas_angin(Integer.parseInt(jumlah_kipas_angin));
        dataObject.setKondisi_kipas_angin(JOptionPane.showInputDialog("Masukkan kondisi kipas angin"));
        dataObject.setPosisi_kipas_angin(JOptionPane.showInputDialog("Masukkan posisi kipas angin"));
    }

    public void Inputan8() {
        String jumlah_ac = JOptionPane.showInputDialog("Masukkan jumlah AC");
        dataObject.setJumlah_AC(Integer.parseInt(jumlah_ac));
        dataObject.setKondisi_AC(JOptionPane.showInputDialog("Masukkan kondisi AC"));
        dataObject.setPosisi_AC(JOptionPane.showInputDialog("Masukkan posisi AC"));
    }

    public void InputSSID() {
        dataObject.setSSID(JOptionPane.showInputDialog("Masukkan SSID"));
        String bandwith = JOptionPane.showInputDialog("Masukkan Bandwith");
        dataObject.setBandwith(Integer.parseInt(bandwith));
    }

    public void Input_CCTV() {
        String jumlah_cctv = JOptionPane.showInputDialog("masukkan jumlah CCTV");
        dataObject.setCctv(Integer.parseInt(jumlah_cctv));
        dataObject.setKondisi_cctv(JOptionPane.showInputDialog("masukkan kondisi CCTV"));
        dataObject.setPosisi_cctv(JOptionPane.showInputDialog("masukkan posisi CCTV"));
    }

    public void Input_keadaan_kebersihan() {
        dataObject.setKondisi_lantai(JOptionPane.showInputDialog("Masukkan kondisi lantai *baik/buruk"));
        dataObject.setKondisi_dinding(JOptionPane.showInputDialog("Masukkan kondisi Dinding"));
        dataObject.setKondisi_atap(JOptionPane.showInputDialog("Masukkan kondisi atap"));
        dataObject.setKondisi_pintu(JOptionPane.showInputDialog("masukkan kondisi pintu"));
        dataObject.setKondisi_jendela(JOptionPane.showInputDialog("Masukkan kondisi jendela"));
    }

    public void Input_sirkulasi_udara() {
        dataObject.setKondisi_udara(JOptionPane.showInputDialog("Masukkan kondisi udara"));
    }

    public void Input_pencahayaan() {
        String pencahayaan = JOptionPane.showInputDialog("Masukkan nilai pencahayaan");
        dataObject.setCahaya(Integer.parseInt(pencahayaan));
    }

    public void Input_kelembapan() {
        String Kelembapan = JOptionPane.showInputDialog("Masukkan nilai kelembapan");
        dataObject.setKelembaban(Integer.parseInt(Kelembapan));
    }

    public void Input_suhu() {
        String suhu = JOptionPane.showInputDialog("Masukkan nilai suhu");
        dataObject.setSuhu(Integer.parseInt(suhu));
    }

    public void Input_kebisingan() {
        dataObject.setKebisingan(JOptionPane.showInputDialog("Apakan kelasnya pada area bising"));
    }

    public void Input_bau() {
        dataObject.setBau(JOptionPane.showInputDialog("Apa kelas anda bau atau tidak *ya/tidak"));
    }

    public void Input_kebpcoran() {
        dataObject.setKebocoran(JOptionPane.showInputDialog("kelas bocor atau tidak"));
    }
    public void Input_keausan() {
        dataObject.setKeausan(JOptionPane.showInputDialog("Masukkan keausan *aus/tidak"));
    }

}
