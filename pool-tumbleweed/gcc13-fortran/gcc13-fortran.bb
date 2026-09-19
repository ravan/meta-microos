SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-fortran-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "11cd89605f737634acb79b736e9da102167471820f4020f7d151542b2bffbb6141222343da98b1716c194b62716126349501fd404c08552b81ce40cb3ed9156a"

RPROVIDES:${PN} += "gcc13-fortran"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran5 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
