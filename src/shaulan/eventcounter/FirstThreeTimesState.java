package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class FirstThreeTimesState extends State {
	private static final long serialVersionUID = 5753758882253386467L;

	public FirstThreeTimesState() {
		super();
		System.out.println("First 3 times");
	}

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(FirstEvent.class)) {
			return new FirstOnceState();
		} else {
			return new SecondOnceState();
		}
	}

}