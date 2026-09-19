SUMMARY = "Library for FreeSRP"
DESCRIPTION = "libfreesrp is a C++ library that uses libusb to program and \
configure the FreeSRP hardware and both receive and transmit RF signals."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "libfreesrp0-0.3.0-2.9.aarch64.rpm"
RPM_HASH = "a4d0903fc17aaeeb334425ebab611d3fe8b6638162a7e8b83daa6aefd5211fd39e22f97abbce80cd800f9ad2a61426bd8429b422ab6d34a93edc24b39423eed8"

RPROVIDES:${PN} += "libfreesrp.so.0 \
libfreesrp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
freesrp-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
