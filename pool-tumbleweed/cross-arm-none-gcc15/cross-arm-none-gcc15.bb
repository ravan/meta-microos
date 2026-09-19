SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-arm-none-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "3f6a95849406dc33279033c2088cae8389d6d898dd4cb8604f14c76aa8986d2e85e30233bd921b26602af8a2d6230d6b1e97977621a2bbe5cb6f0768ca86c4f7"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc15"

RDEPENDS:${PN} += "cross-arm-binutils \
cross-arm-none-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
