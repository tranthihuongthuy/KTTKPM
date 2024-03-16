package composite.B3;

public class File extends AbstractFile{
    public File(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void add(AbstractFile f) {

    }

    @Override
    public void remove(AbstractFile f) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.name;
    }
}
