
public class JavaClasseTest {
    String name;
    int tel;
    String end;

    public static void main(String[] args) {
        JavaClasseTest classeTeste = new JavaClasseTest();
        classeTeste.name = "Matheus";
        classeTeste.tel = 124;
        classeTeste.end = "Rua Dr Carrijo";

        System.out.println(classeTeste.name);
        System.out.println(classeTeste.tel);
        System.out.println(classeTeste.end);
    }
}
