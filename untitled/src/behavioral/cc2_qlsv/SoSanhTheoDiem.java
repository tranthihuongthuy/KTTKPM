package behavioral.cc2_qlsv;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        if(t1.DiemTB > t2.DiemTB) return 1;
        if(t1.DiemTB == t2.DiemTB) return 0;
        else return -1;
    }
}
