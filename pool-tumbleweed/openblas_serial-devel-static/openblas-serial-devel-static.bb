SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_serial-devel-static-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "07b4ff147685d9b77279e191b678625c0b3a96ce1445c82302505fabb36a821ac275e94892a7791f2b54493223a59f67ee2a0eec1189fcd2da8fff5fd61e8b3c"

RPROVIDES:${PN} += "openblas-serial-devel-static"

RDEPENDS:${PN} += "libopenblas-serial-devel"

inherit rpm
