SUMMARY = "Save/restore system clock on machines without working RTC hardware"
DESCRIPTION = "Some machines don't have a working realtime clock (RTC) unit, or no \
driver for the hardware that does exist. fake-hwclock is a simple set \
of scripts to save the kernel's current clock periodically (including \
at shutdown) and restore it at boot so that the system clock keeps at \
least close to realtime. This will stop some of the problems that may \
be caused by a system believing it has travelled in time back to \
1970, such as needing to perform filesystem checks at every boot. \
 \
On top of this, use of NTP is still recommended to deal with the fake \
clock 'drifting' while the hardware is halted or rebooting."
LICENSE = "GPL-2.0-only"

PV = "0.14"

RPM_NAME = "fake-hwclock-0.14-1.4.noarch.rpm"
RPM_HASH = "6a6dd5808e90d1a3fd9ea1153bbae27cd3c61a1fab477afb3089586a5855149032541ec33c69a6a73f0a46f7086bfb7c8968b2e8cf2c98faae5ee00b02a6e70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fake-hwclock \
fake-hwclock"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
