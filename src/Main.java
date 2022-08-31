import java.io.*;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        try{
            car.close();
            throw new IOException();
        }catch (UncheckedIOException | IOException e) {
            car.drive();
        }

    }
}