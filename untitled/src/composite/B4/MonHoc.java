package composite.B4;

public class MonHoc extends KeHoachHocTap{
    int soTC,hp;

    public MonHoc(String name, int soTC, int hp) {
        super(name);
        this.soTC = soTC;
        this.hp = hp;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public String getCTDT() {
        return this.name;
    }

    @Override
    public int soTC() {
        return soTC;
    }

    @Override
    public int hocphi() {
        return hp*soTC;
    }
}
