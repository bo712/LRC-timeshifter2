import org.junit.Assert;
import org.junit.Test;

public class TestShiftLib {

    @Test
    public void convertInSec() {
        Assert.assertEquals(94.12f, ShiftLib.convertInSec("+01:34.12"),0.0f);
        Assert.assertEquals(-17.12f, ShiftLib.convertInSec("-00:17.12"),0.0f);
    }

    @Test
    public void convertInTimeCode() {
        Assert.assertEquals("[02:15.37]",ShiftLib.convertInTimeCode(135.37f));
        Assert.assertEquals("[02:15.30]",ShiftLib.convertInTimeCode(135.30f));
        Assert.assertEquals("[02:15.30]",ShiftLib.convertInTimeCode(135.3f));
        Assert.assertEquals("[00:01.10]",ShiftLib.convertInTimeCode(1.1f));
    }

    @Test
    public void findSign() {
        Assert.assertTrue(ShiftLib.findSign("+01:34.12"));
        Assert.assertTrue(ShiftLib.findSign("01:34.12"));
        Assert.assertTrue(ShiftLib.findSign("+-01:34.12"));

        Assert.assertFalse(ShiftLib.findSign("-+01:34.12"));
        Assert.assertFalse(ShiftLib.findSign("-01:34.12"));
    }

    @Test
    public void shifting() {
        Assert.assertEquals("01:02.17", ShiftLib.shifting("[01:02.17]", 0.00f));
    }


}
