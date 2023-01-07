class Car {
  
  int model;
  String make;
  int speed;
  
  public Car(int yearModel, String carMake, int carSpeed) {
    model = yearModel;
    make = carMake;
    speed = carSpeed;
  }
  public int getModel() {
    return model;
  }
  
  public String getMake() {
    return make;
  }
  
  public int getSpeed() {
    return speed;
  }
  public void accelerate() {
    speed += 5;
  }
  
  // brake method
  public void brake() {
    speed -= 5;
  }
}


public class Main {
  public static void main(String[] args) {
   
    
    Car car = new Car(2020, "Toyota", 25);
  
    for (int i = 1; i <= 5; i++) {
      car.accelerate();
      System.out.println("After acceleration #" + i + ": " + car.getSpeed() + " mph");
    }
    for (int i = 1; i <= 5; i++) {
      car.brake();
      System.out.println("After brake #" + i + ": " + car.getSpeed() + " mph");
    }
  }
}
