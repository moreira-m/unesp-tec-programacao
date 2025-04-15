// 1. Classe é um projeto ou modelo para criar um objeto

class Dog {
    String name;
    int age;
}

// 2. Instancia é criar um objeto a partir de uma classe

Dog myDog = new Dog();

// 3. Tenho vários métodos com mesmo nome mas com diferentes "conteúdos"

// 4. Override, é redefinir um método herdado de uma superclasse em uma subclasse.

// 5.

class Mostra extends MostraDados {
    @Override
    void mostra(int l) {
        System.out.println(l);
    }

    @Override
    void mostra(float f) {
        System.out.println(f);
    }
}

// 6.

interface MostraDados {
    void mostra(int l);
    void mostra(float f);
}

class Mostra implements MostraDados {
    @Override
    public void mostra(int l) {
        System.out.println(l);
    }

    @Override
    public void mostra(float f) {
        System.out.println(f);
    }
}


// 7. Pode existir duas funçoes mostra() em java devido ao Overloading.
// void mostra(int l) chama argumento tipo int
// void mostra(float f) chama argumento tipo float
// O java seleciona de acordo com o valor. Se for int chama mostra(int), se for float chama mostra(float)