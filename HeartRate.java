package chapterThree;

public class HeartRate{
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;


    public HeartRate(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = month;
        this.dayOfBirth = day;
        this.yearOfBirth = year;


    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getAge(int currentYears) {
        return  currentYears - yearOfBirth;
    }
    public int getHeartRateCalculation(int currentYears) {
        return 220 - getAge(currentYears);
    }

    public String getHearRateInRange(int currentYears) {
        int maxHeartRate = getHeartRateCalculation(currentYears);
        double lowerBound = maxHeartRate * 0.50;
        double upperBound = maxHeartRate * 0.85;
        return String.format(lowerBound + " - " + upperBound);
    }

}