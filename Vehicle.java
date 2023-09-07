abstract class Vehicle {
  public int speed;
    public int wheels;
    public String color;
    public int year;
    public Size size;


    public String brand;

  public Engine engine;

    public Vehicle(String brand, int year, String color, int wheels, int speed,Engine engine, Size size){
        this.brand=brand;
        this.year=year;
        this.color = color;
        this.wheels=wheels;
        this.speed=speed;
        this.engine=engine;
        this.size=size;

    }



    public abstract void speedUp();
    public abstract void reduceSpeed();


    public int getspeed() {
        return speed;
    }

    public void setspeed(int max_speed) {
        this.speed = speed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
