class ShiftLib {

    static double shiftInSec(final String shiftValue){

        int minute = Integer.parseInt(shiftValue.substring(1, shiftValue.length() - 6));
        double sec = Double.parseDouble(shiftValue.substring(4));
        return Math.round((minute * 60 + sec) * 100) / 100.0;
    }

}
