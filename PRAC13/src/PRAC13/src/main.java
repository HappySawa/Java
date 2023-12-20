package PRAC13.src;
public class main {
    public static void main(String[] args) {

        String name = "text";

        task task = new task();
        System.out.println("1: Запись в файл введённой с клавиатуры информации");
        task.t_1(name);
        System.out.println("2: Вывод информации из файла на экран");
        task.t_2(name);
        System.out.println('\n' + "3: Замена информации в файле на информацию, введённую с клавиатуры");
        task.t_1(name);
        System.out.println("4: Добавление в конец исходного файла текста, введённого с клавиатуры");
        task.t_4(name);
        System.out.println("Result");
        task.t_2(name);
    }
}