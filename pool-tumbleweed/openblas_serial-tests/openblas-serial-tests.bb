SUMMARY = "Unit Tests for openblas library"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains test binaries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_serial-tests-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "7202c48e18e6e44ec94f8edb601773c8d91dc634cfe1ea6d0c2abe199dbd4067ef08dcfa77fe9d76aa7b7a860ef5bf879adb3151a665baaa5c70dec8e6c8b296"

RPROVIDES:${PN} += "openblas-serial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
