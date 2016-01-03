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
                System.out.println("Enter second argument: ");
                String second=reader.next();
                calc.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result: "+calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: + yes/no");
                exit = reader.next();
            }
        }
        finally{
            reader.close();}
    }
}