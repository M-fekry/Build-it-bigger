package com.example.jokeslib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyClass {

    List<String> list = asList(
            "Q:Did you hear the one about the little mountain?" + "\n" + "A:It’s hill-arious!",
            "Q: What did the turkey say to the computer?" + "\n" + " A: Google, google, google!",
            "Q: What do you call a running turkey?" + "\n" + "A: Fast food."
    );

    public String getJoke(){
        Random random = new Random();

        String randomJoke = list.get(random.nextInt(list.size()));

        return  randomJoke;
    }
}
