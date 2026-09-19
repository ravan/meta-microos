SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "libarpack2-3.9.1-4.6.aarch64.rpm"
RPM_HASH = "9a52af287a5cf6ec0209e151d1cc1649bd8f2a510a563370880199bc26d825fed3b80d9491cfc2fa3fa71b086a65d403741c21fe445563feb48e41392c34de90"

RPROVIDES:${PN} += "libarpack.so.2 \
libarpack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
