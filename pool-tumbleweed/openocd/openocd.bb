SUMMARY = "Debugging, in-system programming and boundary-scan testing for embedded devices"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices.  Various different boards, \
targets, and interfaces are supported to ease development time. \
 \
Install OpenOCD if you are looking for an open source solution for hardware \
debugging."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-0.12.0-2.16.aarch64.rpm"
RPM_HASH = "762cfa99f1da286be41e63d7608154c5809bb80161f981467947f71c1f61879f0192d9c80117a9cad671e5094d703f6adcafcf88eda89ebd68e413833c19c69d"

RPROVIDES:${PN} += "openocd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libhidapi-hidraw.so.0 \
libjaylink.so.0 \
libjim.so.0.82 \
libusb-1.0.so.0 \
openocd-data \
udev"

inherit rpm
