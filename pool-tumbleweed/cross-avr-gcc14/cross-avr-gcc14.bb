SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-avr-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "ae76e330113fa5dc2be7190ac8ee3b1ddd7ad0ecf3a438ed1bf2d4eb0d535e00345f9e91b4cddd028fc3fe7996d777a244fb339beadc94cf969fe178d7905ad4"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc14"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
