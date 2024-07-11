public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intelligence, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "ум" + intelligence +
                ", мудрость" + wisdom +
                ", остроумие" + wittiness +
                ", творчество" + creativity +
                '}';
    }
    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.intelligence+ student1.wisdom + student1.wittiness+ student1.creativity;
        int total2 = student2.intelligence+ student2.wisdom + student2.wittiness + student2.creativity;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (total2 > total1) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }
}
