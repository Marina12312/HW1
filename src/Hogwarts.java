public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts" +
                "Имя" + name + '\'' +
                "Магия" + magicPower +
                "Трансгрессия " + transgressionDistance +
                '}';
    }
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.magicPower+ student1.transgressionDistance ;
        int total2 = student2.magicPower + student2.transgressionDistance;

        if (total1 > total2) {
            System.out.println(student1.getName() + " обладает большей мощностью магичии чем  " + student2.getName());
        } else if (total2 > total1) {
            System.out.println(student2.getName() + "  обладает большей мощностью магичии чем  " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + "одинаково хороши");
        }
    }
}
