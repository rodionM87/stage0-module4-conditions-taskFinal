package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
			return "division by zero";
		}
		int divided = dividend / divider;
		if (divided == divider) {
			return "can be divided completely";
		} else {
			return "cannot be divided completely";
		}
    }
}
