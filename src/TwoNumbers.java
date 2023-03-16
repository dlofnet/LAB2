//Program by STACEY ANDREW GONZAGA
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TwoNumbers {
    public static void main(String[] args) throws Exception {

        DecimalFormat df = new DecimalFormat("0.00");
        String num1 = JOptionPane.showInputDialog("Enter first number: ");
        String num2 = JOptionPane.showInputDialog("Enter second number: ");

        float sum = Float.valueOf(num1) + Float.valueOf(num2);
        float difference = Float.valueOf(num1) - Float.valueOf(num2);
        float product = Float.valueOf(num1) * Float.valueOf(num2);
        float quotient = Float.valueOf(num1) / Float.valueOf(num2);

        JOptionPane.showMessageDialog (null, 
        "sum: " + sum +
        "\ndifference: " + difference + 
        "\nproduct: " + product +
        "\nquotient: " + df.format(quotient), "Program by STACEY ANDREW GONZAGA", JOptionPane.INFORMATION_MESSAGE);

    }
}
