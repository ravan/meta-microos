SUMMARY = "Driver functions for Osmocom SIMtrace2 and compatible firmware"
DESCRIPTION = "This library contains core 'driver' functionality to interface with the \
Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-1-0.8.0-1.19.aarch64.rpm"
RPM_HASH = "2c907a0d9851a18f778411386a144729a5a1ee13d9ea694569a344a8c0e6dd292be1b6efba1b37992aa12c873f64114bdc770f6a5920555e0f707fc1f1220dc4"

RPROVIDES:${PN} += "libosmo-simtrace2-1 \
libosmo-simtrace2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmosim.so.2 \
libusb-1.0.so.0"

inherit rpm
