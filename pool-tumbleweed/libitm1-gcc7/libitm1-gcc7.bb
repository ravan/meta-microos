SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libitm1-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "06daf0dc6bd21b2af30e2b30e5df38097a0eb6f5ecb8af18e068fd42baf68fb987c2966c1a1780768196f849af9e787cd246ef7cea34938d4a23408aa7f54a28"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
