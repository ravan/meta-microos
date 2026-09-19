SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "libparpack2-openmpi4-3.9.1-4.4.aarch64.rpm"
RPM_HASH = "812d6c20f28bade2c9a544e2179120656cf5d22a6ebf13902c882052572b6fcb88778562fde1502109241ccfb47dad198e5c389cc6f76ff12e39e823c9f04b32"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.40 \
libopenblas.so.0 \
openmpi4-libs"

inherit rpm
