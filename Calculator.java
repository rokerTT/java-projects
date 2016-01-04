/**
 * Класс выполняет вычисления
 */

public class Calculator {
    private int result;

    public Calculator() {}

    public void add(int par1, int par2) {/**Метод выполняет сложение*/
       par1 += par2;
       this.result = par1;
    }

    public void sub(int par1, int par2) {/**Метод выполняет вычетание*/
        par1 += -par2;
        this.result = par1;
    }

    public void mult(int par1, int par2) {/**Метод выполняет умножение*/
        par1 *= par2;
        this.result = par1;
    }

    public void div(int par1, int par2) {/**Метод выполняет деление*/
        if(par2 != 0) {
            par1 /= par2;
            this.result = par1;
        }
    }

    public int getResult() {/**Метод возвращает результат операции*/
        return this.result;
    }

    public void cleanResult() {/**Метод очищает выполнение операций*/
        this.result = 0;
    }
}