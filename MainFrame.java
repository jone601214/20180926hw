import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainFrame extends JFrame {
    private Container cp;
    private JPanel jpn = new JPanel(new GridLayout(4,3,3,3));
    private JPasswordField jPasswordField = new JPasswordField("");
    private JButton jbtn1  = new JButton("1");
    private JButton jbtn2  = new JButton("2");
    private JButton jbtn3  = new JButton("3");
    private JButton jbtn4  = new JButton("4");
    private JButton jbtn5  = new JButton("5");
    private JButton jbtn6  = new JButton("6");
    private JButton jbtn7  = new JButton("7");
    private JButton jbtn8  = new JButton("8");
    private JButton jbtn9  = new JButton("9");
    private JButton jbtn0  = new JButton("0");
    private JButton jbtnRun  = new JButton("RUN");
    private JButton jbtnExit  = new JButton("Exit");
    private JLabel jlb = new JLabel(" ");
    public MainFrame(){
        ex();
    }
    private void ex() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 150, 450, 600);
        cp = this.getContentPane();
        cp.add(jlb, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);
        jlb.setFont(new Font(null, Font.BOLD, 50));
        jlb.setBackground(new Color(255, 193, 244));
        jlb.setOpaque(true);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jbtn3);
        jpn.add(jbtn4);
        jpn.add(jbtn5);
        jpn.add(jbtn6);
        jpn.add(jbtn7);
        jpn.add(jbtn8);
        jpn.add(jbtn9);
        jpn.add(jbtn0);
        jpn.add(jbtnRun);
        jpn.add(jbtnExit);

    }
}