package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class SecondTwiceState extends State {
	private static final long serialVersionUID = -2728256630288301798L;

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(SecondEvent.class)) {
			return new SecondThreeTimesState();
		} else {
			return new FirstOnceState();
		}
	}

}