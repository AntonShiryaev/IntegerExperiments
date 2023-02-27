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

        //4.6 допзадание
        Character character = '$';
        //System.out.println(character.hashCode()); //возвращает int Dec значение таблицы ASCII
        char hre = ' ';
        character = hre;
        //System.out.println(character+" "+character.getClass()+" "+character.hashCode());
        //System.out.println(sumDigitsChar(character));
        System.out.println("Исходный символ: "+character+". Код символа: "+character.hashCode()+". sumDigitsChar: "+sumDigitsChar(character));

        //Scanner console = new Scanner(System.in);
        //System.out.println(console.next().charAt(0));

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целые цифры для расчета суммы цифр:");
        String str = console.next();
        //System.out.println(str.getClass());
        //System.out.println("Str length:"+str.length());
        if (str.length()==1){
            //System.out.println("Str: "+str);
            Character c = str.charAt(0);
            //System.out.println(c.charValue()+" "+c.getClass());
            System.out.println("sumDigitsChar: "+sumDigitsChar(c));
        }else{
            //System.out.println("Result sumDigits: "+sumDigits(console.nextInt()));
            System.out.println("Result sumDigits: "+sumDigits(Integer.parseInt(str)));
        }
        /*
        while(true){
            try{
                Scanner console = new Scanner(System.in);
                System.out.println("Введите целые цифры для расчета суммы цифр:");
                //System.out.println("Result sumDigits: "+sumDigits(console.nextInt()));

                //ввод символа
                if (console.nextLine().length()==1){
                    Character c = console.next().charAt(0);
                    System.out.println(c.charValue()+" "+c.getClass());
                    System.out.println("sumDigitsChar: "+sumDigitsChar(c));
                }else{
                    System.out.println("Result sumDigits: "+sumDigits(console.nextInt()));
                }

            }
            catch (Exception e){
                System.out.println("Введены не целые цифры! Повторите ввод: ");
            }
        }
        */


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
    }
    public static Integer sumDigitsChar(Character decNumber){
        int sum=0;
        for (int i=0; i<String.valueOf(decNumber.hashCode()).length();){
            sum += Integer.valueOf(((String.valueOf(decNumber.hashCode())).charAt(i)-'0'));
            i++;
        }
        /*
        System.out.println(decNumber); //вывод значения переданного объекта
        System.out.println(decNumber.getClass().getName()); //вывод названия имени класса объекта
        System.out.println(decNumber.toString().getClass().getName()); //перевод значения класса в объект строка
        String str = new String(decNumber.toString()); //для удобства копирование значения строки в новую строку
        System.out.println("Проверка получения значения строки: "+str);
        System.out.println("Длина строки: "+str.length());
        System.out.println("Элемент 1 строки str: "+(str.charAt(0)-'0'));//int значение
        */
        return sum;
    }
}
