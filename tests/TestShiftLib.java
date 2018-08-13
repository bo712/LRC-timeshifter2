import org.junit.Assert;
import org.junit.Test;

public class TestShiftLib {

    @Test
    public void shiftInSec()
    {
        Assert.assertEquals(94.12f, ShiftLib.convertInSec("+01:34.12"),0.0f);
        Assert.assertEquals(17.12f, ShiftLib.convertInSec("-00:17.12"),0.0f);
    }


}
