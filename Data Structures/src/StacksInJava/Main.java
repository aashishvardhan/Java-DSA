package StacksInJava;

public class Main {
    public static void main(String[] args) {
        String str = "1+2";

        // StringReverser reverser = new StringReverser();
        // var output = reverser.reverse(str);
        // System.out.println(output);
        Expression exp = new Expression();
        var result = exp.isbalanced(str);
        System.out.println(result);

    }
}
