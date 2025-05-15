import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class todolist {

    public static void main (String[] args) {
        JFrame frame = new JFrame("toDo List");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel leftbox = new JPanel();
        leftbox.setPreferredSize(new Dimension(100, 0));
        leftbox.setBackground(Color.gray);
        frame.add(leftbox, BorderLayout.EAST);

        JPanel rightbox = new JPanel();
        rightbox.setPreferredSize(new Dimension(100, 0));
        rightbox.setBackground(Color.WHITE);
        frame.add(leftbox, BorderLayout.WEST);

        frame.add(leftbox);
        frame.add(rightbox);

        frame.setVisible(true);
    }


}
