SUMMARY = "Modbus Library"
DESCRIPTION = "libmodbus is a free software library to send/receive data with a device which \
respects the Modbus protocol. This library can use a serial port or an Ethernet \
connection. \
 \
The functions included in the library have been derived from the Modicon Modbus \
Protocol Reference Guide which can be obtained from Schneider."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libmodbus5-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "62d2fecd7bceee553d76f9e617f89e1d027cd8cf1b25dbfe48864386e2fbea0de186333af93150dfaf9523a4e24017d4c48f04e50f9df6540b14ee0eea150a1a"

RPROVIDES:${PN} += "libmodbus.so.5 \
libmodbus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
