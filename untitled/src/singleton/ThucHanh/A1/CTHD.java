package singleton.ThucHanh.A1;

public class CTHD {
    String sanPham;
    int soLuong, donGia;
    float chietkhau;

    public CTHD(String sanPham, int soLuong, int donGia, float chietkhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietkhau=" + chietkhau +
                '}';
    }
}
