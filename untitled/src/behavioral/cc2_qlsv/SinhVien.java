package behavioral.cc2_qlsv;

public class SinhVien {
    String hoTen, ngaysinh;
    float DiemTB;

    public SinhVien(String hoTen, String ngaysinh, float diem) {
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        DiemTB = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float diemTB) {
        DiemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", DiemTB=" + DiemTB +
                '}';
    }
}
