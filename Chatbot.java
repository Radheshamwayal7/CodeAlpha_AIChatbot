import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

// Handles chatbot logic and generates responses.
public class Chatbot {

    // Provides text processing, knowledge lookup, and random responses.
    private NLPProcessor nlp;
    private KnowledgeBase knowledgeBase;
    private Random random;

    // Initializes the chatbot components.
    public Chatbot() {
        nlp = new NLPProcessor();
        knowledgeBase = new KnowledgeBase();
        random = new Random();
    }

    // Processes user input and generates an appropriate response.
    public String getResponse(String userInput) {

        String text = nlp.cleanText(userInput);

        // Handles empty user input.
        if (text.isEmpty()) {
            return "Please say something. I'm listening!";
        }

        // Handles combined Git and GitHub questions.
        if (text.contains("git") && text.contains("github")) {
            return "Git is a version control system used to track code changes, while GitHub is a platform for hosting and collaborating on Git repositories.";
        }

        // Handles exit commands.
        if (nlp.containsKeyword(
                text,
                "bye",
                "goodbye",
                "exit",
                "quit")) {

            return "Goodbye! It was great chatting with you.";
        }

        // Handles time-related questions.
        if (nlp.containsKeyword(
                text,
                "time",
                "current time")) {

            return getCurrentTime();
        }

        // Handles specific date-related questions.
        if (nlp.containsKeyword(
                text,
                "what is the date",
                "what's the date",
                "current date",
                "today's date")) {

            return getCurrentDate();
        }

        // Handles casual conversation.
        if (nlp.containsKeyword(
                text,
                "how are you",
                "how do you feel")) {

            String[] responses = {
                "I'm doing great! Thanks for asking.",
                "I'm ready to help you learn Full Stack Java.",
                "I'm working perfectly and ready to chat!"
            };

            return responses[random.nextInt(responses.length)];
        }

        // Handles appreciation messages.
        if (nlp.containsKeyword(
                text,
                "thank you",
                "thanks")) {

            return "You're welcome! Keep learning and building.";
        }

        // Handles Java history questions.
        if (text.contains("who developed java")
                || text.contains("developed java")
                || text.contains("creator of java")) {

            return knowledgeBase.getResponse("developed java");
        }

        // Searches the knowledge base for relevant topics.
        String[] keys = {
            "full stack java",
            "spring boot",
            "rest api",
            "exception handling",
            "primary key",
            "foreign key",
            "git commit",
            "git push",
            "git pull",
            "nice to meet you",
            "what are you doing",
            "who are you",
            "your name",
            "javascript",
            "postgresql",
            "github",
            "git",
            "css",
            "html",
            "java",
            "oop",
            "class",
            "object",
            "inheritance",
            "polymorphism",
            "encapsulation",
            "abstraction",
            "arraylist",
            "hashmap",
            "multithreading",
            "frontend",
            "backend",
            "jdbc",
            "servlet",
            "api",
            "spring",
            "hibernate",
            "jpa",
            "maven",
            "sql",
            "database",
            "mysql",
            "crud",
            "join",
            "full stack",
            "mvc",
            "authentication",
            "authorization",
            "jwt",
            "codealpha",
            "hello",
            "hi",
            "hey",
            "help"
        };

        for (String key : keys) {

            if (text.contains(key.toLowerCase())) {

                String response =
                    knowledgeBase.getResponse(key);

                if (response != null) {
                    return response;
                }
            }
        }

        // Provides a fallback response for unknown questions.
        return getDefaultResponse();
    }

    // Returns the current system time.
    private String getCurrentTime() {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("hh:mm a");

        return "The current time is "
            + time.format(formatter) + ".";
    }

    // Returns the current system date.
    private String getCurrentDate() {

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd MMMM yyyy");

        return "Today's date is "
            + date.format(formatter) + ".";
    }

    // Provides a fallback response when no topic is recognized.
    private String getDefaultResponse() {

        String[] responses = {
            "I'm not sure about that yet. Try asking me about Java, OOP, or Full Stack development.",
            "I didn't quite understand that. Could you ask it another way?",
            "I'm still learning! Try asking me about Java, Spring Boot, databases, or Git.",
            "Interesting question! I don't have an answer for that yet."
        };

        return responses[random.nextInt(responses.length)];
    }
}