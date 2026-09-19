SUMMARY = "Development libraries for OpenBLAS, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_serial-devel-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "2352746dc5c7cfcbf2f4527c00505ae1b0af5b9ddf549a6d13d9fdce95712360fdaaf07cf0d231d2ca30636e6562b0cb268bd3ec6f3bfd0f7c74e2fce148a2e9"

RPROVIDES:${PN} += "libopenblas-serial-devel \
openblas-devel-any \
openblas-devel-other"

RDEPENDS:${PN} += "libopenblas-serial0 \
openblas-common-devel"

inherit rpm
