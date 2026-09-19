SUMMARY = "Development Files for Modbus Library"
DESCRIPTION = "libmodbus is a free software library to send/receive data with a device which \
respects the Modbus protocol. This library can use a serial port or an Ethernet \
connection. \
 \
The functions included in the library have been derived from the Modicon Modbus \
Protocol Reference Guide which can be obtained from Schneider."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libmodbus-devel-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "19d97ca020b35470b8364c50826c99aaea123134f2e1ae03fe68645cc1b3f57c89151f78446121a9548a2f1fdb50e4ae9deafd7b7918f5e99d6b8d40d3410601"

RPROVIDES:${PN} += "libmodbus-devel \
pkgconfig-libmodbus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmodbus5"

inherit rpm
