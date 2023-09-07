public class Engine {
    private double fuel;
    public int power;
    private String brand;

    public Engine(double fuel, int power, String brand) {
        this.fuel = fuel;
        this.power = power;
        this.brand = brand;
    }

    public String toString(){
        return "paliwo: " + fuel + ", moc: " + power + ", marka: " + brand;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
