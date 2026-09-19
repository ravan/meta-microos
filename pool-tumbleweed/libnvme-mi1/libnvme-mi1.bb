SUMMARY = "NVMe Managament Interface library for libnvme"
DESCRIPTION = "Provides library functions for managing NVMe devices via the NVMe \
Managament Interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.2"

RPM_NAME = "libnvme-mi1-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "c3923be28d01d1d0b57423c824a7a2410c5811d13adb88e3754dd3b0dc7d5d607f73835fbd4deb7efeaaab380d5582a14674b71d91e45a2a7e4e044c5528d63e"

RPROVIDES:${PN} += "libnvme-mi.so.1 \
libnvme-mi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
