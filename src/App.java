import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("Asus", 16, 256, "Windows 11", "серебро", 15);
        Laptop laptop2 = new Laptop("Lenovo", 8, 128, "Windows 7", "чёрный", 14);
        Laptop laptop3 = new Laptop("Apple MacBook", 32, 512, "MacOs", "желтый", 16);
        Laptop laptop4 = new Laptop("MSI", 32, 1024, "без ОС", "серый", 16);
        Laptop laptop5 = new Laptop("Intel", 32, 512, "Windows 10", "серый", 15);

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите желаемые характеристики:");
        System.out.println("1. объем оперативной памяти (8, 16, 32): ");
        int ramUser = sc.nextInt();
        System.out.println("2. объем накопителя (32, 128, 256, 512, 1024): ");
        int storUser = sc.nextInt();
        System.out.println("3. диагональ (14, 15, 16):");
        double digUser = sc.nextDouble();
        for(Laptop lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }
}
