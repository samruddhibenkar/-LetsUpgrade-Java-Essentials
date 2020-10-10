//Create a class employee. Inside that class create three variable name,age,city.
// Also create a function to display the three variables.
// In the main function create two objects and call the function using it.


package com.assignment;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Samruddhi";
        emp1.age = 22;
        emp1.city = "Satara";
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Saavi";
        emp2.age = 24;
        emp2.city = "Mumbai";
        emp2.display();
    }
}
