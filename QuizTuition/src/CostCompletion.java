import java.util.Scanner;


public class CostCompletion {
	
private static Scanner student_input;

public static void main(String[] args){
	student_input = new Scanner(System.in);
	
	double Current_Tuition=0;
	double Rate=0;
	double TotalCost = 0;
	
	System.out.println(" What is the Cost of Tuition? ");
	Current_Tuition = student_input.nextDouble();
	
	System.out.println("What is the Rate? " );
	Rate = student_input.nextDouble();
	for(int i = 1; i <= 4; i++){
		if(i==1){
			Current_Tuition = Current_Tuition*(1+(Rate/100));
			System.out.printf("Your First year tuition is: $ %.2f" , Current_Tuition);
			TotalCost += Current_Tuition;
		}
		
		else if( i==2){
			Current_Tuition = Current_Tuition*(1+(Rate/100));
			System.out.printf("\nYour Second year tuition is: $ %.2f" , Current_Tuition);
			TotalCost += Current_Tuition;
		}
		
		else if( i == 3){
			Current_Tuition = Current_Tuition*(1+(Rate/100));
			System.out.printf("\nYour Third year tuition is: $ %.2f" , Current_Tuition);
			TotalCost += Current_Tuition;
		}
		
		else {
			Rate ++;
			Current_Tuition = Current_Tuition*(1+(Rate/100));
			System.out.printf("\nYour Last year tuition is: $ %.2f" , Current_Tuition);
			TotalCost += Current_Tuition;
			
		}
		
	}
	System.out.printf(" \nYour Total Tuition is.... \n $ %.2f \n I bet you wish you didn't go!", TotalCost);
}


}
