import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by hartaxfr on 18/06/14.
 */
public class CalculatriceTest {

    @Test
    public void testAdd(){
        Integer add = Calculatrice.add(4, 2);
        Assert.assertEquals(Integer.valueOf(6),add);

        add = Calculatrice.add(null, 2);
        Assert.assertNull(add);

        add = Calculatrice.add(4, null);
        Assert.assertNull(add);

        add = Calculatrice.add(null, null);
        Assert.assertNull(add);
    }

    @Test
    public void testDiv(){
        Integer div = Calculatrice.div(4, 2);
        Assert.assertEquals(Integer.valueOf(6),div);

        div = Calculatrice.div(null, 2);
        Assert.assertNull(div);

        div = Calculatrice.div(4, null);
        Assert.assertNull(div);

        div = Calculatrice.div(null, null);
        Assert.assertNull(div);

    }
}


