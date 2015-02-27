import javax.swing.JOptionPane;
/**
 * demonstrate how to +,-,*,/,%
 * 3/2 = 1 r 1
 * 10/3 = 3 r 1
 * 11/3 = 3 r 2
 * @author Nayef Addamigh
 *
 */
public class ClassExercise {
	public static void main(String[] args) {
		
		String strLaberHours = "";
		String strHourRates = "";
		String strTaxRates = "";
		
		double dblLaborHours, dblHourRates, dblTaxRates, dblPayAmount, dblTaxAmount, dblNetPay;
		
		strLaberHours = JOptionPane.showInputDialog("Enter the labor hours ");
		strHourRates = JOptionPane.showInputDialog("Enter the hour rates ");
		strTaxRates = JOptionPane.showInputDialog("Enter the tax rates ");
		
		dblLaborHours = Double.parseDouble(strLaberHours);
		dblHourRates = Double.parseDouble(strHourRates);
		dblTaxRates = Double.parseDouble(strTaxRates);
		dblPayAmount = dblLaborHours * dblHourRates;
		dblTaxAmount = dblTaxRates * dblPayAmount;
		dblNetPay = dblPayAmount - dblTaxAmount;
		
		
		JOptionPane.showMessageDialog(null, "The laber hours is " + strLaberHours + ".\n and the hour rates is $" + strHourRates + "/ hour." + "The pay amount is " + dblPayAmount + ".\n and the tax rates is $" + dblTaxAmount + ". \n The net payment is" + dblNetPay +".");
	
	}
}