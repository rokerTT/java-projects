public class Calculate {
    public static void main(String[] arg) {
        float first = Float.valueOf(arg[0]);
        float second = Float.valueOf(arg[1]);
        float summ = first + second;
            System.out.println("Sum "+summ);
        float subtract = first - second;
            System.out.println("Subtract "+subtract);
        float multiplication = first * second;
            System.out.println("Multiplication "+multiplication);
        float div = first / second;
            System.out.println("Div "+div);
    }
}