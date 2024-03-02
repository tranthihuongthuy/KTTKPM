package behavioral.cc2_qlsv;

public class SoSanhTheoHoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        return t1.hoTen.compareTo(t2.hoTen);
    }
}
