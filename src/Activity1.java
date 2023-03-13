import javax.swing.JOptionPane;

public class Activity1 {
    public static void main(String[] args) throws Exception {

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
        "\nquotient: " + quotient);

    }
}
