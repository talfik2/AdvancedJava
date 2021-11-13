package javadevelopmentDay05;

import java.io.*;

public class SerializationOfObjects {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike", 1234);
        Vehicle car = new Vehicle("Car", 1235);
        Vehicle bus = new Vehicle("Bus", 1236);
        try(FileOutputStream fos = new FileOutputStream("vehicle.dat")) {
            try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
                obj.writeObject(bike);
                obj.writeObject(car);
                obj.writeObject(bus);
                System.out.println("Objects are written into the file...");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
// If you want to write the objects of ay class, the class has to implement "Serializable" interface.
// Otherwise, you get Run Time Exception.
class Vehicle implements Serializable{
    private String type;
    private int number;

    //toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }

    // Constructor
    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;

    }
}
class readObject{
    public static void main(String[] args) throws ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream("vehicle.dat")) {
            try(ObjectInputStream obj = new ObjectInputStream(fis)) {
                Vehicle vBike = (Vehicle) obj.readObject();
                Vehicle vCar = (Vehicle) obj.readObject();
                Vehicle vBus = (Vehicle) obj.readObject();

                System.out.println(vBike);
                System.out.println(vCar);
                System.out.println(vBus);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
