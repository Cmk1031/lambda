package lambda.ex2;

public class BuilderGreeterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        // 코드 작성
        StringFunction hello = buildGreeter("Hello");
        StringFunction hi = buildGreeter("Hi");

        System.out.println(hello.apply("java"));
        System.out.println(hi.apply("lambda"));


    }

}
