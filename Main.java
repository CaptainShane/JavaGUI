import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your are"+age+" years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Your height is " + height +"cm");

        int phoneNumber =Integer.parseInt(JOptionPane.showInputDialog("Enter your phone number: "));
        JOptionPane.showMessageDialog(null,"Your phone number is: "+phoneNumber);

    }
}