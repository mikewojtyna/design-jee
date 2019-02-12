package pro.buildmysoftware.oop;

public class BothInterfacesImpl implements Interface0, Interface1 {

	private Interface0 interface0;
	private Interface1 interface1;

	public BothInterfacesImpl(Interface0 interface0,
				  Interface1 interface1) {
		this.interface0 = interface0;
		this.interface1 = interface1;
	}

	@Override
	public void method0() {
		interface0.method0();
	}

	@Override
	public void method1() {
		interface1.method1();
	}
	
}
