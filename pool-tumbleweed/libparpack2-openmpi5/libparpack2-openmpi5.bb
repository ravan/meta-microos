SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "libparpack2-openmpi5-3.9.1-4.3.aarch64.rpm"
RPM_HASH = "825da97cb71532e9c7b339bc1ad668f8343cefd8a4258baa6831c080eede5a6b971a975c0230c3159706f1caa641fa86ac4f3198383808d404256292b9f91149"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.40 \
libopenblas.so.0 \
openmpi5-libs"

inherit rpm
