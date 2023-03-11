package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        var days = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if(isLeapYear(year)){
                    yield 29;
                } else {
                   yield  28;
                }
            }
            default -> "invalid date";
        };
        System.out.println(days);
    }
    public boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if (year % 100 ==0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }else {
                return true;
            }
        } else {
            return false;
        }
    }
}
