// Miles O'Hara-Dewhurst 4/8/2024
public class App {
    public static void main(String[] args) {
        Car newCar = new Car("yrh564", "ford f150", 2014, 10000);
        System.out.println(newCar);

        newCar.setRego("yur765");
        System.out.println(newCar.getRego());

        newCar.setPrice(12000);
        System.out.println(newCar.getPrice());

        newCar.setModel("ford ranger");
        System.out.println(newCar.getModel());

        newCar.setYear(2016);
        System.out.println(newCar.getYear());

        System.out.println(newCar);
    }
}
