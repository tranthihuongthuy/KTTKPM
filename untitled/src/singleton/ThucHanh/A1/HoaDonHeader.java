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
        StringBuilder builder = new StringBuilder();
        builder.append(soHD).append("\t")
                .append("Tên khách hàng: ").append(tenkhachhang).append("\t")
                .append("Ngày bán: ").append(ngayBan);
        return builder.toString();
    }
}
