public class TimeUtil {
    /**
     * 以秒为单位格式化通话时间
     * 适配格式：10时9分8秒；00:03:08等\d\D\d\D\d格式
     * format(00:03:08) = 188s
     *
     * @param target
     * @return
     */
    public static int formatTime(String target) {
        String[] s = target.split("\\D+");
        return Integer.parseInt(s[0]) * 3600 + Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]);
    }
}
