package chapterThree;
import chapterThree.clock;
public class clockTest {
    public static void main(String[] args) {
        clock clockOne = new clock(23,12,30);
        clock clockTwo = new clock(21,22,20);

        System.out.println("The real time");
        clockOne.displayTime();
        clockTwo.displayTime();

        System.out.println("set the second time");
        clockOne.setHour(12);
        clockOne.setMinute(22);
        clockOne.setSecond(21);

        System.out.println("Display the second time");
        clockOne.displayTime();

    }
}