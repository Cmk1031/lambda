package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("할당 가능!");
        };

        samInterface.run();

        /*NotSamInterface notSamInterface = () -> {
            System.out.println("할당 불가능!");
        }*/
    }
}
