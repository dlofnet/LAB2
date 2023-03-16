//Program by STACEY ANDREW GONZAGA
import javax.swing.JOptionPane;

public class FlashDrive {
    public static void main(String[] args) throws Exception {
        int numOfDrives = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Flash Drives: "));

        int gross = numOfDrives / 144;
        int dozen = (numOfDrives - (gross * 144)) / 12;
        int extra = numOfDrives - (gross * 144) - (dozen * 12);

        JOptionPane.showMessageDialog(null, 
        "Hi Mr. Lee, you have " + 
        gross + " gross, " + 
        dozen + " dozen, and " + 
        extra + " extra flash drives.", "Program by STACEY ANDREW GONZAGA", JOptionPane.INFORMATION_MESSAGE);
    }
}
