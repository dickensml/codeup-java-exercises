//import java.util.Arrays;


public class ServerNameGenerator {
    private String[] adjectives = {"dazzling", "large", "wobbly", "robust", "friendly", "creative", "fast", "curvy", "bombastic", "sassy"};

    private String[] nouns = {"house", "dog", "rocket", "mantaray", "harmonica", "box", "car", "mountain", "mammal", "trike"};

    public String[] getAdjecives() {
        return adjectives;
    }

    public String[] getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    private static String makeArray(String[] arrayOfStrings) {
        return arrayOfStrings[(int) Math.ceil(Math.random() * arrayOfStrings.length - 1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is the new server name: ");
        String adjective = makeArray(serverNameGenerator.getAdjecives());
        String noun = makeArray(serverNameGenerator.getNouns());
        System.out.printf("%s-%s%n", adjective, noun);
    }
}
