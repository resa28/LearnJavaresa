Import java.util.Scanner;

public class WhileNDoWhile {
    public static void main(String)[] args) {
        boolean running = true;
        int counter     = 0;
        String answer;

        Scanner scanner = new Scanner(Sytem.in);

        while (running) {
            System.out.println("Apakah anda ingin keluar?");
            Sytem.out.print("Jawab [iya/tidak]> ");

            answer = scanner.nextline();

            if (answer.equalsIgnoreCase(another string: "iya")) {
                running = false
            }

            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak" + counter + "Kali");

        /**
         * Do While
         */
        int i = 0;

        do {
            Sytem.out.println("Perulangan ke-" + i);
            i++;
        } while (i <= 10);
    }
}