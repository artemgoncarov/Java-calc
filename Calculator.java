import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner fnum = new Scanner(System.in);
    System.out.println("What's 1 number? ");
    int num1 = fnum.nextInt();
    Scanner snum = new Scanner(System.in);
    System.out.println("What's 2 number? ");
    int num2 = snum.nextInt();
    int res1 = num1 + num2;
    int res2 = num1 - num2;
    int res3 = num1 * num2;
    int res4 = num1 / num2;
    int res5 = num1 % num2;
    Scanner answer = new Scanner(System.in);
    System.out.println("What do you want to do? ");
    String ans = answer.nextLine();
    switch (ans){
        case "+":
            System.out.println(res1);
	    break;
        case "-":
            System.out.println(res2);
	    break;
        case "*":
            System.out.println(res3);
	    break;
        case "/":
            System.out.println(res4);
	    break;
        case "%":
            System.out.println(res5);
	    break;

    }
    }
}
