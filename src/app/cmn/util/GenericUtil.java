package app.cmn.util;

public class GenericUtil {
    public static boolean isEmpty(String val){
        if (val == null) return true;
        if (val.trim().length() > 0) return true;
        return false;
    }
    
    public static boolean isNotEmpty(String val){
        return !isEmpty(val);
    }
}
