package Baitap3;

public class SinhVienIT extends SinhVienPoly{
    double diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoten, String nganh, double diemJava, double diemCSS, double diemHTML) {
        super(hoten, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (2*diemJava + diemHTML + diemCSS )/4;
    }
}
