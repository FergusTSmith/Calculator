import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int firstNum = s.nextInt();
        int secondNum = s.nextInt();

        System.out.println("Now, please provide an operator: ");

        String operator = s.next();
        boolean validOperator = false;
        while(!validOperator){
            if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*") || operator.equals("%")){
                validOperator = true;
            }else{
                System.out.println("Error. Please enter either *, +, - or /");
                operator = s.next();
            }
        }
        int result = 0;
        if(operator.equals("+")){
            result = firstNum + secondNum;
        }else if(operator.equals("-")){
            result = firstNum - secondNum;
        }else if(operator.equals("/")){
            result = firstNum / secondNum;
        }else if(operator.equals("*")){
            result = firstNum * secondNum;
        }else{
            result = firstNum % secondNum;
        }

        System.out.println("The number " + firstNum + " operated by " + operator + " on second Number " + secondNum + " equals " + result);


    }
}