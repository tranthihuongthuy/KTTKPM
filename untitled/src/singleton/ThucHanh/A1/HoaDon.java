package singleton.ThucHanh.A1;

import singleton.builder.Computer;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    private HoaDon(Builder b) {
        header = b.header;
        cthds = b.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        builder.append("\n");
        builder.append("Chi tiết hóa đơn");
        for(CTHD c: cthds)
            builder.append("\n")
                    .append(c.toString());
        return builder.toString();
    }

    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();
        public Builder setHeader(String soHD, String khachHang, String ngayBan){
            header = new HoaDonHeader(soHD,khachHang,ngayBan);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
