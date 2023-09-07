public class Bicycle extends Vehicle{

    final int MAX_SPEED = 40;

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Bicycle(String brand, int year, String color, int wheels, int speed, Engine engine, Size size) {
        super(brand, year, color, wheels, speed,engine, size);


    }

    @Override
    public void speedUp() {
        setspeed(getspeed()+3);
    }

    public void reduceSpeed(){
        if (speed > MAX_SPEED) {
            System.out.println("muszę zmniejszyć prędkość, ponieważ przekracza ona maksymalną prędkość pojazdu");
            setspeed(getMAX_SPEED());
            System.out.println("prędkość pojazdu po obniżeniu prędkości do maksymalnej to: " + getMAX_SPEED());
        }else
            setspeed(getspeed());
    }


    public String toString(){
        return "marka: " + brand + ", rocznik: " + year + ", kolor: " + color + ", liczba kół: " + wheels +
                ", obecna prędkość: " + speed +"km/h"+ ", sinik: " + engine.toString() + ", rozmiar pojazdu: " +size +
                " (po polsku): "+size.getDescription();
    }

}
