package youtube;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane; -> para criar as UI
public class WindowsPopUpUi {
    public static void main(String [] args) {
        String name = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showConfirmDialog(null, "hello " + name + ", you are good today?");

        //Integer.paserInt -> convert an integer to a string
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
        JOptionPane.showMessageDialog(null, "Wow you are " + age + " years old");

        //Double.parseDouble -> convert an double to a string
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
        JOptionPane.showMessageDialog(null, "Wow you are " + height + " cm tall");
    }
}
