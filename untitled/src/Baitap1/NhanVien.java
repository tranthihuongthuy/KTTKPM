package Baitap1;

public class NhanVien {
    String ten, diachi;
    int tuoi, tongsogiolam;
    double tienluong;

    public NhanVien() {
    }

    public NhanVien(String ten, String diachi, int tuoi, int tongsogiolam, double tienluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.tongsogiolam = tongsogiolam;
        this.tienluong = tienluong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public double getTienluong() {
        return tienluong;
    }

    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", tuoi=" + tuoi +
                ", tongsogiolam=" + tongsogiolam +
                ", tienluong=" + tienluong +
                '}';
    }
    double tinhthuong(){
        if(tongsogiolam>=200) return tienluong * 0.2;
        if(tongsogiolam<200 && tongsogiolam >=100) return tienluong * 0.1;
        return 0;
    }
}
