package builditbigger.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Joker {
    private static ArrayList<String> jokeCollection;

    public Joker() {
        initializeJokes();
    }

    private void initializeJokes() {

        //add all jokes to this joke array
        String[] jokeArray = new String[]
                {
                        "Q: Why could the sesame seed not leave the casino? A: He was on a roll!",
                        "Q: Why did the butcher work extra hours at the shop? A: To make ends meat",
                        "Q: Who's a dessert's favorite actor? A: Robert Brownie, Jr.",
                        "A guy just threw a glass of milk at me. How dairy!",
                        "Did you see the movie about the hot dog? It was an Oscar Wiener.",
                        "Spending a lot of time at the coffee bar can cause a latte problems.",
                        "I always have toast with my breakfast because I’m lack-toast intolerant.",
                        "You know what’s hard to beat for breakfast? A boiled egg.",
                        "Q: What do you call the king of vegetables? A: Elvis Parsley.",
                        "It was an emotional wedding. Even the cake was in tiers."
                };

        jokeCollection = new ArrayList<>(Arrays.asList(jokeArray));
    }

    public static String getJoke() {
        Random random = new Random();
        int selectedJoke = random.nextInt(jokeCollection.size());
        return jokeCollection.get(selectedJoke);
    }
}
