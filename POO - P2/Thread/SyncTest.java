// A conta bancária compartilhada
class BankAccount {
    private int balance = 0;

    // A operação c++ (balance = balance + amount) não é atômica. 
    // Ela envolve três passos: ler o valor, somar e guardar o novo valor. 
    // Sem 'synchronized', as threads podem se intercalar, causando a perda de atualizações. 
    public synchronized void deposit(int amount) {
        int currentBalance = balance;
        // Simula um pequeno atraso entre a leitura e a escrita do valor
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
        balance = currentBalance + amount;
        System.out.println(Thread.currentThread().getName() + " depositou " + amount + ". Saldo: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

// Thread que representa uma pessoa fazendo depósitos
class Person extends Thread {
    private final BankAccount account;

    public Person(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(100);
        }
    }
}

public class SyncTest {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount();
        Person person1 = new Person(sharedAccount, "João");
        Person person2 = new Person(sharedAccount, "Maria");

        person1.start();
        person2.start();

        // Espera as duas threads terminarem para ver o saldo final
        person1.join();
        person2.join();

        System.out.println("\n------------------------------------");
        System.out.println("Saldo final esperado: 2000");
        System.out.println("Saldo final obtido: " + sharedAccount.getBalance());
        System.out.println("------------------------------------");
        System.out.println("OBS: Para ver o problema, remova 'synchronized' do método deposit().");
    }
}