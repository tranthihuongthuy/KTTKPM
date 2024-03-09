package singleton.ThucHanh.A6;

public class SanPham {
    String maSP, tenSP;
    int soluong;
    double dongia;

    public SanPham(String maSP, String tenSP, int soluong, double dongia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
}
