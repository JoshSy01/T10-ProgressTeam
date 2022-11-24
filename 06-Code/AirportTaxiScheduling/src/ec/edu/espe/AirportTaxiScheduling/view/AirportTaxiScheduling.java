package ec.edu.espe.AirportTaxiScheduling.view;

import ec.edu.espe.AirportTaxiScheduling.model.Traveler;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class AirportTaxiScheduling {

    public static void main(String[] args) {
        ArrayList<Traveler> travelers = new ArrayList<Traveler>();
        Traveler traveler = new Traveler();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;

        //readJsonFile(travelers,position);
        //System.out.println(position[0]); 
        while (!exit) {
            System.out.println("ProgressTeam");
            System.out.println("Menu");
            System.out.println("Options:");
            System.out.println("1.Enter traveler");
            System.out.println("2.Search traveler");
            System.out.println("3.Print all travelers");
            System.out.println("4.Exit");

            try {
                System.out.println("Digit an option: ");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        createFile();
                        enterTraveler(travelers, traveler, position);
                        saveTraveler(travelers.get(position[0]));
                        //saveTravelersToJson(travelers);
                        position[0]++;
                        break;
                    case 2:
                        long phoneNumber;
                        int found = 0;
                        if (position[0] != 0) {
                            System.out.println("What is the phone number of the traveler?");
                            phoneNumber = input.nextLong();
                            for (int i = 0; i < travelers.size(); i++) {
                                if (travelers.get(i).getPhoneNumber() == phoneNumber) {
                                    System.out.println("===Traveler Data===");
                                    printTraveler(travelers.get(i));
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
                    case 3:
                        if (position[0] != 0) {
                            for (int i = 0; i < travelers.size(); i++) {
                                printTraveler(travelers.get(i));
                            }
                        } else {
                            System.out.println("No travelers registered yet");
                        }
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

    private static void printTraveler(Traveler traveler) {
        System.out.println(traveler);
    }

    private static void enterTraveler(ArrayList<Traveler> travelers, Traveler traveler, int position[]) {
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
            for (int x = 0; x <=1 ; x++){
            String regex = "\\d{10}";
            
                System.out.println("The number is: " + numberOfPhone);
                System.out.println("Is the above phone number valid? " + numberOfPhone.matches(regex));
                System.out.println();
                if(numberOfPhone.matches(regex) == false){
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

        System.out.println("Write the email");
        email = input.nextLine();

        
        do {
            System.out.println("Enter the birth date");
            System.out.print("day: ");
            day = scan.nextInt();
            System.out.print("month: ");
            month = scan.nextInt();
            System.out.print("year: ");
            year = scan.nextInt();

            if ((day > 0 && day < 32) &&  (month > 0 && month < 13) && (year > 1921 && year < 2023)) {
                validoFecha = true;
            }
            if (validoFecha == true) {
                System.out.println("La fecha es correcta");

            } else {
                System.out.println("La fecha es incorrecta");
                System.out.println("Reenter the date");
            }
        } while (validoFecha == false);

        Date date = new Date(day, month, year);

        birthDate = (date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        traveler = new Traveler(name, adress, phoneNumber, email, birthDate);
        travelers.add(position[0], traveler);
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

    /*private static void saveTravelersToJson(ArrayList<Traveler> travelers) {
       File chickenList = new File("chickenList.json");
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        //String json = new Gson().toJson(chickens);
        
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, false)); 
            //PrintWriter writer = new PrintWriter(chickenList); 
            writer.print(json);   
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);   
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }*/

 /*private static void readJsonFile(ArrayList<Chicken> chickens, int position[]) {
        String json = ""; 
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
           BufferedReader reader = new BufferedReader(new FileReader("chickenlist.json"));
           String line = "";
        while ((line = reader.readLine())!= null){
            json = line;
            //chickens = gson.fromJson(json);
            //chickens.add(position[0], chicken);
            //position[0]++;
        }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }*/
}
