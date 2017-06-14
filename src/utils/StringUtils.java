package utils;

/**
 * Created by andriusbaltrunas on 6/14/2017.
 */
public class StringUtils {

    public static boolean isNotBlank(String val){
        boolean isNotBlank = false;
        if(val != null && !val.equals("")){
            isNotBlank = true;
        }
        return isNotBlank;
    }
}
