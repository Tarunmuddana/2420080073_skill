package neww;
import java.util.*;
import java.time.*;
public class employee_login {
 public static void main(String args[]){
	 
	 LocalTime ofin = LocalTime.of(9, 0,0);
	 LocalTime ofout = LocalTime.of(18, 0, 0);
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the employee log in time");
	 System.out.println("current hour");
	 int hour = sc.nextInt();
	 System.out.println("current minute");
	 int min = sc.nextInt();
	 System.out.println("current second");
	 int sec = sc.nextInt();
	 LocalTime in = LocalTime.of(hour,min,sec);
	 
	 System.out.println("enter the employee log out time ");
	 System.out.println("current hour");
	 int hour1 = sc.nextInt();
	 System.out.println("current minute");
	 int min1 = sc.nextInt();
	 System.out.println("current second");
	 int sec1 = sc.nextInt();
	 LocalTime out = LocalTime.of(hour1,min1,sec1);
	 
	 Duration diff = Duration.between(in, out);
	 
	 System.out.println("current time : "+LocalTime.now());
	 if (in.isBefore(ofout)&& in.isAfter(ofin) && out.isBefore(out)) {
		 System.out.println("the employee logged in during the working hours");
		
	 }
	 else {
		 System.out.println("the employee logged in not during the working hours");
	 }
	 System.out.println(diff.toHours()+" hours "+ diff.toMinutes() % 60+" minutes ");
	 
 }
}
