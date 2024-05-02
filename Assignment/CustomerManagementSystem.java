package Assignment;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CustomerManagementSystem {
    private static LinkedHashMap<String, Customer> customers = new LinkedHashMap<>();
    private static final String FILE_NAME = "customers.dat";
    private Scanner scanner = new Scanner(System.in);

    public void runMenu(){
        loadData();
        while (true) {
            System.out.println("Customer Management System");
            System.out.println("1. View Customer List");
            System.out.println("2. Add Customer");
            System.out.println("3. Search Customer by Phone Number");
            System.out.println("4. Edit Customer Information");
            System.out.println("5. Delete Customer");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewCustomerList();
                    break;
                case 2:
                    addCustomer(scanner);
                    break;
                case 3:
                    searchCustomerByPhoneNumber(scanner);
                    break;
                case 4:
                    editCustomerInformation(scanner);
                    break;
                case 5:
                    deleteCustomer(scanner);
                    break;
                case 6:
                    saveData();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCustomer(Scanner scanner) {
        while (true) {
            System.out.print("Enter customer name (or type 'done' to finish adding customers): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            String email;
            do {
                System.out.print("Enter customer email: ");
                email = scanner.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("Invalid email format.");
                }
            } while (!isValidEmail(email));
            String phoneNumber;
            do {
                System.out.print("Enter customer phone number: ");
                phoneNumber = scanner.nextLine();
                if (!isValidPhoneNumber(phoneNumber)) {
                    System.out.println("Invalid phone number format.");
                }
            } while (!isValidPhoneNumber(phoneNumber));

            Customer newCustomer = new Customer(name, email, phoneNumber);
            customers.put(phoneNumber, newCustomer);
            System.out.println("Customer added successfully.");
        }
    }

    private static void viewCustomerList() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        System.out.println("Customer List:");
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    private static void searchCustomerByPhoneNumber(Scanner scanner) {
        System.out.print("Enter phone number to search: ");
        String phoneNumber = scanner.nextLine();

        Customer customer = customers.get(phoneNumber);
        if (customer != null) {
            System.out.println("Customer found:");
            System.out.println(customer);
        } else {
            System.out.println("Customer with phone number " + phoneNumber + " not found.");
        }
    }

    private static void editCustomerInformation(Scanner scanner) {
        System.out.print("Enter phone number of customer to edit: ");
        String phoneNumber = scanner.nextLine();
        Customer customer = customers.get(phoneNumber);
        if (customer != null) {
            System.out.println("Enter new information for customer:");
            System.out.print("New name (leave empty to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                customer.setName(newName);
            }
            System.out.print("New email (leave empty to keep current): ");
            String newEmail = scanner.nextLine();
            if (!newEmail.isEmpty()) {
                customer.setEmail(newEmail);
            }
            System.out.print("New phone number (leave empty to keep current): ");
            String newPhoneNumber = scanner.nextLine();
            if (!newPhoneNumber.isEmpty()) {
                if (customers.containsKey(newPhoneNumber)) {
                    System.out.println("Phone number already exists for another customer. Please choose a different one.");
                } else {
                    customers.remove(phoneNumber);
                    customers.put(newPhoneNumber, customer);
                }
            }
            System.out.println("Customer information updated successfully.");
        } else {
            System.out.println("Customer with phone number " + phoneNumber + " not found.");
        }
    }

    private static void deleteCustomer(Scanner scanner) {
        System.out.print("Enter phone number of customer to delete: ");
        String phoneNumber = scanner.nextLine();

        Customer removedCustomer = customers.remove(phoneNumber);
        if (removedCustomer != null) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer with phone number " + phoneNumber + " not found.");
        }
    }

    private static boolean validateCustomerData(String name, String email, String phoneNumber) {
        if (name.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            return false;
        }
        if (!isValidPhoneNumber(phoneNumber) || !isValidEmail(email)) {
            return false;
        }
        return true;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    private static boolean isValidEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    private static boolean isValidName(String name) {
        return !name.isEmpty() && !name.matches(".*[^a-zA-Z ].*"); // Allow only letters and spaces
    }

    private static void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            customers = (LinkedHashMap<String, Customer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // File doesn't exist or error in reading, continue with an empty map
            System.out.println("File not found or error reading file. Creating a new file...");
            customers = new LinkedHashMap<>(); // Initialize with an empty map
            saveData(); // Create a new file
        }
    }

    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
