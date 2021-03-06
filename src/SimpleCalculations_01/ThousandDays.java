package SimpleCalculations_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThousandDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(scan.nextLine(), formatter);
        System.out.println(date.plusDays(999).format(formatter));
    }
}
