package Baitap2;

import Baitap1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QLNhanVien implements IQuanLy{
    List<NhanVien> list = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        list.add(nv);
    }

    @Override
    public void inds() {
        for(var nv: list)
            System.out.println(nv.toString());
//        list.forEach(nhanVien -> {
//            System.out.println(nhanVien.toString());
//        });
    }
}
