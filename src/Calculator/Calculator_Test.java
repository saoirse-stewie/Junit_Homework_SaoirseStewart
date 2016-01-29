package Calculator;

/**
 * Created by Saoirse Stewart on 29/01/2016.
 */

import static java.lang.Math.pow;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Calculator_Test {

   Calculator c;

    @Test
    public void test()
    {}
    @Before
    public void setUp() throws Exception
    {
        c = new Calculator();
    }
    @Test
    public void TestAdd()
    {
        assertEquals(c.Getadd(3,1),4,c.Getadd(-1,-4));
        assertEquals(c.Getadd(-1,-4),-5,c.Getadd(-1,-4));
        assertNotSame(4,c.Getadd(-1,4.555555));
    }
    @Test
    public void TestSubtract()
    {
        assertEquals(c.Getsubtract(-2,1),-3,c.Getsubtract(-2,1));
        assertNotSame(4,c.Getsubtract(-1,4.555555));
    }
    @Test
    public void TestMultiple()
    {
        assertEquals(c.Getmultiply(3,4),12,c.Getmultiply(3,4));
        double multipler ;
        multipler = c.Getmultiply(5,6) * 200;
        assertEquals(multipler, 6000, multipler);
    }
    @Test
    public void TestSquarRoot()
    {
        assertEquals(c.GetsquartRoot(50),7.071067812,c.GetsquartRoot(50));
        double distanceBetweemToPoints = pow((c.GetsquartRoot(10)+ c.GetsquartRoot(15)),2) + pow((c.GetsquartRoot(20)+ c.GetsquartRoot(8)),2);
        assertEquals(distanceBetweemToPoints, 102.7931187,distanceBetweemToPoints);
    }
    @Test
    public void TestPowerOf()
    {
        assertEquals(c.GetPowerOf(5,2),25,c.GetPowerOf(5,2));
        double pythagorous;
        pythagorous = c.GetPowerOf(3,2)+ c.GetPowerOf(4,2);
        assertEquals(pythagorous,25.0,pythagorous);
    }

    @Test
    public void TestSin()
    {
        assertEquals(c.Getsin(5),-0.9589242746631385,c.Getsin(5));
        double TestSineFunction;
        TestSineFunction = c.Getcos(Math.PI/2-6); //testing the sine function, as sin = cos(pi/2-degree)
        assertEquals(c.Getsin(6),-0.27941549819892586,TestSineFunction);
        assertNotSame(String.valueOf(c.Getsin(0)+c.Getcos(0)), 0, c.Getsin(0)+c.Getcos(0));
    }
    @Test
    public void TestCos()
    {
        assertEquals(c.Getcos(1),1,c.Getcos(1));
        double TestCosFunction;
        TestCosFunction = c.Getsin(Math.PI/2-6); //testing the cos function, as cos = sin(pi/2-degree)
        assertEquals(c.Getsin(6),-0.27941549819892586,TestCosFunction);

    }
    @Test
    public void TestTan()
    {
        assertEquals(c.Gettan(0),0,c.Gettan(0));
        double TestTanFunction;
        TestTanFunction = c.Getsin(8)/c.Getcos(8); //testing the tan function, as sin/cos
        assertEquals(c.Gettan(8),-6.799711455220379,TestTanFunction);

    }
    @Test
    public void TesttoString()
    {
        assertEquals(c.toString(5.666666),String.valueOf(5.667));
        double pi= 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609;
        assertEquals(c.toString(pi),"3.142");
    }


}
