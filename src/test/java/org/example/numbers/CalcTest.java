package org.example.numbers;

//import static org.junit.jupiter.Assertions.*;
import junit.framework.TestCase;
import org.junit.Test;

public class CalcTest extends TestCase {

    public void testSum() {
        //        fail("Not yet implemented");
        System.out.println("First JUnit ran");
        Calc c= new Calc();
        int actual=c.sum(3,5);
        int expected=8;
        assertEquals(expected, actual);
    }


    public void testDiff() {
        Calc c= new Calc();
        assertEquals(4,new Calc().diff(4,8));

    }
}