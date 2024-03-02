package Baitap2;

import Baitap1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QLNhanVien();
        quanLy.them(new NhanVien("Thuy","phu yen",21,300,10_000_000));
        quanLy.them(new NhanVien("Hoang","phu yen",24,300,10_000_000));
        quanLy.inds();
    }
}
