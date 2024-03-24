package katas.shortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordKataTest {

    @Test
    public void findShort() throws Exception {
        assertEquals(3, ShortestWordKata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWordKata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWordKata.findShort("Let's travel abroad shall we"));
        assertEquals(6, ShortestWordKata.findShort("travel"));
    }

}
