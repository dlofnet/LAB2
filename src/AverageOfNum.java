//Program by STACEY ANDREW GONZAGA
import javax.swing.JOptionPane;

public class AverageOfNum {
    public static void main(String[] args) throws Exception {

        float total = 0;
        int turn = 0;

        while (turn < 10) {
            total += Float.valueOf(JOptionPane.showInputDialog("Enter a number: "));
            turn++;
        }

        JOptionPane.showMessageDialog(null, "The average is: " + total / 10, "Program by STACEY ANDREW GONZAGA", JOptionPane.INFORMATION_MESSAGE);
    }
}
