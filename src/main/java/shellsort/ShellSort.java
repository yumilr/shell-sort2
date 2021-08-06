package shellsort;

public class ShellSort {
    public static String ReadLn(int maxLg) {
        byte[] lin = new byte[maxLg];
        int lg = 0;
        int car = -1;
        try {
            while (lg < maxLg) {
                car = System.in.read();
                if ((car < 0) || (car == '\n'))
                    break;
                lin[lg++] += car;
            }
        } catch (Exception e) {
            return (null);
        }
        if ((car < 0) || (lg == 0))
            return (null);
        return (new String(lin, 0, lg));
    }
}