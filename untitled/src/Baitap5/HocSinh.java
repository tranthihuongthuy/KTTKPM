package Baitap5;

public class HocSinh extends CaNhan{
    String lop, nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sdt, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        String tt = super.HienThiTT();
        return tt + "Học sinh" +
                ", Lớp: " + lop +
                ", Năng khiếu: " + nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
}
