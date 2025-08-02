package neww;
import java.util.*;

public class employee_saalary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee ID:");
        long id = sc.nextLong();

        System.out.println("Enter the Salary:");
        double sal = sc.nextDouble();

        System.out.println("Enter the HRA percent:");
        int hra = sc.nextInt();

        System.out.println("Enter the DA percent:");
        int da = sc.nextInt();

        System.out.println("Enter the PF percent:");
        int pf = sc.nextInt();
        
        //type conversion

        int hra_sal = (int)(sal * ((double)hra / 100));
        int da_sal = (int)(sal * ((double)da / 100));
        int pf_sal = (int)(sal * ((double)pf / 100));

        long gross_salary = (long)(sal + hra_sal + da_sal - pf_sal);

        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + sal);
        System.out.println("HRA: ₹" + hra_sal);
        System.out.println("DA: ₹" + da_sal);
        System.out.println("PF: ₹" + pf_sal);
        System.out.println("Gross Salary: ₹" + gross_salary);

        sc.close();
    }
}