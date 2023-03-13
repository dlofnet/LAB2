import java.text.DecimalFormat;  
import javax.swing.JOptionPane;

public class HairLength {

    private static final DecimalFormat decfor = new DecimalFormat("0.00"); 

    public static void main(String[] args) {
        int numStrands = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hair strands: "));
        float totalLength = 0;

        for (int i = 0; i < numStrands; i++) {
            double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of hair strand " + (i+1) + " in centimeters: "));
            totalLength += length;
        }

        float average = totalLength / numStrands;
        float kmLength = totalLength / 100000;
        float mileLength = totalLength / 160900;

        JOptionPane.showMessageDialog(null, 
        "Hair length average: " + decfor.format(average) +
        "\nTotal hair length: " + decfor.format(totalLength) + "cm\n" +
        "Total length in km: " + kmLength + "km\n" +
        "Total length in miles: " + mileLength + "m");
    }
}
