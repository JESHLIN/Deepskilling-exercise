public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer Configuration:");
        basicComputer.showConfig();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setStorage("2TB SSD")
                .setOperatingSystem("Windows 11")
                .build();
        System.out.println("Gaming Computer Configuration:");
        gamingComputer.showConfig();

        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Ubuntu")
                .build();
        System.out.println("Office Computer Configuration:");
        officeComputer.showConfig();
    }
}
