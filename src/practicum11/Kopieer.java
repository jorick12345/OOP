package practicum11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;


public class Kopieer {

    public static void kopieerinhoud(String a, String b, double koers){
        String bestand1="C:/Users/super/IdeaProjects/eerste/src/practicum11/"+a;
        String bestand2 ="C:/Users/super/IdeaProjects/eerste/src/practicum11/"+b;
        File file2 = new File(bestand2);
        try {
            PrintWriter out = new PrintWriter(file2);
            File file = new File(bestand1);
            Scanner scan = new Scanner(file);
            List<String> lijst = new ArrayList<>();
            FileWriter write = new FileWriter(file2,true);
            BufferedWriter bw = new BufferedWriter(write);
            while (scan.hasNextLine()) {
                String tekst = scan.nextLine();
                lijst.add(tekst);
            }
            System.out.println(lijst);
            scan.close();
            for (Object l : lijst) {
                String str = l.toString();
                String[] split = str.split(":");
                String x = split[split.length - 1];
                String omgezet = omzetten(x, koers);
                bw.write(split[0]+": "+omgezet+"\n");

            }
            bw.close();

        }catch (FileNotFoundException e){
            System.out.println("file onbekend");
        }catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }


    }


    public static double bereken(double doller ,double koers){
        return doller * koers;
    }
    public static String omzetten(String x, double koers){
        double geld = Double.parseDouble(x);
        double euro = bereken(geld,koers);
        return String.format("%.2f", euro);
    }

}
