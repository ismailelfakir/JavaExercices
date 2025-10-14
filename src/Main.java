import java.util.Scanner;
void main() {
//     // ------------------ exercice 1 ----------------------------
//    Calculator calc = new Calculator();
//
//    // Set operand values
//    calc.operand1 = 20;
//    calc.operand2 = 5;
//
//    // Display results
//    System.out.println("Operand 1: " + calc.operand1);
//    System.out.println("Operand 2: " + calc.operand2);
//    System.out.println("Addition: " + calc.add());
//    System.out.println("Subtraction: " + calc.subtract());
//    System.out.println("Multiplication: " + calc.multiply());
//    System.out.println("Division: " + calc.divide());

//// ------------------ exercice 2 ----------------------------
//
//    Student s1 = new Student();
//    s1.name = "Ismail El Fakir";
//    s1.age = 22;
//    s1.studentId = "STU001";
//
//    Student s2 = new Student();
//    s2.name = "Sara Benali";
//    s2.age = 16;
//    s2.studentId = "STU002";
//
//    s1.displayInfo();
//    System.out.println("Is adult? " + s1.isAdult());
//
//    System.out.println();
//
//    s2.displayInfo();
//    System.out.println("Is adult? " + s2.isAdult());

    // ------------------ exercice 3 ----------------------------
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer number: ");
    int number = input.nextInt();

    // Create an object of EvenOddChecker
    EvenOddChecker checker = new EvenOddChecker();

    // Call the method
    checker.checkEvenOdd(number);

    input.close();
}
