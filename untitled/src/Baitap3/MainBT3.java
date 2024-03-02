package Baitap3;

public class MainBT3 {
    public static void main(String[] args) {
        //Sinh viên Poly
        SinhVienPoly sv1 = new SinhVienPoly("Trần Thị Hương Thủy","CNTT") {
            @Override
            public double getDiem() {
                return 8;
            }
        };
        sv1.Xuat();
        //Sinh viên IT
        SinhVienIT sv2 = new SinhVienIT("Lê Phan Bảo Ngoc","CNPM",6,7,8);
        sv2.Xuat();
        //Sinh viên Biz
        SinhVienBiz sv3 = new SinhVienBiz("Nguyễn Bảo Uyên","KT",7,8);
        sv3.Xuat();
    }
}
