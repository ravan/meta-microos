SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-gcc-fortran-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "664c42d640e35258666f3da8c89eeac3dcbb5f7928e06c4463716392c302ac616fd2e899441ac4cb94980b879a607eaabe8eec80eaf5c5ad866d9394c8726de5"

RPROVIDES:${PN} += "mingw32-cross-gcc-fortran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
