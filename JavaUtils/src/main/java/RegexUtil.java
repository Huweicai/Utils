import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则工具
 */
public class RegexUtil {
    public static String findOne(String content, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            return matcher.group().trim();
        }
        return "";
    }

    public static String[] findAll(String content, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        ArrayList<String> res = new ArrayList<String>();
        while (matcher.find()) {
            res.add(matcher.group().trim());
        }
        String[] array = new String[res.size()];
        res.toArray(array);
        return array;
    }
}
