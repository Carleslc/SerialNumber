package me.carleslc.serialnumber;

import org.apache.commons.lang3.SystemUtils;

public enum OS {
	WINDOWS,
	LINUX,
	MAC_OS,
	OTHER;
	
	public static final OS get() {
		return SystemUtils.IS_OS_WINDOWS ? WINDOWS :
			SystemUtils.IS_OS_LINUX ? LINUX :
			SystemUtils.IS_OS_MAC ? MAC_OS :
			OTHER;
	}
}
