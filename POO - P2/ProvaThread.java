/* public class ProvaThread extends Thread {
    boolean continua = true;
    synchronized void func1() {
        continua = false;
        System.out.println(" X");
        System.out.println(" Y");
        try {
            // aqui tem mais código













            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" B");
        System.out.println(" C");
        }

        public static void main(String a[]) {
            ProvaThread pt = new ProvaThread();
            pt.start();
            while (pt.continua)) {
                pt.func2();
            }
        }
    }
}
*/
