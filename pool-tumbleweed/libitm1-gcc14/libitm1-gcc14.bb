SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "libitm1-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "238aee28f2d9754bb7dfcceef8e9589e76503d66b5a1a648eaa874ba4bf423742531b9ff29cfa9cd7d9637765c5393271cf8e2389ce515211a0d6251c6a05f76"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
