public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int nobility, int honour, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor" +
                ", благородство" + nobility +
                ", честь" + honour +
                ", храбрость" + bravery +
                '}';
    }
    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.nobility + student1.honour + student1.bravery;
        int total2 = student2.nobility + student2.honour + student2.bravery;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (total2 > total1) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + "одинаково хороши");
        }
    }
}
