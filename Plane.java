public class Plane extends Vehicle {

    private int aerofil_length;
    final int MAX_SPEED = 1500;

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Plane(String brand, int year, String color, int wheels, int speed, Engine engine, Size size, int aerofil_length) {
        super(brand, year, color, wheels, speed,engine, size);
        this.aerofil_length=aerofil_length;
    }

    @Override
    public void speedUp() {
        setspeed(getspeed()+100);
    }
    public void reduceSpeed(){
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
                + " (po polsku): " + size.getDescription() + ", długość skrzydła" + aerofil_length;

    }


    public int getAerofil_length() {
        return aerofil_length;
    }

    public void setAerofil_length(int aerofil_length) {
        this.aerofil_length = aerofil_length;
    }


}
