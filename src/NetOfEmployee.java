//Program by STACEY ANDREW GONZAGA
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class NetOfEmployee {
    public static void main(String[] args) throws Exception {

        DecimalFormat df = new DecimalFormat("0.00");
        
        final float SSS = 175.89f;
        final float PhilHealth = 300f;

        
        float ratePerHour = Float.parseFloat(JOptionPane.showInputDialog(null, "Input rate per hour: "));
        float hours_worked = Float.parseFloat(JOptionPane.showInputDialog(null, "Hours worked: "));
        float absences = (Float.parseFloat(JOptionPane.showInputDialog(null, "Number of absences: ")) * 5.75f);
        float late = (Float.parseFloat(JOptionPane.showInputDialog(null, "Hours late: ")) * 3.25f);

        float gross = ratePerHour * hours_worked;
        float totalDeduction = absences + late + SSS + PhilHealth;
        float net = (gross) - totalDeduction;

        JOptionPane.showMessageDialog(null, "Employee's tak home pay is: " + df.format(net), "Program by STACEY ANDREW GONZAGA", JOptionPane.INFORMATION_MESSAGE);
    }
}
