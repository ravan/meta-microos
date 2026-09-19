SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "libitm1-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "37b37e98241e93bb544f9c6457f752415772cf6aeca038b01f2ca94d9184c76420dab56c84590a9956fbf0f197b56eb076d97b354cfc0cb68b5a88d32b03d4ae"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
