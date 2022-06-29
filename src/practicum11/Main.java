package practicum11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef het bestand naam waar vandaan gekopieerd moet worden");
        String x = scan.nextLine();


        System.out.println("Geef het bestand naam waar naartoe geschreven moet worden");
        String y = scan.nextLine();
        System.out.println("geef de koers");
        try {
            double koers = scan.nextDouble();
            Kopieer.kopieerinhoud(x,y,koers);
        }catch (InputMismatchException e){
            System.out.println("koers moet getal zijn");
        }


    }
}
