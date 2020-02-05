import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testHello()
    {
        Person p = new Person ("Manqasana", 23, "female",
                new String[] {"reading", "dancing", "listening to music."});

        String result = p.hello();

        Assert.assertEquals(result, "Hello, my name is Manqasana and I am 23 years old female . My interest are reading , dancing and listening to music.");
    }


}
