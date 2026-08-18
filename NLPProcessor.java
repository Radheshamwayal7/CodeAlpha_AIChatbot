public class NLPProcessor {

    public String cleanText(String input) {

        if (input == null) {
            return "";
        }

        // Convert text to lowercase
        String text = input.toLowerCase();

        // Remove punctuation
        text = text.replaceAll("[^a-z0-9\\s]", "");

        // Remove extra spaces
        text = text.trim().replaceAll("\\s+", " ");

        return text;
    }

    public boolean containsKeyword(String text, String... keywords) {

        for (String keyword : keywords) {

            if (text.contains(keyword.toLowerCase())) {
                return true;
            }
        }

        return false;
    }
}