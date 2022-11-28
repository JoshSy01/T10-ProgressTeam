/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.view;

import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import static ec.edu.espe.AirportTaxiScheduling.view.AirportTaxiScheduling.readFileJson;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class AirportTaxiScheduling2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Traveler> travelers = new ArrayList<Traveler>();

        Traveler traveler = new Traveler();
        Scanner input = new Scanner(System.in);

        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;
        travelers = readFileJson();

        while (!exit) {
            System.out.println("      ProgressTeam       ");
            System.out.println("===============================");
            System.out.println("    AIRPORT TAXI SCHEDULING    ");
            System.out.println("          Menu Options         ");
            System.out.println("              TAXI        ");
            System.out.println("    .......________\n"
                    + "    .. ___/____|____\\___\n"
                    + "    .(_---_________ _---_)\n"
                    + "    ...(o)...........(o)");
            System.out.println("===============================");
            System.out.println("1.TaxiDriver");
            System.out.println("2.DATABASE");
            System.out.println("5.Exit");

            try {
                System.out.println("Digit an option: ");
                option = input.nextInt();
                position[0] = travelers.size();

                switch (option) {
                    case 1:

                        while (!exit) {
                            System.out.println("      TAXIDRIVER       ");
                            System.out.println("===============================");
                            System.out.println("1.ADD TAXI DRIVER");
                            System.out.println("2.REMOVE TAXI DRIVER");
                            System.out.println("3.VIEW TAXI DRIVER");
                            System.out.println("4.Exit");

                            try {
                                System.out.println("Digit an option: ");
                                option = input.nextInt();

                                switch (option) {
                                    case 1:

                                        break;

                                    case 2:

                                        break;

                                    case 3:

                                        break;

                                    case 4:
                                        System.out.println("You exit was success");
                                        exit = true;
                                        break;
                                    default:
                                        System.out.println("Nonexistent option");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect dataType");
                                System.out.println("If you don't see the menu again");
                                System.out.println("Write any character and press enter");
                                input.next();
                            }
                        }

                        break;

                    case 2:

                        while (!exit) {
                            System.out.println("      DATE BASE       ");
                            System.out.println("===============================");
                            System.out.println("1.ADD TRAVELER");
                            System.out.println("2.SEARCH TRAVELERR");
                            System.out.println("3.VIEW TRAVELER");
                            System.out.println("4.VIEW TRAVELER PAYMENTS ");
                            System.out.println(" AGENDAR  ");
                            System.out.println("5.Exit");

                            try {
                                System.out.println("Digit an option: ");
                                option = input.nextInt();

                                switch (option) {
                                    case 1:

                                        break;

                                    case 2:

                                        break;

                                    case 3:

                                        break;
                                    case 4:

                                        break;
                                    case 5:
                                        System.out.println("You exit was success");
                                        exit = true;
                                        break;
                                    default:
                                        System.out.println("Nonexistent option");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect dataType");
                                System.out.println("If you don't see the menu again");
                                System.out.println("Write any character and press enter");
                                input.next();
                            }
                        }

                        break;

                    case 3:

                        break;

                    case 4:

                        break;
                    case 5:

                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                System.out.println("If you don't see the menu again");
                System.out.println("Write any character and press enter");
                input.next();
            }
        }

    }
}
