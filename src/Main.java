import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        //4.6
        System.out.println("Исходное число для расчета: "+container.count+". Результат sumDigits: "+sumDigits(container.count)); //проверка результата

        while(true){
            try{
                Scanner console = new Scanner(System.in);
                System.out.println("Введите целые цифры для расчета суммы цифр:");
                System.out.println("Result sumDigits: "+sumDigits(console.nextInt()));
            }
            catch (Exception e){
                System.out.println("Введены не целые цифры! Повторите ввод: ");
            }
        }
    }
    public static Integer sumDigits(Integer number)
    {
        //4.6
        int sum=0;
        for(int i=0; i<number.toString().length();) {
            sum += Integer.valueOf((number.toString().charAt(i) - '0'));//прибавка числа самого к себе на каждой итерации цикла
            i++;
        }
        return sum;
        /*
        System.out.println(number); //вывод значения переданного объекта
        System.out.println(number.getClass().getName()); //вывод названия имени класса объекта
        System.out.println(number.toString().getClass().getName()); //перевод значения класса в объект строка
        String str = new String(number.toString()); //для удобства копирование значения строки в новую строку
        System.out.println("Проверка получения значения строки: "+str);
        System.out.println("Длина строки: "+str.length());
        System.out.println("Элемент 1 строки str: "+(str.charAt(0)-'0'));//int значение
        */

        //System.out.println("Sum: "+sum);
    }
}
