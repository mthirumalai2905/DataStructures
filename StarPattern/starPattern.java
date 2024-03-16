public class starPattern {
    public static void main(String[] args) {
        int rows = 13;
        int columns = 3;
        int count = 1;
        int cont = 4;

        // Loop through rows
        for (int i = 0; i < rows; i++) {
            // Loop through columns
            for (int j = 0; j < columns; j++) {
                if ((count == 1 || count == 5 || count == 9 || count == 11 || count == 13 ||
                    count == 17 || count == 21 || count == 23 || count == 25 || count == 29 ||
                    count == 33 || count == 35 || count == 37) && count <=12 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
