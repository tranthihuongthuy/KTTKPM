package composite.B3;

public abstract class AbstractFile {
    String name,ngayTao,duongDan;
    String p = " ";

    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
        this.duongDan = name;
    }

    public abstract void  add(AbstractFile f);
    public abstract void  remove(AbstractFile f);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }
}
