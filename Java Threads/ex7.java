import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ex7 extends JFrame {

    JTextField t1 = new JTextField(5);
    JTextField t2 = new JTextField(5);
    JTextField t3 = new JTextField(5);
    JButton jogar = new JButton("Jogar");
    int prontos = 0;

    public ex7() {
        super("Caça Níquel");
        setLayout(new FlowLayout());

        add(t1); add(t2); add(t3); add(jogar);

        jogar.addActionListener(e -> {
            jogar.setEnabled(false);
            prontos = 0;
            girar(t1); girar(t2); girar(t3);
        });

        setSize(300, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void girar(JTextField campo) {
        new Thread(() -> {
            Random rand = new Random();
            int vezes = rand.nextInt(150) + 1;

            for (int i = 0; i < vezes; i++) {
                int n = rand.nextInt(7) + 1;
                SwingUtilities.invokeLater(() -> campo.setText(String.valueOf(n)));
                try { Thread.sleep(3); } catch (Exception ex) {}
            }

            synchronized (this) {
                prontos++;
                if (prontos == 3) {
                    String v1 = t1.getText(), v2 = t2.getText(), v3 = t3.getText();
                    String msg = (v1.equals(v2) && v2.equals(v3)) ? "Parabéns!" : "Você perdeu!";
                    JOptionPane.showMessageDialog(this, msg);
                    jogar.setEnabled(true);
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new ex7();
    }
}
