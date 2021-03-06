package labEight;
import java.text.DecimalFormat;
import java.util.*;
public class LabEight {
	
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
	System.out.println("Welcome to batting average calculator!");
	String choice = "y";
	while (choice.equalsIgnoreCase("y"))
	System.out.print("Enter number of times at bat:");
		int numbAtBat= Validator.readValidInt();
	in.nextLine();
	int[] atBat= new int[numbAtBat]; 
	System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
	double sum = 0.0;
	double hits=0; 
	
	for (int i=0; i<atBat.length; i++)
	{
	System.out.print("Result for at-bat "+ i+":");		
	atBat[i]= in.nextInt();
	}
	for (int j=0; j<numbAtBat; j++)
	{
		if (atBat[j]>0)
		{
			hits++; 
		}
		sum+=atBat[j];
	}
	DecimalFormat df = new DecimalFormat("##0.000");
	//System.out.println(df.format(x));
	double battingAve= hits/numbAtBat;
	double slugAve= sum/numbAtBat;
	System.out.println(df.format(battingAve));
	System.out.println(df.format(slugAve));
	System.out.println("Another Batter? (y/n):");
    choice = Validator.getString("Another Batter? (y/n):");

	}	
	

}