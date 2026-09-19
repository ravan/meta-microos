SUMMARY = "An optimized BLAS library based on GotoBLAS2, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_pthreads0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "a25144dbb466a40e7efb7f4983621d1162003bfe7f238b6d6e3b384d29efd4d5503ac9e45ad58cec3e4e80f2124db38f275f22708152ee4d4883e57a595bb663"

RPROVIDES:${PN} += "libopenblas-pthreads0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
