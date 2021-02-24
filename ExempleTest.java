

import org.junit.Test; // junit:junit:4.12
import static org.junit.Assert.assertEquals;


public class ExempleTest {
    @Test
    public void returnsOneIfGivenOne(){
        Exemple exemple=new Exemple();
        String result=exemple.getResult(1);
        assertEquals("1",result);
    }

}
