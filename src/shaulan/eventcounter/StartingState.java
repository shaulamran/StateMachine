package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class StartingState extends State {
	private static final long serialVersionUID = 4396200557412571538L;

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(FirstEvent.class)) {
			return new FirstOnceState();
		} else {
			return new SecondOnceState();
		}
	}

}