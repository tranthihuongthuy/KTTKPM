package singleton.ThucHanh.A1;

import java.util.Date;

public class HoaDonHeader {
    String soHD, tenkhachhang, ngayBan;

    public HoaDonHeader(String soHD, String tenkhachhang, String ngayBan) {
        this.soHD = soHD;
        this.tenkhachhang = tenkhachhang;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "soHD='" + soHD + '\'' +
                ", tenkhachhang='" + tenkhachhang + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                '}';
    }
}
