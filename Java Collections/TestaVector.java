import java.util.Vector;

public class TestaVector {
    public static void main(String[] args) {
        Vector v = new Vector();

        for (int i=0; i<10; i++) {
            v.add("Numero " + i);
        }

        v.insertElementAt("inserido na posicao 5", 5);
        v.set(3, "posicao 3 alterada");

        for (int i=0; i<v.size(); i++) {
            System.out.println(i + ":" + v.get(i));
        }
    }
}