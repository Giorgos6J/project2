package package1;

public class Person {

    private String firstName;
    private int age;
    private String lastName;
    private String gender;

    // Constructors 

    // Operating method witch sets parammiters in gender swap it limits it to male and female and verify the users inputs
    public void showMessage2() {
        String typeOfPerson;

        if ("male".equals(gender)) {
            typeOfPerson = "male";
        } else if ("female".equals(gender)) {
            typeOfPerson = "female";
        } else {
            typeOfPerson = "invalid";
        }

        System.out.printf("This is %s %s %s, Age: %d, Gender: %s%n", typeOfPerson, firstName, lastName, age, gender);
    }

    // constructor 2 refers to the currect objects
    public Person(String firstName, int age, String lastName, String gender) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.gender = gender;
    }

    // first printing operating method 
    public void showMessage() {
        System.out.printf("Person: %s %s, Age: %d, Gender: %s%n", firstName, lastName, age, gender);
    }

    // Get first name
    public String getFirstName() {
        return firstName;
    }


    public void swapWith(Person otherPerson) {
        // Implement swap 
    }

    public static boolean poschange(int index, Person[] array) {
        return index >= 0 && index < array.length;
    }

    public int getLastName() {
        // Implement getLastName 
        return 0;
    }

    public static boolean isValidIndex(int index2, Person[] array) {
        // Implement isValidIndex
        return false;
    }
       // Implement get age
    public int getAge() {
        return age;
    }
      // show person smaller than 18
    public void showBelow181() {
        if (age < 18) {
            showMessage2();
        }
    }




}








