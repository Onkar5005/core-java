import java.util.Scanner;
public class PositiveNumber{
 	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a Number:");
	int num = sc.nextInt();

	if (num > 0){
	System.out.println(num +"is a positive Number.");
       }
	else if (num < 0){
        System.out.println(num+"is a Negative Number.");
       }
	else{
	System.out.println("The Number is Zero.");
       }
 
	sc.close();
   }
}
	
	

