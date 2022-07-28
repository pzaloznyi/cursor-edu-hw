package HW1.task3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public final class SongGenerator {
    public static String createSong() {
        var random = ThreadLocalRandom.current();
        var wordList = new ArrayList<String>();
        for (var i = 0; i < random.nextInt(1, 5); i++) {
            var word = words[random.nextInt(0, words.length)];
            wordList.add(i == 0 ? word.substring(0, 1).toUpperCase() + word.substring(1) : word);
        }

        return String.join(" ", wordList);
    }

    private final static String[] words = {
            "plausible",
            "curious",
            "general",
            "head",
            "partner",
            "coast",
            "bless",
            "fool",
            "tested",
            "start",
            "rely",
            "likeable",
            "unnatural",
            "skin",
            "smelly",
            "broad",
            "company",
            "groan",
            "undesirable",
            "ink",
            "wish",
            "describe",
            "wool",
            "bomb",
            "spurious",
            "hate",
            "border",
            "observation",
            "smell",
            "learn",
            "sidewalk",
            "noise",
            "found",
            "retire",
            "spy",
            "annoyed",
            "scrawny",
            "synonymous",
            "hammer",
            "wound",
            "rapid",
            "amuse",
            "share",
            "courageous",
            "example",
            "boast",
            "sock",
            "second-hand",
            "rainstorm",
            "ladybug",
            "two",
            "oceanic",
            "innate",
            "abnormal",
            "loss",
            "roasted",
            "sordid",
            "pull",
            "crook",
            "earn",
            "stem",
            "pricey",
            "celery",
            "charge",
            "secret",
            "aboriginal",
            "downtown",
            "verse",
            "coat",
            "axiomatic",
            "pathetic",
            "thick",
            "program",
            "hour",
            "flaky",
            "holistic",
            "vase",
            "tangible",
            "afraid",
            "finicky",
            "savory",
            "crash",
            "comfortable",
            "sick",
            "spoil",
            "attract",
            "vulgar",
            "trick",
            "connect",
            "awesome",
            "arrange",
            "lunchroom",
            "dull",
            "fascinated",
            "error",
            "church",
            "shake",
            "dysfunctional",
            "anger",
            "lumber"
    };
}
