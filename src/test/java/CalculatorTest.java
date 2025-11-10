import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {



            @org.junit.jupiter.api.Test
            void pythCorrect() {
                //input
                double a = 3;
                double b = 4;
                double c = 5;
                boolean exp = true;

                //kald
                boolean actual = Calculator.pyth(a, b, c);

                //tjek
                assertEquals(exp,actual);
            }


            @org.junit.jupiter.api.Test
            void pythWrong() {
            }

        }

