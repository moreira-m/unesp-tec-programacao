import javax.swing.*;
import java.awt.*;

public class CalculadoraSimples3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(null);

        JTextField campo1 = new JTextField();
        campo1.setBounds(10, 20, 100, 30);
        frame.add(campo1);

        String[] operacoes = {"Soma", "Subtrai", "Multiplica", "Divide"};
        JComboBox<String> comboOperacoes = new JComboBox<>(operacoes);
        comboOperacoes.setBounds(120, 20, 90, 30);
        frame.add(comboOperacoes);

        JTextField campo2 = new JTextField();
        campo2.setBounds(220, 20, 100, 30);
        frame.add(campo2);

        JLabel resultado = new JLabel("= 0");
        resultado.setBounds(330, 25, 50, 20);
        frame.add(resultado);

        JButton botaoCalcular = new JButton("Calcular");
        Dimension tamanhoBotao = botaoCalcular.getPreferredSize();
        int x = (frame.getWidth() - tamanhoBotao.width) / 2;
        botaoCalcular.setBounds(x, 70, tamanhoBotao.width, tamanhoBotao.height);
        frame.add(botaoCalcular);

        frame.setVisible(true);
    }
}
