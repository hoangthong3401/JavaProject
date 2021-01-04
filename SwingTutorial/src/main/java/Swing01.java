
import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing01 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setVisible(true);

        JButton jb = new JButton("THIS HERE");

        jf.getContentPane().add(jb);
    }

}
