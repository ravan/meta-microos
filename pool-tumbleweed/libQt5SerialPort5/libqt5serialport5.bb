SUMMARY = "Qt 5 Serial Port Addon"
DESCRIPTION = "Qt Serial Port provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5SerialPort5-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "a0e62709b4ddffd1aa014456be134dcc25e3c2e3902434651dc702d53f6e684c329c1efe576d2ac622b35ac55ebfd98ee9c7e5de92a91f4e2b9d5d40f0d623e5"

RPROVIDES:${PN} += "libQt5SerialPort.so.5 \
libQt5SerialPort5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
