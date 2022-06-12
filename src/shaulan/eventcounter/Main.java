package shaulan.eventcounter;

import shaulan.Machine;

public class Main {

	public static void main(String[] args) throws Exception {
		var machine = new Machine();
		machine.onEvent(new FirstEvent());
		machine.onEvent(new FirstEvent());
		machine.onEvent(new FirstEvent());
	}
}

