public class Slytherin  extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int thirstForPower, int resourcefulness) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.thirstForPower = thirstForPower;
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "хитрость" + cunning +
                ", решительность" + determination +
                ", амбиции" + ambition +
                ", находчивость" + resourcefulness +
                ", жажда власти" + thirstForPower +
                '}';
    }
    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int total1 = student1.cunning+ student1.determination + student1.ambition+ student1.resourcefulness + student1.thirstForPower;
        int total2 = student2.cunning+ student2.determination+ student2.ambition + student2.resourcefulness + student2.thirstForPower;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (total2 > total1) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }
}
