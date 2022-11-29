/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.view;

import com.google.gson.Gson;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.readFilePayments;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.readFileTravelerList;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.saveFileJson;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.saveFileTravelerCsv;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.searchTraveler;
import ec.edu.espe.AirportTaxiScheduling.model.TaxiDriver;
import static ec.edu.espe.AirportTaxiScheduling.model.TaxiDriver.enterTaxiDriverData;
import static ec.edu.espe.AirportTaxiScheduling.model.TaxiDriver.saveFileTaxiDriverCsv;
import static ec.edu.espe.AirportTaxiScheduling.model.TaxiDriver.saveTaxiDriverFileJson;
import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import static ec.edu.espe.AirportTaxiScheduling.model.DataBase.enterTravelerData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class AirportTaxiScheduling {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Traveler> travelers = new ArrayList<Traveler>();

        Traveler traveler = new Traveler();

        ArrayList<TaxiDriver> taxiDriverInfo = new ArrayList<TaxiDriver>();
        TaxiDriver taxiDriver = new TaxiDriver();
        Scanner input = new Scanner(System.in);

        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;

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
            System.out.println("4.Exit");

            try {
                System.out.println("Digit an option: ");
                option = input.nextInt();
                position[0] = taxiDriverInfo.size();

                switch (option) {
                    case 1:

                        while (!exit) {
                            System.out.println("      TAXIDRIVER       ");
                            System.out.println("===============================");
                            System.out.println("1.ADD TAXI DRIVER");
                            System.out.println("2.REMOVE TAXI DRIVER");
                            System.out.println("3.VIEW TAXI DRIVER");
                            System.out.println("4.RETURN");

                            try {
                                System.out.println("Digit an option: ");
                                option = input.nextInt();

                                switch (option) {
                                    case 1:
                                        if (taxiDriverInfo.isEmpty()) {
                                            enterTaxiDriverData(taxiDriverInfo, taxiDriver, position);
                                            saveFileTaxiDriverCsv(taxiDriverInfo.get(position[0]));
                                            position[0] = taxiDriverInfo.size();
                                            saveTaxiDriverFileJson(taxiDriverInfo);
                                        } else {
                                            System.out.println("A Taxi Driver is registered");
                                        }

                                        break;

                                    case 2:
                                        File file = new File("taxiDriverInfo.json");

                                        if (file.delete()) {

                                            System.out.println("The file has been successfully deleted");
                                        } else {
                                            System.out.println("The file cannot be deleted");
                                        }
                                        break;

                                    case 3:
                                        Gson gson = new Gson();
                                        String json = "";

                                        try ( BufferedReader br = new BufferedReader(new FileReader("taxiDriverInfo.json"))) {
                                            String linetaxiDrive;
                                            while ((linetaxiDrive = br.readLine()) != null) {
                                                json += linetaxiDrive;
                                            }

                                        } catch (FileNotFoundException ex) {
                                            System.out.println(ex.getMessage());
                                        } catch (IOException ex) {
                                            System.out.println(ex.getMessage());
                                        }

                                        System.out.println(json);
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
                            System.out.println("5.Exit");

                            try {
                                System.out.println("Digit an option: ");
                                option = input.nextInt();

                                switch (option) {
                                    case 1:
                                        enterTravelerData(travelers, traveler, position);
                                        saveFileTravelerCsv(travelers.get(position[0]));
                                        position[0] = travelers.size();
                                        System.out.println("===============================");
                                        break;

                                    case 2:
                                        searchTraveler(travelers, input);
                                        System.out.println("===============================");

                                        break;

                                    case 3:
                                        readFileTravelerList();
                                        System.out.println("===============================");
                                        break;
                                    case 4:
                                        readFilePayments();
                                        System.out.println("===============================");
                                        break;
                                    case 5:
                                        saveFileJson(travelers);
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

    }
}
