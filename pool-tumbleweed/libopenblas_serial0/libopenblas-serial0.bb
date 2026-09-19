SUMMARY = "An optimized BLAS library based on GotoBLAS2, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_serial0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "0f1f9029da14ffba7f44eb7b44aaf470732f082f167025dbabb9dee6a92761d512065a7d121d734dff4cbe0933fee8836c2335862138354ccd0311f90ff22d48"

RPROVIDES:${PN} += "libopenblas-serial0 \
libopenblas0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
