public class Scooter extends Vehicle{


   public boolean isCharged;

    public boolean isCharged() {
        return isCharged;
    }

    public void setCharged(boolean charged) {
        isCharged = charged;
    }

    final int MAX_SPEED = 30;

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public Scooter(String brand, int year, String color, int wheels, int speed, Engine engine, Size size, boolean isCharged) {
        super(brand, year, color, wheels, speed,engine, size);
        this.isCharged=isCharged;

    }

    @Override
    public void speedUp() {
        setspeed(getspeed()+1);
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
                " (po polsku): "+size.getDescription() +", naładowana bateria: " + isCharged;
    }

}
