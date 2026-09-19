SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-arm-none-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "10e4ceb3282a4fe56fd736f0fb9941f8c972bd3c2eda1575424c7bb889d632b286465a6da72ba114744cf820f288bcc5e653071a798ef6b8f256a647fbb62d01"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc14"

RDEPENDS:${PN} += "cross-arm-binutils \
cross-arm-none-newlib-devel \
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
