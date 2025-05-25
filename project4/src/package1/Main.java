package package1;

import java.util.Scanner;

public class Main {

    // Remove entries from the specified position to the end of the array
    private static void removeEntriesUntilPosition(Person[] array, int size, int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = size - 1; i >= position - 1; i--) {
            array[i] = null;
        }
    }

    // Method to remove the last person from the array
    private static void removeLastPerson(Person[] array, int size) {
        if (size > 0) {
            array[size - 1] = null;
        }
    }

    // Method to swap possisions between objets
    private static void swapEntries(Person[] array, int index1, int index2) {
        if (Person.isValidIndex(index1, array) && Person.isValidIndex(index2, array) && array[index1] != null && array[index2] != null) {
            array[index1].swapWith(array[index2]);
            System.out.println("Swapping successful.");
        } else {
            System.out.println("Invalid Data");
        }
    }

    // Display the database in list form
    private static void displayDatabase(Person[] array, int size) {
        System.out.println("Database in list form:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + array[i].getFirstName() + " " + array[i].getLastName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creating of the personArray
        Person[] personArray = new Person[10];
        int numberofpersons = 0;  // number of values in array

        personArray[numberofpersons++] = new Person("john", 42, "smith", "male");
        personArray[numberofpersons++] = new Person("Valerie", 31, "Sioux", "female");
        personArray[numberofpersons++] = new Person("Elizabeth", 17, "Rien", "female");
        personArray[numberofpersons++] = new Person("Mark", 73, "Zane", "male");


        System.out.println("Persons in array:");
        for (int i = 0; i < numberofpersons; i++) {
            personArray[i].showMessage();
        }

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a person");
            System.out.println("2. Exit");
            System.out.println("3. Swap the position of two entries");
            System.out.println("4. Delete entries until a specified position");
            System.out.println("5 persons with age smaller than 18");
            System.out.println("6 persons with age bigger  than 18");
            System.out.println("7 general number of person in base");
         
            System.out.println(" Please enter 1, 2, 3, 4, 5 ,6 or 7");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
            case 1:
                // Add a person characteristics
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();

                personArray[numberofpersons++] = new Person(firstName, age, lastName, gender);
                break;

                case 2:
                    // Terminate the program  
                    break;
               // Position swapping
                case 3:
             System.out.print("Enter index of first entry to swap: ");
             int index1 = scanner.nextInt() - 1;
             scanner.nextLine();
            System.out.print("Enter index of second entry to swap: ");
             int index2 = scanner.nextInt() - 1;
            scanner.nextLine();
           swapEntries(personArray, index1, index2);
             System.out.println("\nDatabase after swapping:");
              displayDatabase(personArray, numberofpersons);
              break;
             //Delete a number of objectives
                case 4:
          System.out.print("Enter the position to delete entries until (1 to " + numberofpersons + "): ");
        int positionToDeleteUntil = scanner.nextInt();
          scanner.nextLine();
        removeEntriesUntilPosition(personArray, numberofpersons, positionToDeleteUntil);
        System.out.println("\nDatabase after deleting entries until position " + positionToDeleteUntil + ":");
       displayDatabase(personArray, numberofpersons);
             break;
                case 5:
                    // Show persons below 18
                    System.out.println("Persons below 18:");
                    for (int i = 0; i < numberofpersons; i++) {
                        personArray[i].showBelow181();
                    }
                    break;
                case 6:
               
                    // Show persons 18 and above 
                    System.out.println("Persons 18 and above:");
                    for (int i = 0; i < numberofpersons; i++) {
                        if (personArray[i].getAge() >= 18) {
                            personArray[i].showMessage2();
                        }
                    }
                    break;
              //Display database objects
                case 7:
                	   displayDatabase(personArray, numberofpersons);
                	    break;
 
         
                
                default:
           
                    System.out.println("Invalid choice. Please enter 1, 2, 3, 4, or 5.");

            }

        } while (choice != 2);  // Continue loop until exit

        // Show the updated data using showMessage2
        System.out.println("Updated persons in the database:");
        for (int i = 0; i < numberofpersons; i++) {
            personArray[i].showMessage2();
        }

        // Remove the last object 
        removeLastPerson(personArray, numberofpersons);

        // Show the remaining objects
        System.out.println("Remaining persons:");
        for (int i = 0; i < numberofpersons - 1; i++) {
            personArray[i].showMessage2();
        }
        scanner.close();
    }
        
    
}


