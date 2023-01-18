package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {//a, e, i, o, u
        if (character=='a'|| character=='e'|| character=='u' || character=='i' || character=='o'
                || character=='A'|| character=='E'|| character=='U' || character=='I' || character=='O'){
            System.out.println("Vowel");
        } else if ((character>'a' && character<='z') || (character>'A' && character<='Z')){
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
