import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Yandi Fenanda
 * @createdOn 19/06/23 Monday
 */
public class FormCalculator extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton addBtn;
    private JButton minBtn;
    private JButton timesBtn;
    private JButton divBtn;
    private JButton refreshBtn;
    private JTextField txt1;
    private JTextField txtHasil;
    private JTextField txt2;
    private JLabel lblHasil;



    public FormCalculator()
    {
        setContentPane(panel1);
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        txt1.setEnabled(true);
        txt2.setEnabled(true);
        txtHasil.setEnabled(true);
        txt1.requestFocusInWindow();
        txt2.requestFocusInWindow();
        txtHasil.requestFocusInWindow();

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = txt1.getText();
                String input2 = txt2.getText();
                int tambah = Integer.parseInt(input1) + Integer.parseInt(input2);
                txtHasil.setText(String.valueOf(tambah));
            }
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = txt1.getText();
                String input2 = txt2.getText();
                int bagi = Integer.parseInt(input1) / Integer.parseInt(input2);
                txtHasil.setText(String.valueOf(bagi));
            }
        });
        refreshBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                txt2.setText("");
                txtHasil.setText("");
            }
        });
        timesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = txt1.getText();
                String input2 = txt2.getText();
                int times = Integer.parseInt(input1) * Integer.parseInt(input2);
                txtHasil.setText(String.valueOf(times));
            }
        });
        minBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = txt1.getText();
                String input2 = txt2.getText();
                int min = Integer.parseInt(input1) - Integer.parseInt(input2);
                txtHasil.setText(String.valueOf(min));
            }
        });
    }

    public static void main(String args[]) {
        FormCalculator formCalculator = new FormCalculator();
    }
}
