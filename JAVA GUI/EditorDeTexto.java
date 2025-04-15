import javax.swing.*;

public class EditorDeTexto {
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

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(10, 60, 100, 30);
        frame.add(salvar);

        JButton salvarComo = new JButton("Salvar Como");
        salvarComo.setBounds(10, 100, 100, 30);
        frame.add(salvarComo);

        JButton fechar = new JButton("Fechar");
        fechar.setBounds(10, 140, 100, 30);
        frame.add(fechar);

        frame.setVisible(true);
    }
}