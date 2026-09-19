SUMMARY = "Development libraries for OpenBLAS, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_openmp-devel-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "9ed323fdee57d22adcf6e8b9f67294ce01466e624dc270e37c75c068663c5442d95656af98f9f72b5e435bb284f52d7e6ee90b4abef4a80b8d254fa6a5351f54"

RPROVIDES:${PN} += "libopenblas-openmp-devel \
openblas-devel \
openblas-devel-any \
openblas-devel-default"

RDEPENDS:${PN} += "libopenblas-openmp0 \
openblas-common-devel"

inherit rpm
