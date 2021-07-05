// 7.14 – it should be using an array for student's grades record

public class BookReport {
    private String name;
    private int[] grades;

    public BookReport(String subject, int[] gradesArray) {
        this.name = subject;
        this.grades = gradesArray;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void welcome() {
        System.out.printf("Welcome to the book report for \n%s!\n\n",
                this.name);
    }

    // data processing
    public void gradesProcessing() {
        printNotes();

        System.out.printf("\naverage grades for this class is %.2f\n", getAverage());

        System.out.printf("Lowest grade %d\nHighest grade %d\n\n",
                getLowestGrade(), getHighestGrade());

        Bars.showBars(this.grades);
    }

    // modules

    public int getLowestGrade() {
        int lowest = this.grades[0];
        for (int grade: this.grades
             ) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }

    public int getHighestGrade() {
        int highest = this.grades[0];
        for (int grade: this.grades
             ) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public double getAverage() {
        int total = 0;
        for (int grade: this.grades
             ) {
            total += grade;
        }
        double average = (double) total / (double) grades.length;
        return average;
    }

//    public void imprimirGraficoBarras() {
//        GraficoBarras.mostrarGraficoBarras(this.grades);
//    }

    public void printNotes() {
        System.out.println("class' grades record:\n");

        for (int student = 0; student < this.grades.length; student++) {
            System.out.printf("Student %2d: %3d\n",
                    student + 1, this.grades[student]);
        }
    }
}
