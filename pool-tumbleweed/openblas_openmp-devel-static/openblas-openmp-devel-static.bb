SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_openmp-devel-static-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "911392f24699c0a9737c70a2582e4be7e46bf780b25351244746a5000f9a7f178e800ab8a49726dadc2371c5d9b874a0fa52e002d757c0c2957c4e5dc0692b34"

RPROVIDES:${PN} += "openblas-openmp-devel-static"

RDEPENDS:${PN} += "libopenblas-openmp-devel"

inherit rpm
