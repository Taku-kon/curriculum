package exeam;

import java.util.Calendar;

public class test {

    public static void main(String[] args) {
        // 今日が2020/06/27の場合の年月日を表示
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+5);
        System.out.println(cal.get(Calendar.DATE));
    }
}