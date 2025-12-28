package programmingContruct.day4;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        // Generate random number: 0 or 1
        int attendance = (int) (Math.random() * 2);
        System.out.println(attendance);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
