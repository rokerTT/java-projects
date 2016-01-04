import java.util.Scanner;
/** Реализует интерактивынй ввод данных*/
public class InteractRunner{
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc =new Calculator();
            String exit ="no";
            while (!exit.equals("yes")){
                System.out.println("Enter first argument: ");
                String first=reader.next();
                System.out.println("Change operator: + , - , * or /");
                String operator=reader.next();
                System.out.println("Enter second argument: ");
                String second=reader.next();
                switch (operator){
                    case "+":
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Summ: "+first+" + "+second+" = "+calc.getResult());
                        break;
                    case "-":
                        calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Cut: "+first+" - "+second+" = "+calc.getResult());
                        break;
                    case "*":
                        calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Mult: "+first+" * "+second+" = "+calc.getResult());
                        break;
                    case "/":
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Div: "+first+" / "+second+" = "+calc.getResult());
                        break;
                    default: System.out.println("Command ERROR!!!");
                        break;
                }
                calc.cleanResult();
                System.out.println("Exit: + yes/no");
                exit = reader.next();
            }
        }
        finally{
            reader.close();}
    }
}