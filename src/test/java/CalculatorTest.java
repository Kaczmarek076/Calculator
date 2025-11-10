import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    void firstMultiply() {
        System.out.println("testing 2,3 and 4");
        //arrange , input
        int a = 2;
        int b = 3;
        int c = 4;
        int exp = 24;

// act
        int actual = Calculator.gange(a, b, c);
        //assert
        assertEquals(exp, actual);


    }

    @org.junit.jupiter.api.Test
    void secondMultiply() {
        System.out.println("testing 6,9 and 15");
        //arrange , input
        int a = 6;
        int b = 9;
        int c = 15;
        int exp = 810;

// act
        int actual = Calculator.gange(a,b,c);
        //assert
        assertEquals(exp,actual);


    }
}

