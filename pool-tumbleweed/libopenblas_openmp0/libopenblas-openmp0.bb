SUMMARY = "An optimized BLAS library based on GotoBLAS2, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_openmp0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "8dd10fadad75ca6756ccf96a4f91c8e0a3082777e4dba8ddcb3d1b70f23ed8e02feafcd5d16328b399c9873af9a4ce493d8f76d4a82fa091d52cd789a1000242"

RPROVIDES:${PN} += "libopenblas-openmp0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6"

inherit rpm
