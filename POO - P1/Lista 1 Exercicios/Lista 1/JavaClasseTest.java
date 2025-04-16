class JavaClasseTest {
    String name;
    int tel;
    String endereco;

    public JavaClasseTest(String name, int tel, String endereco) {
        this.name = name;
        this.tel = tel;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return endereco;
    }

    public void setEnd(String endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        JavaClasseTest testando = new JavaClasseTest("Matheus", 1234, "Joaquim Fidelis");
        System.out.println("Name: " + testando.getName());
        System.out.println("Telephone: " + testando.getTel());
        System.out.println("Address: " + testando.getEnd());
    }
}
