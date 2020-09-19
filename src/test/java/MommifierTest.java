import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    Mommifier mommifier ;
    @BeforeEach
    void setUp() {
        mommifier = new Mommifier();
    }

    @Test
    void should_return_string_when_without_no_vowels(){
        String string="qqqqq";
        assertEquals("qqqqq", mommifier.getNewString(string));
    }

    @Test
    void should_return_string_when_vowel_lesser_than_third_of_percentage (){
        String string="qqqqqqaeiou";
        assertEquals("qqqqqqaeiou", mommifier.getNewString(string));
    }
}
