package composite.B4;

import java.util.ArrayList;
import java.util.List;

public class HocNuaHocMai extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();

    public HocNuaHocMai(String name) {
        super(name);
    }

    @Override
    public void add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name)
                .append(";\t").append("Số tc: ").append(soTC())
                .append(";\t").append("Học phí: ").append(hocphi());;
        for (var f:list){
            f.p = this.p +"\t";
            builder.append("\n").append(f.p).append(f.getCTDT());
            f.p = " ";
        }
        return builder.toString();
    }

    @Override
    public int soTC() {
        int soTC = 0;
        for (KeHoachHocTap f : list) {
            soTC += f.soTC();
        }
        return soTC;
    }

    @Override
    public int hocphi() {
        int HocPhi = 0;
        for (KeHoachHocTap f : list) {
            HocPhi += f.hocphi();
        }
        return HocPhi;
    }
}
