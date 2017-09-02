package me.carleslc.serialnumber;

public abstract class Hardware {

	private Hardware() {}
	
	/**
	 * Return computer serial number.
	 * 
	 * @return Computer's SN
	 */
	public static final String getSerialNumber() {
		switch (OS.get()) {
			case LINUX: return Linux.getSerialNumber();
			case MAC_OS: return MacOS.getSerialNumber();
			case WINDOWS: return Windows.getSerialNumber();
			default: return null;
		}
	}

}
