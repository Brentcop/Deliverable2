//Brent Coppinger Ver 0.0.1
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class Deliverable2 {

	public static void main(String[] args) {

		int days, months, years;

		System.out.print("Enter the oldest date: (YYYY-MM-DD format) ");
		Scanner scanner = new Scanner(System.in);// Creates first contrasting date for the code
		String oldDateString = scanner.nextLine();
		LocalDate oldDate = LocalDate.parse(oldDateString);// Translates the string into a workable #

		System.out.println("You entered " + oldDate + " for the older date.");
		System.out.print("Enter the most recent date: (YYYY-MM-DD format) ");

		String newDateString = scanner.nextLine();
		LocalDate newDate = LocalDate.parse(newDateString);
		System.out.println("And you also entered " + newDate + " for the newer date.");

		Period difference = oldDate.until(newDate);// States what we are subtracting

		days = difference.getDays();// Calculates days, months, and years
		months = difference.getMonths();
		years = difference.getYears();

		System.out.println(
				"The difference in time is: " + years + " Years, " + months + " Months, and " + days + " days.");
	}
}