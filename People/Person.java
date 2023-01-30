package People;

/*
current design is to limit a number of available workers. A compromise is to have:
6 programmers MAX
2 internal testers (if I have time I might add external qa)
1 marketing dude looking for potential contracts.
In addition,
6 clients,
(i think? 3 clients would also be good, so for example all hard contracts come from Mr Hard or something)

3 subcontractors


that gives 18 people in total.
*/



public abstract class Person {
    public String[] Name = {
            "Tony",
            "John",
            "Josh",
            "James",
            "Connor",
            "Caroline",
            "Daud",
            "Susan",
            "Malin",
            "Andreas",
            "Mary",
            "Amy",
            "Ela",
            "Tristan",
            "Katie",
            "Gordon",
            "Magnus",
            "Aran"
    };
    public String[] Surname = {
            "Noble",
            "Olsson",
            "Hick",
            "Wójcicki",
            "O'Sullivan",
            "Monroe",
            "Wong",
            "Fu",
            "Stark",
            "Doe",
            "Marshall",
            "Cole"
    };
    public int[] cash = {
            100,
            250,
            500,
            1000
    };

//figure out what to put here, lol
}
