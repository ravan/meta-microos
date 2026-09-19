SUMMARY = "Unit Tests for openblas library"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains test binaries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_pthreads-tests-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "c77a0386a14a8c6195569412613b9da0bf3467b2cab72b4b364c7853cf55d2eb8ea8303be8aed2b15ea643e2bfb7c1fc55e3866cd61b4ef8c839cc180955da78"

RPROVIDES:${PN} += "openblas-pthreads-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
