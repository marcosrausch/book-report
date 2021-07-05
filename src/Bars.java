// Programa para imprimir gráficos de barras

public class Bars {
    public static void showBars(int[] array) {
//        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
        System.out.println("class grade's frequency: ");

        int[] frequency = new int[11];

        // for each grade increases its frequency
        for (int grade: array
             ) {
            ++frequency[grade / 10];
        }

        // for each array item prints a bar
        for (int counter = 0; counter < frequency.length; counter++) {
            // it prints tags ("00-09: ", ..., "90-99 ", "100: ")
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);
            }

            // it prints the stars
            for (int stars = 0; stars < frequency[counter]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
