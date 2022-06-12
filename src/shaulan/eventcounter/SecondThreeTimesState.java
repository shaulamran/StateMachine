package shaulan.eventcounter;

import shaulan.Event;
import shaulan.State;

public class SecondThreeTimesState extends State {
	private static final long serialVersionUID = -4510615496609401860L;

	public SecondThreeTimesState() {
		super();
		System.out.println("Second 3 times");
	}

	@Override
	public State onEvent(Event event) {
		if (event.getClass().equals(SecondEvent.class)) {
			return new SecondOnceState();
		} else {
			return new FirstOnceState();
		}
	}

}