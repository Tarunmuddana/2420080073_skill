package neww;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class age_person {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your birth year");
	 int year = sc.nextInt();
	 System.out.println("enter your birth month");
	 int month =sc.nextInt();
	 System.out.println("enter your birth day");
	 int day = sc.nextInt();
	 
	 LocalDate d1 = LocalDate.of(year,month-1,day-1);
	 LocalDate d = LocalDate.now();
	 Period p = Period.between(d1,d);

	 
	 System.out.println("your are "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days old");
	 sc.close();
 }
}
