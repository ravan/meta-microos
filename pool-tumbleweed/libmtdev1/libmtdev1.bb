SUMMARY = "Multitouch Protocol Translation Library"
DESCRIPTION = "The mtdev is a stand-alone library which transforms all variants of kernel MT events to the slotted type B protocol. The events put into mtdev may be from any MT device, specifically type A without contact tracking, type A with contact tracking, or type B with contact tracking. See the kernel documentation for further details."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libmtdev1-1.1.6-1.20.aarch64.rpm"
RPM_HASH = "b6bd5af7fd539cb76db2d1a87d4621804bb4a0e7b70ae2b2bd73f7bbf8bd86cee111fd94033a5a13398d7da6c73293515c333bb7714517d9dcd404d7728a29c5"

RPROVIDES:${PN} += "libmtdev.so.1 \
libmtdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
