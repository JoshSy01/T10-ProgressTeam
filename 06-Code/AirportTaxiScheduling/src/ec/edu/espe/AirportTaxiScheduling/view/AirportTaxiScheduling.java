package ec.edu.espe.AirportTaxiScheduling.view;

import com.google.gson.Gson;
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
        ArrayList<Traveler> travelersJs = new ArrayList<Traveler>();
        storeFileJson(travelersJs);
        //saveData(travelersJs);

        ArrayList<Traveler> travelers = new ArrayList<Traveler>();

        Traveler traveler = new Traveler();
        Scanner input = new Scanner(System.in);

        int position[] = new int[1];
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("ProgressTeam");
            System.out.println("Menu");
            System.out.println("Options:");
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
                        //createFile();
                        enterTraveler(travelers, traveler, position);
                        saveTraveler(travelers.get(position[0]));
                        travelersJs = travelers;
                        saveData(travelersJs); //json
                        position[0] = travelers.size();
                        break;
                    case 2:
                        long phoneNumber;
                        int found = 0;
                        if (travelersJs.size() != 0) {
                            System.out.println("What is the phone number of the traveler?");
                            phoneNumber = input.nextLong();
                            String phoneNumberS = String.valueOf(phoneNumber);
                            FileReader travelerread = null;
                            String linea;
                            File file = new File("travelerList.csv");
                            travelerread = new FileReader(file);
                            BufferedReader BR = new BufferedReader(travelerread);
                            while ((linea = BR.readLine()) != null) {
                                if(linea.contains(phoneNumberS) == true){
                                    System.out.println(linea);
                                    found++; 
                                }
                            }
                            if (found == 0) {
                                System.out.println("Unregistered traveler");
                            }
                        } else {
                            System.out.println("No travelers registered yet");
                        }
                        break;
                    case 3:  {
                        readFileTravelerList();
                    }
                    break;

                    case 4: {
                         readFilePayments();

                    }
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

    }

    private static void readFileTravelerList() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String linea;
        System.out.println("===============================");
        System.out.println("      TRAVELES DATA        ");
        System.out.println("===============================");
        File file = new File("travelerList.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((linea = BR.readLine()) != null) {
            System.out.println(linea);
            
        }
    }
    
     private static void readFilePayments() throws IOException, FileNotFoundException {
        FileReader travelerread = null;
        String linea;
        System.out.println("===============================");
        System.out.println("              PAYMENTS        ");
        System.out.println("===============================");
        File file = new File("payments.csv");
        travelerread = new FileReader(file);
        BufferedReader BR = new BufferedReader(travelerread);
        while ((linea = BR.readLine()) != null) {
            System.out.println(linea);
            
        }
    }
    
    public static void saveData(ArrayList<Traveler> travelers) {
        Gson gson = new Gson();
        String json = gson.toJson(travelers);
        File file = new File("travelerList.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }
    }

    private static void printTraveler(Traveler traveler) {
        System.out.println(traveler);
    }

    public static void enterTraveler(ArrayList<Traveler> travelers, Traveler traveler, int position[]) {
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

        boolean validoFecha = false;
        Scanner scan = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        name = input.nextLine();

        System.out.println("Write the adress");
        adress = input.nextLine();

        do {
            repeatTraveler = false;
            System.out.println("Enter the phone number");
            numberOfPhone = input.nextLine();
            input.nextLine();
            for (int x = 0; x <= 1; x++) {
                String regex = "\\d{10}";

                System.out.println("The number is: " + numberOfPhone);
                System.out.println("Is the above phone number valid? " + numberOfPhone.matches(regex));
                System.out.println();
                if (numberOfPhone.matches(regex) == false) {
                    System.out.println("Enter the phone number");
                    numberOfPhone = input.nextLine();
                    input.nextLine();
                }
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
                validoFecha = true;
            }
            if (validoFecha == true) {
                System.out.println("Date is correct");

            } else {
                System.out.println("Date is not correct");
                System.out.println("Reenter the date");
            }
        } while (validoFecha == false);

        DateBirth date = new DateBirth(day, month, year);
        System.out.println("Write the payment");
        payment = input.nextFloat();
        TravelerPayments payments  = new TravelerPayments(name , adress, payment);
        birthDate = (date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        
        traveler = new Traveler(name, adress, phoneNumber, email, birthDate);
        travelers.add(position[0], traveler);

        savepayments(payments);
    }

    private static void savepayments(TravelerPayments payments) {
        DateFormat dateFormat = new SimpleDateFormat(" d MMM yyyy, HH:mm:ss z");
        String dateActual = dateFormat.format(new Date());
        File List = new File("payments.csv");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(List, true));
            writer.println("NAME" + ";" + "ADRESS" + ";" + "PAYMENT" + ";" + "DATE");
            writer.println( payments.getName() + ";" + payments.getAdress() + ";" + payments.getPayment() + ";" + dateActual);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }


    private static void createFile() {
        File chickenList = new File("travelerList.json");
        try {
            PrintWriter writer = new PrintWriter(chickenList);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void saveTraveler(Traveler traveler) {
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

    public static void storeFileJson(ArrayList<Traveler> travelers) {
        Gson gson = new Gson();
        String jsonFile = "";
        String[] jsonTraveler;

        try ( Scanner scFile = new Scanner(new File("travelerList.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonTraveler = jsonFile.split("},");

            for (int i = 0; i < jsonTraveler.length; i++) {
                if (i < jsonTraveler.length - 1) {
                    travelers.add(gson.fromJson(jsonTraveler[i] + "}", Traveler.class
                    ));

                } else {
                    travelers.add(gson.fromJson(jsonTraveler[i], Traveler.class
                    ));
                }
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }
    }
}
