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
        StringBuilder builder = new StringBuilder();
        builder.append(sanPham).append("\t")
                .append("Số lượng: ").append(soLuong).append("\t")
                .append("Đơn giá: ").append(donGia).append("\t")
                .append("Chiết khấu: ").append(chietkhau);
        return builder.toString();
    }
}
