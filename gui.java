import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
         JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

        boolean visible = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it true that you like programming? [true|false]"));
        if (visible == true) {
            JOptionPane.showConfirmDialog(null, "Wow! That right!");
        } else {
            JOptionPane.showMessageDialog(null, "You mean False. Right? \nNevermind, You should try it.");
        }
    }
}
