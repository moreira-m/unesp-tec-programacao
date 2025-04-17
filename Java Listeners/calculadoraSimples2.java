import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculadoraSimples2 {
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
        botaoCalcular.setBounds(0, 70, 400, 30);
        frame.add(botaoCalcular);

        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campo1.getText());
                    double num2 = Double.parseDouble(campo2.getText());
                    double res = 0;

                    String operacao = (String) comboOperacoes.getSelectedItem();

                    switch (operacao) {
                        case "soma":
                            res = num1 + num2;
                            break;
                        case "subtrai":
                            res = num1 - num2;
                            break;
                        case "multiplica":
                            res = num1 * num2;
                            break;
                        case "divide":
                            if (num2 == 0) {
                                resultado.setText("erro");
                                return;
                            }
                            res = num1 / num2;
                            break;
                    }

                    resultado.setText("= " + res);
                } catch (NumberFormatException ex) {
                    resultado.setText("erro");
                }
            }
        });

        frame.setVisible(true);
    }
}
