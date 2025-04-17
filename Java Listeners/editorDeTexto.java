import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class editorDeTexto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor de Texto");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea areaTexto = new JTextArea("Digite texto nesta área\ncom\nvárias\nlinhas.");
        areaTexto.setBounds(130, 20, 430, 220);
        frame.add(areaTexto);

        JButton abrir = new JButton("Abrir");
        abrir.setBounds(10, 20, 100, 30);
        frame.add(abrir);

        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    String nomeArq = JOptionPane.showInputDialog(frame, "nome do arquivo", "abrir arquivo",
                            JOptionPane.PLAIN_MESSAGE);

                    if (nomeArq == null || nomeArq.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "nenhum arquivo especificado", "erro",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    FileInputStream in = new FileInputStream(nomeArq);
                    Scanner sin = new Scanner(in);
                    areaTexto.setText("");
                    while (sin.hasNextLine()) {
                        areaTexto.append(sin.nextLine());
                        areaTexto.append("\n");
                    }
                    in.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "erro ao abrir arquivo: " + ex.getMessage(), "erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(10, 60, 100, 30);
        frame.add(salvar);

        salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nomeArq = JOptionPane.showInputDialog(frame, "nome do arquivo", "abrir arquivo",
                            JOptionPane.PLAIN_MESSAGE);

                    if (nomeArq == null || nomeArq.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "nenhum arquivo especificado", "erro",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    FileOutputStream out = new FileOutputStream(nomeArq);
                    out.write(areaTexto.getText().getBytes());
                    out.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "erro ao abrir arquivo: " + ex.getMessage(), "erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton salvarComo = new JButton("Salvar Como");
        salvarComo.setBounds(10, 100, 100, 30);
        frame.add(salvarComo);

        JButton fechar = new JButton("Fechar");
        fechar.setBounds(10, 140, 100, 30);
        frame.add(fechar);

        frame.setVisible(true);
    }
}