SUMMARY = "Open Virtual Network core libraries"
DESCRIPTION = "This subpackage contains the OVN shared libraries."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "libovn-26_03-0-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "2fedf84672b3658d908b546aa223f09c8d6e1592b042441b79a175c288ff307ff5a79221ebe53749e4d21cd859a724e8bfd029982fa50e94ca37f92648b4284a"

RPROVIDES:${PN} += "libovn-26-03-0 \
libovn-26.03.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0"

inherit rpm
