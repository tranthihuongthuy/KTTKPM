package composite.B3;

public class MainFile {
    public static void main(String[] args) {
        Folder a = new Folder("Data (D:)","08/03/2024");
        Folder b = new Folder("Tai Lieu","08/03/2024");
        Folder c = new Folder("Design Pattern","08/03/2024");
        Folder d = new Folder("Lap Trinh Java","08/03/2024");
        Folder e = new Folder("LapTrinhThietBiDiDong","08/03/2024");

        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        c.add(new File("CCreationalPattern.pptx","27/08/2023"));
        c.add(new File("StructuralPattern.pptx","27/08/2023"));
        d.add(new File("CLapTrinhJavaCoBan.docx","27/08/2023"));
        d.add(new File("SLapTrinhJavaNangCao.pdf","27/08/2023"));
        e.add(new File("CoBan.pptx","27/08/2023"));
        e.add(new File("NangCao.pptx","27/08/2023"));

        System.out.println(a.getStringTreeFolder());
    }
}
