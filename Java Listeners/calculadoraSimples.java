import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadoraSimples implements ActionListener {
    public void actionPerformed(ActionEvent e) {    }

    public static void main(String[] args) {
        calculadoraSimples calculadora = new calculadoraSimples();

        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(null);

        JTextField campo1 = new JTextField();
        campo1.setBounds(10, 30, 100, 30);
        frame.add(campo1);

        JTextField campo2 = new JTextField();
        campo2.setBounds(220, 30, 100, 30);
        frame.add(campo2);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 1, 5, 5));
        painelBotoes.setBounds(120, 10, 90, 100);

        JButton soma = new JButton("somar");
        JButton subtrai = new JButton("subtrai");
        JButton multiplica = new JButton("multiplica");
        JButton divide = new JButton("divide");

        painelBotoes.add(soma);
        painelBotoes.add(subtrai);
        painelBotoes.add(multiplica);
        painelBotoes.add(divide);

        soma.addActionListener(calculadora);
        subtrai.addActionListener(calculadora);
        multiplica.addActionListener(calculadora);
        divide.addActionListener(calculadora);

        frame.add(painelBotoes);

        JLabel resultado = new JLabel("= 0");
        resultado.setBounds(325, 35, 100, 20);
        frame.add(resultado);

        ActionListener listener = e -> {
            try {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double result = 0;

                if (e.getSource() == soma) {
                    result = num1 + num2;
                } else if (e.getSource() == subtrai) {
                    result = num1 - num2;
                } else if (e.getSource() == multiplica) {
                    result = num1 * num2;
                } else if (e.getSource() == divide) {
                    result = num1 / num2;
                }

                resultado.setText("= " + result);
            } catch (NumberFormatException ex) {
                resultado.setText("entrada inválida");
            } catch (ArithmeticException ex) {
                resultado.setText("Erro: " + ex.getMessage());
            }
        };

        soma.addActionListener(listener);
        subtrai.addActionListener(listener);
        multiplica.addActionListener(listener);
        divide.addActionListener(listener);

        frame.setVisible(true);
    }
}
