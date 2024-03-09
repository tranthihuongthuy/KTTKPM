package singleton.ThucHanh.A6;

import java.util.List;

public class MainA6 {
    public static void main(String[] args) {
        // Khởi tạo và sử dụng đối tượng SanPham
        SanPham sanPham1 = new SanPham("SP001", "Laptop", 10, 1500.0);
        SanPham sanPham2 = new SanPham("SP002", "Điện thoại", 20, 800.0);

        // Khởi tạo và sử dụng đối tượng DataAccess
        DataAccess dataAccess = DataAccess.getInstance();
        dataAccess.themSanPham(sanPham1);
        dataAccess.themSanPham(sanPham2);

        // In danh sách sản phẩm từ DataAccess
        List<SanPham> danhSachSanPham = dataAccess.getDanhSachSanPham();
        System.out.println("Danh sách sản phẩm từ DataAccess:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp.getMaSP() + " - " + sp.getTenSP() + " - " + sp.getSoluong() + " - " + sp.getDongia());
        }

        // Khởi tạo và sử dụng đối tượng DataAccessUpgrade
        DataAccessUpgrade dataAccessUpgrade1 = DataAccessUpgrade.getInstance("Tag1");
        dataAccessUpgrade1.add("SP005");

        DataAccessUpgrade dataAccessUpgrade2 = DataAccessUpgrade.getInstance("Tag2");
        dataAccessUpgrade2.add("SP006");

        // In danh sách sản phẩm từ DataAccessUpgrade
        System.out.println("\nDanh sách sản phẩm từ DataAccessUpgrade (Tag1):");
        List<String> danhSachSPUpgrade1 = dataAccessUpgrade1.dsSP;
        for (String sp : danhSachSPUpgrade1) {
            System.out.println(sp);
        }

        System.out.println("\nDanh sách sản phẩm từ DataAccessUpgrade (Tag2):");
        List<String> danhSachSPUpgrade2 = dataAccessUpgrade2.dsSP;
        for (String sp : danhSachSPUpgrade2) {
            System.out.println(sp);
        }
    }
}
