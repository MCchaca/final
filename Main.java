package final_8;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Automobile automobile = new Automobile();
            System.out.println(automobile.add("Ford", "Bronco", "Base", "Blue", 2021, 20000));
            for (String info : automobile.getInfo()) {
                System.out.println(info);
            }
            System.out.println(automobile.remove());
            System.out.println(automobile.add("Ford", "Bronco", "Sport", "Red", 2022, 15000));
            for (String info : automobile.getInfo()) {
                System.out.println(info);
            }
            System.out.println(automobile.update("Ford", "Bronco", "Wildtrak", "Black", 2021, 30000));
            for (String info : automobile.getInfo()) {
                System.out.println(info);
            }
            printToFile(automobile.getInfo());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printToFile(String[] info) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to print the information to a file? (Y/N)");
            String response = scanner.nextLine().toUpperCase();
            if (response.equals("Y")) {
                try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
                    for (String data : info) {
                        writer.write(data + "\n");
                    }
                    System.out.println("Information printed to file successfully.");
                } catch (IOException e) {
                    System.out.println("Failed to print information to file: " + e.getMessage());
                }
            } else {
                System.out.println("No file will be printed.");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}