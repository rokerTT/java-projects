/**
    Класс реализует калькулятор */
public class Calculator{
/**
 * Реализует вычисления*/
    private int result;

    /**Суммирует аргументы
     * @param params Аргументы вычисления
     */
    public void add (int...params){
        for (Integer param:params){
            this.result+=param;
        }
    }
    /**
     Получить результат
     @return результат суммирования
     */
    public int getResult(){
        return this.result;
    }
/** Очистть результат вычисления*/
    public void cleanResult(){
        this.result=0;
    }


}