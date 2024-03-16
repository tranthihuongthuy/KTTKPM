package composite.B3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> children = new ArrayList<>();
    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void add(AbstractFile f) {
        children.add(f);
        f.duongDan  = this.duongDan + "\\" + f.name;
    }

    @Override
    public void remove(AbstractFile f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        for (var f:children){
            f.p = this.p +"\t";
            builder.append("\n").append(f.p).append(f.getStringTreeFolder());
            f.p = " ";
        }
        return builder.toString();
    }
}
