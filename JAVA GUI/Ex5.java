//Quatro botoes (abrir, salvar, salvar como e fechar) todos em uma linha só. Abaixo uma area de texto.



import java.awt.*;
import javax.swing.*;

class Exerc2 extends JFrame {
    JButton bAbrir = new JButton("Abrir");
    JButton bSalva = new JButton("Salvar");
    JButton bSComo = new JButton("Salvar Como");
    JButton bFecha = new JButton("Fechar");
    JTextArea texto = new JTextArea(10, 40);

    Exerc2() {
        super("Editor de Texto");
        JPanel p = new JPanel(new GridLayout(1, 4));
        p.add(bAbrir);
        p.add(bSalva);
        p.add(bSComo);
        p.add(bFecha);
        add(p, BorderLayout.NORTH);
        JScrollPane rolagem = new JScrollPane(texto);
        add(rolagem, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String s[]) {
        new Exerc2();
    }
}