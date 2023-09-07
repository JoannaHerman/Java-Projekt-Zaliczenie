public class Car extends Vehicle{

private int doors;
final int MAX_SPEED = 200;

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Car(String brand, int year, String color, int wheels, int speed, Engine engine, Size size, int doors) {
        super(brand, year, color, wheels, speed,engine, size);
        this.doors=doors;
    }

    @Override
    public void speedUp() {
        setspeed(getspeed()+5);
    }

    public void reduceSpeed(){
        if (speed > MAX_SPEED) {
            System.out.println("muszę zmniejszyć prędkość, ponieważ przekracza ona maksymalną prędkość pojazdu");
            setspeed(getMAX_SPEED());
            System.out.println("prędkość pojazdu po obniżeniu prędkości do maksymalnej to: " + getMAX_SPEED());
        }else
            setspeed(getspeed());
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String toString(){
        return "marka: " + brand + ", rocznik: " + year + ", kolor: " + color + ", liczba kół: " + wheels +
                ", obecna prędkość: " + speed +"km/h"+ ", sinik: " + engine.toString() + ", rozmiar pojazdu: " +size +
                " (po polsku): "+size.getDescription() + ", ilość drzwi: " + doors;
    }


}

