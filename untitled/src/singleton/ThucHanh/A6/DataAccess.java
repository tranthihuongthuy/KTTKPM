package singleton.ThucHanh.A6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance = null;
    private List<SanPham> dsSP;
    private DataAccess() {
        dsSP = new ArrayList<>();
    }

    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }
    public void themSanPham(SanPham sanPham) {
        dsSP.add(sanPham);
    }

    public void xoaSanPham(SanPham sanPham) {
        dsSP.remove(sanPham);
    }

    public void capNhatSanPham(SanPham sanPham) {
        for (SanPham sp : dsSP) {
            if (sp.getMaSP().equals(sanPham.getMaSP())) {
                sp.setTenSP(sanPham.getTenSP());
                sp.setSoluong(sanPham.getSoluong());
                sp.setDongia(sanPham.getDongia());
                break;
            }
        }
    }
    public List<SanPham> getDanhSachSanPham() {
        return dsSP;
    }

}
