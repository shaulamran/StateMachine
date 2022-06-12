package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class FirstTwiceState extends State {
	private static final long serialVersionUID = -6154453509045261807L;

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(FirstEvent.class)) {
			return new FirstThreeTimesState();
		} else {
			return new SecondOnceState();
		}
	}

}