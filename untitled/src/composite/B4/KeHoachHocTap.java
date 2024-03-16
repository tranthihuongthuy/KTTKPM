package composite.B4;

import composite.B3.AbstractFile;

public abstract class KeHoachHocTap {
    String name;
    String p ="";

    public KeHoachHocTap(String name) {
        this.name = name;
    }

    public abstract void  add(KeHoachHocTap k);
    public abstract void  remove(KeHoachHocTap k);
    public abstract String getCTDT();
    public abstract int soTC();
    public abstract int hocphi();
}
