//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гари Поттер", 4, 5, 20, 32, 42);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 44, 35, 2, 32, 42);
        Gryffindor ron = new Gryffindor("Рон Уизли", 60, 6, 52, 32, 2);

        Slytherin draco = new Slytherin("Драко Малфой", 70, 80, 90, 85, 100, 95, 80);
        Slytherin graham = new Slytherin("Грэхэм Монтегюe", 60, 75, 80, 85, 90, 75, 85);
        Slytherin gregory = new Slytherin("Грегори Гойл", 55, 50, 65, 70, 45, 50, 60);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 65, 70, 85, 90, 80);
        Hufflepuff cedric = new Hufflepuff(" Седрик Диггори", 85, 90, 100, 95, 95);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 75, 85, 80, 85, 90);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 80, 90, 95, 85, 80, 90);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 85, 75, 90, 80, 95, 85);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 70, 80, 85, 80, 85, 75);

        Hogwarts[] students = {harry, hermione, ron, draco, graham, gregory, zacharias, cedric, justin, cho, padma, marcus};

        for (Hogwarts student : students) {
            System.out.println(student.toString());
        }
        Gryffindor.compareStudents(harry, hermione);
        System.out.println();
        Hufflepuff.compareStudents(zacharias, cedric);
        System.out.println();
        Slytherin.compareStudents(draco, graham);
        System.out.println();
        Ravenclaw.compareStudents(cho, padma);
        System.out.println();
        Hogwarts.compareStudents(cho, cedric);
        System.out.println();
        Hogwarts.compareStudents(harry, padma);
        System.out.println();


    }
}
