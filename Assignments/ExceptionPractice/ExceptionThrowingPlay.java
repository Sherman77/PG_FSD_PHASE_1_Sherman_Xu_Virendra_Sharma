package ExceptionPractice;

import java.util.Scanner;

public class ExceptionThrowingPlay {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int salary = scanner.nextInt();

        try {
            helper(salary);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void helper(int salary) throws InvalidSalaryException {
        if (salary < 2000) {
            throw new InvalidSalaryException("Your need to work harder");
        } else if (salary >= 5100 && salary < 9000) {
            throw new InvalidSalaryException("you salary is somehow good");
        } else if (salary >= 9000) {
            throw new InvalidSalaryException("salary is very good");
        }
    }

}

class InvalidSalaryException extends Exception {
    InvalidSalaryException(String s) {
        super(s);
    }
}
