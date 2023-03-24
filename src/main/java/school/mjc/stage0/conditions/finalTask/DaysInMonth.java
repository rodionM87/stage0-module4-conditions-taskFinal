package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (((((year % 400) == 0) && ((year % 100) == 0) && month == 2) || (((year % 4)==0) && (year % 100) != 0) && month == 2)? 1:(month == 2)? 2:(month == 4)||(month == 6) || (month == 9) || (month == 11)? 3 : (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)? 4: 5  ) {
            case 1 -> {
				System.out.println(29);
			}
			case 2 -> {
				System.out.println(28);
			}
			case 3 -> {
				System.out.println(30);
			}
			case 4 -> {
				System.out.println(31);
			}	
			case 5 -> {
				System.out.println("invalid date");
			}
			default -> {
				System.out.println("invalid date");
			}
        }
    }
}
