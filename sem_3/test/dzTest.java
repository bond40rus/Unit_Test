package sem_3.test;
import org.junit.jupiter.api.Test;
import sem_3.task.dzMain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class dzTest {

    @Test
    void checkEvenNumber() {
        assertTrue(dzMain.evenOddNumber(4));
    }


    @Test
    void checkOddNumber() {
        assertFalse(dzMain.evenOddNumber(3));
    }


    @Test
    void checkNumberInInterval() {
        assertTrue(dzMain.numberInInterval(25));
        assertTrue(dzMain.numberInInterval(100));
    }


    @Test
    void checkNumberNotInInterval() {
        assertFalse(dzMain.numberInInterval(24));
        assertFalse(dzMain.numberInInterval(101));
    }

}