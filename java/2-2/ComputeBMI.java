import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeBMI{
	public static void main(String[] args){
		//Scanner input = new Scanner(System.in);

		//System.out.print("Enter your height:");
		//double height = input.nextDouble();
		String input = JOptionPane.showInputDialog(null,"请输入您的身高（米）","BMI计算器",JOptionPane.QUESTION_MESSAGE);
		double height = Double.parseDouble(input);

		//System.out.print("Enter your weight:");
		//double weight = input.nextDouble();
		input = JOptionPane.showInputDialog(null,"请输入您的体重（公斤）","BMI计算器",JOptionPane.QUESTION_MESSAGE);
		double weight = Double.parseDouble(input);
		
		double BMI = weight / Math.pow(height,2);

		String tip = "";

		if (BMI < 16)
			tip = "您的体重超轻！";
		if (BMI < 18 && BMI >=16)
			tip = "您的体重偏轻！";
		if (BMI >= 18 && BMI < 24)
			tip = "您的体重正常！";
		if (BMI >= 24)
			tip = "您的体重超重了！";
		//System.out.println("Your BMI is " + (int)(BMI*100)/100.0);
		JOptionPane.showMessageDialog(null,"您的BMI为" + (int)(BMI*100)/100.0 + "\n" + tip,"BMI计算器",JOptionPane.INFORMATION_MESSAGE);
	}
}
