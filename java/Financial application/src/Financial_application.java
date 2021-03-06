import java.util.Scanner;
import java.text.DateFormat;

public class Financial_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name:");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week:");
		double workhour = input.nextDouble();
		
		System.out.print("Enter hourly pay rate:");
		double pay = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		double federaltax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double statetax = input.nextDouble();
		
		double crosspay = pay*workhour ;
		double deduction =crosspay*(statetax+federaltax);
		
		System.out.println("\n");
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+workhour);
		System.out.println("Pay Rate: "+pay);
		System.out.println("Gross Pay: "+crosspay);
		System.out.println("Deductions:");
		System.out.println("Federal Withholding :"+"("+federaltax*100+"%)"+String.format("%.2f",crosspay*federaltax));
		System.out.println("State Withholding : "+"("+statetax*100+"%)"+String.format("%.2f",crosspay*statetax));
		System.out.println("Total Deduction: "+String.format("%.2f",deduction));
		System.out.println("Net Pay: "+String.format("%.2f", crosspay-deduction));
	}

}
