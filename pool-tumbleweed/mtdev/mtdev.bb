SUMMARY = "Multitouch Protocol Translation Library"
DESCRIPTION = "The mtdev is a stand-alone library which transforms all variants of kernel MT events to the slotted type B protocol. The events put into mtdev may be from any MT device, specifically type A without contact tracking, type A with contact tracking, or type B with contact tracking. See the kernel documentation for further details."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "mtdev-1.1.6-1.20.aarch64.rpm"
RPM_HASH = "b12fa8717629640d9502edb1a07287baf37840ac9998b776ce23f3c114e3f5750f38a7ed8aa68f5045c4ef5a272b6299ede67004438e6fedcec2dbb51151ab69"

RPROVIDES:${PN} += "mtdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmtdev.so.1"

inherit rpm
