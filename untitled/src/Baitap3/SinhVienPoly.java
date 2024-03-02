package Baitap3;

public abstract class SinhVienPoly {
    String hoten, nganh;

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public abstract double getDiem();
    public String getHocluc(){
        if(getDiem()<5) return "Yếu";
        if(getDiem() >= 5 && getDiem() <6.5) return "trung bình";
        if(getDiem() >= 6.5 && getDiem() <7) return "khá";
        if(getDiem() >= 7.5 && getDiem() < 9) return "giỏi";
        else return "Xuất sắc";
    }
    public void Xuat(){
        System.out.println("SinhVienPoLy{" +
                "hoTen='" + hoten + '\'' +
                ", nganh='" + nganh + '\'' +
                ", Diem='" + getDiem() + '\'' +
                '}');
    };
}
