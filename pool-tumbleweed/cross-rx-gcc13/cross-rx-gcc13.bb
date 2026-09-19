SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-rx-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "e95710ef9049936d76c55de985b78c28c069c67bf7e68a3a3dc063cbcf415bfeb74f8e09e17ad386bbcee75a29ac50f645671227e7b73e043f4b6d7bdcfa30d6"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "cross-rx-binutils \
cross-rx-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
