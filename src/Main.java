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
        char hre = ' '; //по заданию сказано использовать именно метод int из char
        character = hre;
        System.out.println("Исходный символ: "+character+". Код символа: "+character.hashCode()+". sumDigits: "+sumDigits(character));
        System.out.println("Введите целые цифры или один символ ASCII для расчета суммы цифр:");
        while(true){
            try{
                Scanner console = new Scanner(System.in);
                String str = console.next();
                if (str.length()==1){
                    Character c = str.charAt(0);
                    System.out.println("Исходный символ: "+c+". Код символа: "+c.hashCode()+". sumDigits: "+sumDigits(c));
                }else{
                    System.out.println("Исходное число для расчета: "+Integer.parseInt(str)+". Результат sumDigits: "+sumDigits(Integer.parseInt(str)));
                }
            }
            catch (Exception e){
                System.out.println("Введены не целые цифры или один символ ASCII! Повторите ввод: ");
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
    }
    public static Integer sumDigits(Character decNumber){
        int sum=0;
        for (int i=0; i<String.valueOf(decNumber.hashCode()).length();){
            sum += Integer.valueOf(((String.valueOf(decNumber.hashCode())).charAt(i)-'0'));
            i++;
        }
        return sum;
    }
}
