import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Chatbot bot = new Chatbot();

        System.out.println("======================================");
        System.out.println("        NOVA - JAVA AI CHATBOT        ");
        System.out.println("======================================");
        System.out.println("Hello! I'm Nova.");
        System.out.println("Type 'help' to see what I can do.");
        System.out.println("Type 'bye' to exit.");
        System.out.println("--------------------------------------");

        while (true) {

            System.out.print("\nYou: ");
            String userInput = sc.nextLine();

            String response = bot.getResponse(userInput);

            System.out.println("Nova: " + response);

            if (userInput.equalsIgnoreCase("bye")
                    || userInput.equalsIgnoreCase("exit")
                    || userInput.equalsIgnoreCase("quit")) {

                break;
            }
        }

        sc.close();

        System.out.println("\nChat session ended.");
    }
}