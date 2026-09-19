SUMMARY = "Unit Tests for openblas library"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains test binaries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_openmp-tests-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "89d186ac9aa4f1cad16b6edd5419b5fd9192b7a2db842a99ffa94d8a2267ccd7c726f9f19b0f4b9824608b2b11cf2167a4531a33f8c06e52fd05da3d182bcb80"

RPROVIDES:${PN} += "openblas-openmp-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6"

inherit rpm
