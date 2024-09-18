import java.util.Scanner;

public class Salary211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSalary;

        System.out.println("input base salary: ");
        int salary = input.nextInt();
        System.out.println("input salary Deduction: ");
        int salaryDeduction = input.nextInt();
        System.out.println("input number Attendance: ");
        int numAttendance = input.nextInt();
        System.out.println("input number Absence: ");
        int numAbsence = input.nextInt();

        totalSalary = (numAttendance * salary) - (numAbsence * salaryDeduction);

        System.out.println("salary = " + salary);
        System.out.println("salary Deduction = " + salaryDeduction);
        System.out.println("num Attendance = " + numAttendance);
        System.out.println("num Absence = " + numAbsence);
        System.out.println("totalSalary = " + totalSalary);

        input.close();
    }
}