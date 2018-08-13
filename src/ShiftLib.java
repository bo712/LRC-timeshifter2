class ShiftLib {

    static float convertInSec(final String shiftValue){

        int minute = Integer.parseInt(shiftValue.substring(1, shiftValue.length() - 6));
        float sec = Float.parseFloat(shiftValue.substring(4));
        return (Math.round((minute * 60 + sec) * 100f)) / 100f;
    }

}
