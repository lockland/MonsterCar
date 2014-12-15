package model.extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.*;

/**
 *
 * @author lockland
 */
public class Date extends java.sql.Timestamp {
    
    public Date(){
        this(System.currentTimeMillis());
    }
    
    public Date(String date){
        this(stringToMillis(date));
    }
    
    public Date(long milliSeconds) {
        super(milliSeconds);
    }
    
    private static boolean isPtBrFormat(String string) {
        boolean bool = true;
        Pattern p = Pattern.compile("(\\d{1,2})/(\\d{1,2})/(\\d{4})");
        Matcher m = p.matcher(string);

        if (!m.find()) {
            bool = false;
        }
        return bool;
    }

    private static String getTimeStampPattern(String date) {
        String s = isPtBrFormat(date) ? "dd/MM/yyyy HH:mm:ss" : "yyyy-MM-dd HH:mm:ss";
        return s;
    }

    private static String getPattern(String date) {
        String s = isPtBrFormat(date) ? "dd/MM/yyyy" : "yyyy-MM-dd";
        return s;
    }
    
    private static long dateStringToMillis(String date) {
        String pattern = getPattern(date);
        long millis = 0;
        try {
            millis = new SimpleDateFormat(pattern).parse(date).getTime();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return millis;
    }

    private static long timeStampStringToMillis(String date) {
        String pattern = getTimeStampPattern(date);
        long millis = 0;
        try {
            millis = new SimpleDateFormat(pattern).parse(date).getTime();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return millis;
    }
    
    public static long stringToMillis(String date){
        long l = 0;
        if (date.contains(":")){
            l = timeStampStringToMillis(date);
        } else {
            l = dateStringToMillis(date);
        }
        return l;
    }

    public String toFormat(String format) {
        return format(format, this);
    }
    
    public String format(String format, Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    public String format(String format, String date) {
        return format(format, new Date(date));
    }

    public String millisToString(long milliSeconds, String format) {
        String dt = new Date(milliSeconds).toString();
        return format(format, dt);
    }

    public long toMilliSeconds(){
        return this.getTime();
    }
    
    @Override
    public String toString() {
        return format("yyyy-MM-dd HH:mm:ss", this);
    }
    
    
    public static void main(String[] args) throws ParseException {

        Date dt = new Date(System.currentTimeMillis());
        Date dts = new Date("12/12/2012 12:12:12");

        System.out.println(dts.format("yyyy-MM-dd HH:mm:ss", "12/12/2012 00:00:12"));
        System.out.println(dts.format("dd/MM/yyyy", dt));
        System.out.println(dt);
        System.out.println(dt.toFormat("dd/MM/yyyy HH:mm:ss"));
        System.out.println(dt.toMilliSeconds());
        System.out.println(dts.millisToString(dt.toMilliSeconds(), "dd/MM/yyyy HH:mm:ss"));
        
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2013-05-21 17:06:14"));
    }
}
