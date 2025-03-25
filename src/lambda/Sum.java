package lambda;

public class Sum implements Procedure{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
