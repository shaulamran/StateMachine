package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class FirstOnceState extends State {
	private static final long serialVersionUID = 7489779661410980900L;

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(FirstEvent.class)) {
			return new FirstTwiceState();
		} else {
			return new SecondOnceState();
		}
	}
}
