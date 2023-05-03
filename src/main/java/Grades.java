public class Grades {
    private int[] grades;
    private int size;

    private Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
   this.grades[this.size]=value;
    this.size++;
    }
    private int lastMark() {
        int lastMark = size - 1;
        return lastMark;
    }
    private int averageMark () {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }

        double averageMark = sum / size;
        return averageMark;
    }

}