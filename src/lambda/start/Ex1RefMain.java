package lambda.start;

import lambda.Dice;
import lambda.Procedure;
import lambda.Sum;

import java.util.Random;

public class Ex1RefMain {

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        procedure.run();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        Procedure dice = new Dice();
        Procedure sum = new Sum();
        hello(dice);
        hello(sum);
    }
}




