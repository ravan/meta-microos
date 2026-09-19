SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-arm-none-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "718a3955b812c48e7e769539bacb02cb071fb79504dc610dabb48ac919dfb21c557d2dafe043c9647f25091ef5c214e45270c8617efbdc569453ca52d87936b4"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc16"

RDEPENDS:${PN} += "cross-arm-binutils \
cross-arm-none-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
