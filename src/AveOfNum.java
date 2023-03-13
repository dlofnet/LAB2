import javax.swing.JOptionPane;

public class AveOfNum {
    public static void main(String[] args) throws Exception {

        float total = 0;
        int turn = 0;

        while (turn < 10) {
            total += Float.valueOf(JOptionPane.showInputDialog("Enter a number: "));
            turn++;
        }

        JOptionPane.showMessageDialog(null, "The average is: " + total / 10);
    }
}
