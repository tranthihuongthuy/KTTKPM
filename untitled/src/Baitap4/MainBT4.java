package Baitap4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("001","Tài xế 1", "xe01", 180_000, 4, 2000));
        quanLyChuyenXe.them(new ChuyenXeNoiThanh("002","Tài xế 2", "xe02", 150_000, 3, 900));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("003","Tài xế 3", "xe03", 300_000, "Phú Yên", 4));
        quanLyChuyenXe.them(new ChuyenXeNgoaiThanh("004","Tài xế 4", "xe04", 250_000, "Khánh Hòa", 6));

        quanLyChuyenXe.inDS();
        System.out.println("Doanh thu chuyến xe ngoại thành: "+quanLyChuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("Doanh thu chuyến xe nội thành: "+quanLyChuyenXe.doanhThuXeNoiThanh());
        System.out.println("Doanh thu tất cả chuyến xe: "+quanLyChuyenXe.doanhThuHaiLoaiXe());
    }
}
