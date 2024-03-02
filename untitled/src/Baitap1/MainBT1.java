package Baitap1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Thủy","phu yen",21,300,10_000_000);
        NhanVien nv2 = new NhanVien("Hoang","phu yen",24,300,10_000_000);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
