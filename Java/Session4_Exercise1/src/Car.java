public class Car {
    private String rego;
    private String model;
    private int year;
    private double price;

    public Car(String inRego, String inModel, int inYear, double inPrice) {
        this.rego = inRego;
        this.model = inModel;
        this.year = inYear;
        this.price = inPrice;
    }

    public String toString() {
        return "Model: " + model + "\nYear: " + year + "\nRego: " + rego + "\nPrice: " + price;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String newRego) {
        rego = newRego;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
