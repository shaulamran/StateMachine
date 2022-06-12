package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class SecondOnceState extends State {
	private static final long serialVersionUID = 3829092363763652763L;

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(SecondEvent.class)) {
			return new SecondThreeTimesState();
		} else {
			return new FirstOnceState();
		}
	}

}