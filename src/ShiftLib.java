class ShiftLib {

    static float convertInSec(final String shiftValue){

        int minute = Integer.parseInt(shiftValue.substring(1, shiftValue.length() - 6));
        float sec = Float.parseFloat(shiftValue.substring(4));
        float value = (Math.round((minute * 60 + sec) * 100f)) / 100f;
        return findSign(shiftValue) ? value : -value;
    }

    static boolean findSign(final String shiftValue) {
        return !shiftValue.substring(0,1).equals("-");
    }

}
