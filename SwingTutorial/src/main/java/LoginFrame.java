
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    JLabel jlUsername;
    JLabel jlPassword;
    JButton jbLogin;
    JButton jbReset;
    JTextField jtfUsername;
    JPasswordField jpwPass;

    public LoginFrame() {
        jlUsername = new JLabel("Username: ");
        jlPassword = new JLabel("Password: ");
        jbLogin = new JButton("Login");
        jbReset = new JButton("Reset");
        jtfUsername = new JTextField(10);
        jpwPass = new JPasswordField(10);

    }

    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
        lf.setAlwaysOnTop(true);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setSize(400, 400);
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);

    }
}
