package person; /**
 * Created by Saoirse Stewart on 29/01/2016.
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import person.Person;

public class Person_Test {
    Person p;

    @Test
    public void test()
    {}
    @Before
    public void setUp() throws Exception
    {
        p = new Person();
    }
    @Test
    public void testPersonName()
    {
        p.setName("Henry");
        assertSame("Henry",p.getName());
        assertNotSame("Sarah",p.getName());
    }
    @Test
    public void testPersonAge()
    {
        assertEquals(0,p.getAge());
        p.setAge(100);
        assertEquals(100,p.getAge());
        int changeAge = p.getAge()-99;
        p.setAge(changeAge);
        assertSame(1,p.getAge());
    }
    @Test
    public void testPersonHeight()
    {
        assertNotSame(0,p.getHeight());//check that it is checking for a double
        p.setHeight(0.2);
        assertEquals(p.getHeight(),0.2,0.2);
    }
    @Test
    public void testPersonWeight()
    {
        assertNotSame(0,p.getWeight());//check that it is checking for a double
        p.setWeight(600);
        double changeAge = p.getWeight()-99;
        assertEquals(p.getWeight(),changeAge,501.0);
    }
    @Test
    public void testPersonAddress()
    {
        p.setAddress("Henry Street");
        assertNotSame("HenryStreet", p.getAddress());// checking spaces
        assertEquals("HenryStreet",p.getAddress().replaceAll("\\s+",""));// getting rid of space
    }
    @Test
    public void testPhoneNumber()
    {
        p.setPhone_number("087-5556666");
        assertEquals("087-5556666",p.getPhone_number());
        p.setPhone_number("101-111");
        assertNotSame(p.getPhone_number().length(),11);//making sure the phone number is correct length
    }






}
