package behavioral.cc2_qlsv;

public class MainQLSV {
    public static void main(String[] args) {
        QLSinhVien qlsv = new QLSinhVien();
        qlsv.them(new SinhVien("Trần Thị Hương Thủy","27/08/2003",8.9f));
        qlsv.them(new SinhVien("Lê Trung Hoàng","12/09/2001",7.9f));
        qlsv.them(new SinhVien("Uyên Nguyễn Bảo","10/04/2003",8.5f));
        qlsv.them(new SinhVien("Lê Phan Bảo Ngọc","12/12/2003",9.0f));
        System.out.println("Sắp xếp theo điểm:");
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        qlsv.inDS();
        System.out.println("Sắp xếp theo họ tên:");
        qlsv.setSoSanh(new SoSanhTheoHoTen()).sapXep();
        qlsv.inDS();
    }
}
