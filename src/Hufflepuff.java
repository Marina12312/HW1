public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                " трудолюбивы" + diligence +
                ", верны" + loyalty +
                ", честны" + honesty +
                '}';
    }
    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.diligence+ student1.loyalty + student1.honesty;
        int total2 = student2.diligence+ student2.loyalty + student2.honesty;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (total2 > total1) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + "одинаково хороши");
        }
    }
}
