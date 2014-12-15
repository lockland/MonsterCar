package Test;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * @author Lockland
 */
public class TesteLise extends JFrame {

    JPasswordField pf;

    public TesteLise() {
        pf = new JPasswordField("senha");
        JButton btn = new JButton("Logar");

        pf.setPreferredSize(new Dimension(100, 25));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = String.valueOf(pf.getPassword());
                print(string);
            }
        });

        setLayout(new FlowLayout());

        add(pf);
        add(btn);
    }

    public void print(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        TesteLise tt = new TesteLise();
        tt.setTitle("Teste Lise");
        tt.setDefaultCloseOperation(tt.EXIT_ON_CLOSE);
        tt.setSize(300, 300);
        tt.setVisible(true);
    }
}
