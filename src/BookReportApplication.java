public class BookReportApplication {
    public static void main(String[] args) {
        int[] grades = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        BookReport bookReport = new BookReport("CS101 Java Programming", grades);

        bookReport.welcome();
        bookReport.gradesProcessing();
    }
}
