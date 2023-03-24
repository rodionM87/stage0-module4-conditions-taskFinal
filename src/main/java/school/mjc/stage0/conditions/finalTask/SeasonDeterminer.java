package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        
	case 12, 1, 2 -> {
	    Syetsm.out.println("Winter");
	}
	case 3, 4, 5 -> {
	    Syetsm.out.println("Spring");
	}
	case 6, 7, 8 -> {
	    Syetsm.out.println("Summer");
	}
	case 9, 10, 11 -> {
	    Syetsm.out.println("Autumn");
	}
	default -> {
	    Syetsm.out.println("Wrong month number");
	}
    }
}
