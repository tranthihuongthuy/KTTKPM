package composite.B4;

public class MainMonHoc {
    public static void main(String[] args) {
        KeHoachHocTap khoaHoc = new HocNuaHocMai("Khóa K63");
        KeHoachHocTap nam1 = new HocNuaHocMai("năm 2022-2022");
        KeHoachHocTap nam2 = new HocNuaHocMai("năm 2023 - 2024");
        KeHoachHocTap ky1 = new HocNuaHocMai("Kỳ 1");
        KeHoachHocTap ky2 = new HocNuaHocMai("Kỳ 2");
        KeHoachHocTap ky3 = new HocNuaHocMai("Kỳ 3");
        KeHoachHocTap ky4 = new HocNuaHocMai("Kỳ 4");
        KeHoachHocTap lichSuDang = new MonHoc("Lịch sử Đảng",2,300);
        KeHoachHocTap toan = new MonHoc("Toán",3,450);
        KeHoachHocTap kythuatlaptrinh = new MonHoc("Kỹ Thuật Lập Trình",3,480);
        KeHoachHocTap java = new MonHoc("Lập trình Java",3,430);
        nam1.add(ky1);
        nam1.add(ky2);
        nam2.add(ky3);
        nam2.add(ky4);
        ky1.add(lichSuDang);
        ky1.add(toan);
        ky2.add(kythuatlaptrinh);
        ky3.add(java);
        khoaHoc.add(nam1);
        khoaHoc.add(nam2);
        System.out.println("Năm 1:\n\tTổng số TC: "+nam1.soTC()+"\n\tTổng học phí: "+nam1.hocphi());
        System.out.println("Năm 2:\n\tTổng số TC: "+nam2.soTC()+"\n\tTổng học phí: "+nam2.hocphi());
        System.out.println("Toàn khóa:\n\tTổng số TC: "+khoaHoc.soTC()+"\n\tTổng học phí: "+khoaHoc.hocphi());
    }
}
