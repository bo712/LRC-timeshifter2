import org.junit.Assert;
import org.junit.Test;

public class TestStiftLib {

    @Test
    public void shiftInSec()
    {
        Assert.assertEquals(94.12, ShiftLib.shiftInSec("+01:34.12"),0.0);
        Assert.assertEquals(17.12, ShiftLib.shiftInSec("-00:17.12"),0.0);
    }

}
