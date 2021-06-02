public class Program4_1 {
    public static void main(String args[]) {
        int i = 0;
        int marks[];
        marks = new int[5];
        marks[i] = 37;
        marks[++i] = 45;
        marks[++i] = 41;
        marks[++i] = 22;
        marks[++i] = 16;
        String students[];
        students = new String[5];
        i = 0;
        students[i] = "Meenu";
        students[++i] = "Risu";
        students[++i] = "Sana";
        students[++i] = "Hima";
        students[++i] = "Hema";
        for (i = 0; i < marks.length; i++) {
            if (marks[i] > 35) {
                System.out.println(students[i] + "=" + marks[i]);
            }
        }
    }
}
