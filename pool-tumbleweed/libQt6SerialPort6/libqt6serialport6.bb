SUMMARY = "Qt 6 SerialPort library"
DESCRIPTION = "The Qt SerialPort library provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6SerialPort6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6fb2b108943e6bf1e3bd7ba9051e1c186b318228029bedc8644d79b410eb64c94dacaebb354eaff1056a02a7bf010e01804726eee5e853b694e0f8a51d27ea8f"

RPROVIDES:${PN} += "libQt6SerialPort.so.6 \
libQt6SerialPort6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
