package me.carleslc.serialnumber;

import org.apache.commons.lang3.SystemUtils;

public class Hardware {

	/**
	 * Return computer serial number.
	 * 
	 * @return Computer's SN
	 */
	public static final String getSerialNumber() {
		if (SystemUtils.IS_OS_WINDOWS) {
			return Windows.getSerialNumber();
		}
		if (SystemUtils.IS_OS_LINUX) {
			return Linux.getSerialNumber();
		}
		if (SystemUtils.IS_OS_MAC_OSX) {
			return MacOS.getSerialNumber();
		}
		return null;
	}

}