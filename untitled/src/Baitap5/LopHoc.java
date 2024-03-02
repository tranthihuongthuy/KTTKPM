package Baitap5;

public class LopHoc {
    public static void main(String[] args) {
        QLDS qlds1 = new QLDS();
        qlds1.them(new HocSinh("Ngọc", "Khánh Hòa","0708006618",20, "CNTT", "java"));
        qlds1.them(new HocSinh("Thủy", "Phú Yên","0374360470",20, "CNTT", "html"));

        QLDS qlds2 = new QLDS();
        qlds2.them(new GiaoVien("Uyên", "Ninh Hòa","0936567318",27, "Toán", "Kinh Tế"));
        qlds2.them(new GiaoVien("Hoàng", "Phú Yên","0438593934",25, "Luật Hình Sự", "Luật"));

        //In ds học sinh
        System.out.println("Danh sách học sinh:");
        qlds1.inDS();
        //In ds giáo viên
        System.out.println("Danh sách giáo viên:");
        qlds2.inDS();
    }
}
