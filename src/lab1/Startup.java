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
        File data = new File(File.separatorChar + "Users" + File.separatorChar + "dsmith110"
                + File.separatorChar + "My Documents" + File.separatorChar + "myData.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                String[] fileData = line.split("\\|");
                System.out.println("First Name: " + fileData[0]);
                System.out.println("Last Name: " + fileData[1]);
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

        System.out.println("\nChallenge 2");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which record would you like to retrieve? ");
        int input = Integer.parseInt(keyboard.nextLine());
        int counter = 0;

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            counter++;
            while (line != null) {
                if (counter == input) {
                    String[] fileData = line.split("\\|");
                    System.out.println("First Name: " + fileData[0]);
                    System.out.println("Last Name: " + fileData[1]);
                }


                line = in.readLine();  // strips out any carriage return chars
                counter++;
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

        System.out.println("\nChallenge 3");

        boolean append = true;   // you can change this

        // This references the file in the working directory
        data = new File(File.separatorChar + "Users" + File.separatorChar + "dsmith110"
                + File.separatorChar + "My Documents" + File.separatorChar + "myData.txt");

        // This is where we setup our streams (append = false means overwrite)
        // new FileWriter() creates the file if doesn't exit
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                new FileWriter(data, append)));

        // print statements do actual work of writing data
        // note that print statements work similar to Sytem.out.println,
        // where data is converted to strings

        System.out.print("Enter First Name: ");
        out.print(keyboard.nextLine() + "|");
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
        out.print(keyboard.nextLine() + "|");
        out.close();  // be sure you close your streams when done!!

        System.out.print("Which record would you like to retrieve? ");
        input = Integer.parseInt(keyboard.nextLine());
        counter = 0;

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            counter++;
            while (line != null) {
                if (counter == input) {
                    String[] fileData = line.split("\\|");
                    System.out.println("First Name: " + fileData[0]);
                    System.out.println("Last Name: " + fileData[1]);
                }


                line = in.readLine();  // strips out any carriage return chars
                counter++;
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
