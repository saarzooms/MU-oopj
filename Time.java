
/*
 * t1 : hh= 12 mm=50 ss=40
 * t2 : hh= 10 mm=20 ss=30
 * t3 : hh= 23 mm=11 ss=10
 */
public class Time {
    int hh;
    int mm;
    int ss;

    String display() {
        return hh + ":" + mm + ":" + ss;
    }

    void addTime(Time ft, Time st) {
        this.ss = ft.ss + st.ss;
        if (this.ss > 59) {
            this.mm = this.ss / 60;
            this.ss = this.ss % 60;
        }
        this.mm += (ft.mm + st.mm);
        if (this.mm > 59) {
            this.hh = this.mm / 60;
            this.mm = this.mm % 60;
        }
        this.hh += (ft.hh + st.hh);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        System.out.println(t1.display());
        System.out.println(t2.display());
        System.out.println(t3.display());
        // t1
        t1.hh = 12;
        t1.mm = 50;
        t1.ss = 40;
        // t2
        t2.hh = 10;
        t2.mm = 20;
        t2.ss = 30;
        System.out.println(t1.display());
        System.out.println(t2.display());
        System.out.println(t3.display());

        /*
         * t3.ss = t1.ss + t2.ss;
         * if (t3.ss > 59) {
         * t3.mm = t3.ss / 60;
         * t3.ss = t3.ss % 60;
         * }
         * t3.mm += (t1.mm + t2.mm);
         * if (t3.mm > 59) {
         * t3.hh = t3.mm / 60;
         * t3.mm = t3.mm % 60;
         * }
         * t3.hh += (t1.hh + t2.hh);
         */
        t3.addTime(t1, t2);
        Time t4 = new Time();
        t4.addTime(t3, t1);
        System.out.println(t1.display());
        System.out.println(t2.display());
        System.out.println(t3.display());
        System.out.println(t4.display());

    }
}
