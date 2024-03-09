package singleton.builder;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("In Teo Celeron I9")
                .addRAM("128MB")
                .addStorage("64GB").addScreen("HD 1366x768").build();
        System.out.println(computer.toString());
    }
}
