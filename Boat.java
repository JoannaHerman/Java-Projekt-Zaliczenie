public class Boat extends Vehicle {
    public double sail_height;
    final int MAX_SPEED = 100;

    public double getSail_height() {
        return sail_height;
    }

    public void setSail_height(double sail_height) {
        this.sail_height = sail_height;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Boat(String brand, int year, String color, int wheels, int speed, Engine engine, Size size, double sail_height) {
        super(brand, year, color, wheels, speed, engine, size);
        this.sail_height=sail_height;
    }

    @Override
    public void speedUp() {
        setspeed(getspeed()+20);
    }

    @Override
    public void reduceSpeed() {
        if (speed > MAX_SPEED) {
            System.out.println("muszę zmniejszyć prędkość, ponieważ przekracza ona maksymalną prędkość pojazdu");
            setspeed(getMAX_SPEED());
            System.out.println("prędkość pojazdu po obniżeniu prędkości do maksymalnej to: " + getMAX_SPEED());
        }else
            setspeed(getspeed());
    }

    public String toString() {
        return "marka: " + brand + ", rocznik: " + year + ", kolor: " + color + ", liczba kół: " + wheels +
                ", obecna prędkość: " + speed + "km/h" + ", sinik: " + engine.toString() + ", rozmiar pojazdu: " + size
                + " (po polsku): " + size.getDescription() + ", wysokość żagla: " + sail_height;

    }
}
