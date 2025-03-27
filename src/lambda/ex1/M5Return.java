package lambda.ex1;

public class M5Return {

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add" : return (a,b) -> a+b;
            case "sub" : return (a,b) -> a-b;
            default: return (a,b) -> 0;
        }
    }
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println(add.apply(1,2));

        MyFunction sub = getOperation("sub");
        System.out.println(sub.apply(1,2));

        MyFunction dd = getOperation("dd");
        System.out.println(dd.apply(1,2));
    }
}
