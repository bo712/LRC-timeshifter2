class ShiftLib {

    static float convertInSec(final String timeCode){

        int minute = Integer.parseInt(timeCode.substring(1, timeCode.length() - 6));
        float sec = Float.parseFloat(timeCode.substring(4));
        float value = (Math.round((minute * 60 + sec) * 100f)) / 100f;
        return findSign(timeCode) ? value : -value;
    }

    static String convertInTimeCode (final float valueInSec) {
        String minutes = String.valueOf((int)valueInSec / 60);
        if(minutes.length() == 1) {
            minutes = "0".concat(minutes);
        }
        String seconds = String.valueOf(Math.round(valueInSec % 60 * 100) / 100f);
        if(seconds.length() == 3){
            seconds = "0".concat(seconds).concat("0");
        }else if(seconds.length() == 4 && seconds.charAt(1) == '.') {
            seconds = "0".concat(seconds);
        }else if(seconds.length() == 4 && seconds.charAt(2) == '.') {
            seconds = seconds.concat("0");
        }
        return "[".concat(minutes).concat(":").concat(seconds).concat("]");
    }

    static boolean findSign(final String shiftValue) {
        return !shiftValue.substring(0,1).equals("-");
    }

    static String shifting(final String line, final float shiftValueInSec){

        String timeCodeOfLine = line.substring(1, 9);
        String textOfLine = line.substring(10);

        float timeCodeInSec = convertInSec(timeCodeOfLine);
        float shiftedTimeCode = timeCodeInSec + shiftValueInSec;
        String newTimeCode = convertInTimeCode(shiftedTimeCode);
        return newTimeCode.concat(textOfLine);
    }

}
