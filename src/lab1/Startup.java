/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author dsmith110
 */
public class Startup {

    public static void main(String[] args) throws IOException {
        File data = new File("src" + File.separatorChar + "Files"
                + File.separatorChar + "myData.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                String[] fileData = line.split("\\|");
                System.out.println(fileData[1] + ", " + fileData[0]);
                line = in.readLine();  // strips out any carriage return chars
            }

            System.out.println("\nChallenge 2");
            int counter = 0;

            in = new BufferedReader(new FileReader(data));
            line = in.readLine();
            counter++;
            while (line != null) {
                if (counter == 2) {
                    String[] fileData = line.split("\\|");
                    System.out.println("\n" + fileData[1] + ", " + fileData[0]);
                }


                line = in.readLine();  // strips out any carriage return chars
                counter++;
            }

            System.out.println("\nChallenge 3\n");
            boolean append = true;

            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter(data, append)));

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter First Name: ");
            out.print("\n" +keyboard.nextLine() + "|");
            System.out.print("Enter Last Name: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter Street Address: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter City: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter State: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter Zip: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter Email: ");
            out.print(keyboard.nextLine() + "|");
            System.out.print("Enter Phone number: ");
            out.print(keyboard.nextLine());
            out.close();  // be sure you close your streams when done!!

            in = new BufferedReader(new FileReader(data));
            line = in.readLine();

            in = new BufferedReader(new FileReader(data));
            line = in.readLine();
            while (line != null) {
                String[] fileData = line.split("\\|");
                System.out.println(fileData[1] + ", " + fileData[0]);
                line = in.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

    }
}
