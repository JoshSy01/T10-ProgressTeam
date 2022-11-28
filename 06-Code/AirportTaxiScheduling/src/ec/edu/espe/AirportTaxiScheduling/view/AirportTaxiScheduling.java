package ec.edu.espe.AirportTaxiScheduling.view;

import com.google.gson.*;
import ec.edu.espe.AirportTaxiScheduling.model.DateBirth;
import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import ec.edu.espe.AirportTaxiScheduling.model.TravelerPayments;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class AirportTaxiScheduling {

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
            System.out.println("1.Enter traveler");
            System.out.println("2.Search traveler");
            System.out.println("3.Print all travelers");
            System.out.println("4.Payment record");
            System.out.println("5.Exit");

            try {
                System.out.println("Digit an option: ");
                option = input.nextInt();
                position[0] = travelers.size();

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

    }

    private static void searchTraveler(ArrayList<Traveler> travelers, Scanner input) throws IOException {
        long phoneNumber;
        int found = 0;
        System.out.println("===============================");
        System.out.println("      SEARCH TRAVELER          ");
        System.out.println("===============================");
        if (travelers.size() != 0) {
            System.out.println("What is the phone number of the traveler?");
            phoneNumber = input.nextLong();
            String phoneNumberS = String.valueOf(phoneNumber);
            FileReader travelerread = null;
            String dataLine;
            File file = new File("travelerList.csv");
            travelerread = new FileReader(file);
            BufferedReader BR = new BufferedReader(travelerread);
            while ((dataLine = BR.readLine()) != null) {
                if (dataLine.contains(phoneNumberS) == true) {
                    System.out.println("===============================");
                    System.out.println(dataLine);
                    found++;
                }
            }
            if (found == 0) {
                System.out.println("Unregistered traveler");
            }
        } else {
            System.out.println("No travelers registered yet");
        }
    }

    private static void readFileTravelerList() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String dataLine;
        System.out.println("===============================");
        System.out.println("      TRAVELERS DATA        ");
        System.out.println("===============================");
        System.out.println("NAME ; ADRESS ; PHONE NUMBER ; E-MAIL ; BIRTH DATE");
        File file = new File("travelerList.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((dataLine = BR.readLine()) != null) {
            System.out.println(dataLine);

        }
    }

    private static void readFilePayments() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String dataLine;
        System.out.println("===============================");
        System.out.println("              PAYMENTS        ");
        System.out.println("===============================");
        File file = new File("payments.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((dataLine = BR.readLine()) != null) {
            System.out.println(dataLine);

        }
    }

    private static void saveFileJson(ArrayList<Traveler> travelers) {

        File travelerListFile = new File("travelerList.json");
        Gson gson = new Gson();
        JsonArray travelersJsArray = new JsonArray();

        for (int i = 0; i < travelers.size(); i++) {
            gson.toJsonTree(travelers.get(i));
            travelersJsArray.add(gson.toJsonTree(travelers.get(i)));
        }
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelerListFile, false));
            writer.print(travelersJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void enterTravelerData(ArrayList<Traveler> travelers, Traveler traveler, int position[]) {
        String name;
        String adress;
        long phoneNumber;
        String numberOfPhone;
        String email;
        String birthDate;
        boolean repeatTraveler;
        int day;
        int month;
        int year;
        float payment;
        String gmail = "@gmail.com";
        System.out.println("===============================");
        System.out.println("      ENTER TRAVELER DATA      ");
        System.out.println("===============================");

        boolean validDate = false;
        Scanner scan = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        name = input.nextLine();

        System.out.println("");
        
        System.out.println("Write the adress");
        adress = input.nextLine();

        System.out.println("");
        
        do {
            repeatTraveler = false;
            System.out.println("Enter the phone number");
            numberOfPhone = input.nextLine();
            input.nextLine();

            String regex = "\\d{10}";

            while (numberOfPhone.matches(regex) == false) {
                System.out.println("The number is: " + numberOfPhone);
                System.out.println("Is the above phone number valid? " + numberOfPhone.matches(regex));
                System.out.println("");
                System.out.println("Enter the phone number");
                numberOfPhone = input.nextLine();
                input.nextLine();
            }

            phoneNumber = Long.parseLong(numberOfPhone);
            for (int i = 0; i < travelers.size(); i++) {
                if (travelers.get(i).getPhoneNumber() == phoneNumber) {
                    System.out.println("This Traveler was already registered");
                    System.out.println("Use other");
                    repeatTraveler = true;
                }
            }
        } while (repeatTraveler == true);

        System.out.println("Write the email (@ gmail.com)");

        email = input.nextLine();
        email = (email + gmail);
        System.out.println("Email-->>" + email);
        do {
            System.out.println("Enter the birth date");
            System.out.print("day: ");
            day = scan.nextInt();
            System.out.print("month: ");
            month = scan.nextInt();
            System.out.print("year: ");
            year = scan.nextInt();

            if ((day > 0 && day < 32) && (month > 0 && month < 13) && (year > 1921 && year < 2023)) {
                validDate = true;
            }
            if (validDate == true) {
                System.out.println("Date is correct");

            } else {
                System.out.println("Date is not correct");
                System.out.println("Reenter the date");
            }
        } while (validDate == false);

        DateBirth date = new DateBirth(day, month, year);
        System.out.println("Write the payment");
        payment = input.nextFloat();
        TravelerPayments payments = new TravelerPayments(name, adress, payment);
        birthDate = (date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        traveler = new Traveler(name, adress, phoneNumber, email, birthDate);
        travelers.add(position[0], traveler);

        registerFilePayment(payments);
    }

    private static void registerFilePayment(TravelerPayments payments) {
        DateFormat dateFormat = new SimpleDateFormat(" d MMM yyyy, HH:mm:ss z");
        String dateActual = dateFormat.format(new Date());
        File List = new File("payments.csv");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(List, true));
            writer.println("NAME" + ";" + "ADRESS" + ";" + "PAYMENT" + ";" + "DATE");
            writer.println(payments.getName() + ";" + payments.getAdress() + ";" + payments.getPayment() + ";" + dateActual);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static void saveFileTravelerCsv(Traveler traveler) {
        File travelerList = new File("travelerList.csv");
        String name = traveler.getName();
        String adress = traveler.getAdress();
        long phoneNumber = traveler.getPhoneNumber();
        String email = traveler.getEmail();
        String birthDate = traveler.getBirthDate();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelerList, true));
            writer.println("");
            writer.print(name + ";");
            writer.print(adress + ";");
            writer.print(phoneNumber + ";");
            writer.print(email + ";");
            writer.print(birthDate + ";");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Traveler> readFileJson() {
        ArrayList<Traveler> travelers = new ArrayList<Traveler>();
        Gson gson = new Gson();
        JsonArray travelersJsArray = new JsonArray();
        File travelerList = new File("travelerList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(travelerList));
            String line = "";
            String json = "";
            while ((line = reader.readLine()) != null) {
                json += line;
            }

            travelersJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < travelersJsArray.size(); i++) {
                travelers.add(i, gson.fromJson(travelersJsArray.get(i), Traveler.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return travelers;
    }
}
