public class Program4 {
    public static void main(String args[]) {
        int marks[];
        marks = new int[5];
        String students[] = { "Risu", "Meenu", "Hima", "Sana", "Hema" };
        marks[0] = 45;
        marks[1] = 49;
        marks[2] = 13;
        marks[3] = 27;
        marks[4] = 32;
        if (marks[0] > 35) {
            System.out.println(students[0] + "=" + marks[0]);
        }
        if (marks[1] > 35) {
            System.out.println(students[1] + "=" + marks[1]);
        }
        if (marks[2] > 35) {
            System.out.println(students[2] + "=" + marks[2]);
        }
        if (marks[3] > 35) {
            System.out.println(students[3] + "=" + marks[3]);
        }
        if (marks[4] > 35) {
            System.out.println(students[4] + "=" + marks[4]);
        }

    }
}
