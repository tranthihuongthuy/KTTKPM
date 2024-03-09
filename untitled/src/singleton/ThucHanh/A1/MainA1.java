package singleton.ThucHanh.A1;
public class MainA1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader("HD001","Trần Thị Hương Thủy","08/03/2024")
                .addCTHD("Tivi",7,120000,5)
                .addCTHD("Dien Thoai",8,1500000,4)
                .build();
        System.out.println(hoaDon.toString());
    }
}
