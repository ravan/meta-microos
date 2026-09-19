SUMMARY = "Development libraries for OpenBLAS, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "libopenblas_pthreads-devel-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "c475a09945c5b5162519a3bb9c527feadef387028436cb78dbeb4bbc632643fe5ba49338ad234c3eefc109550112d8b4af52b3f1d5e49f4b10820b1f7a1b7454"

RPROVIDES:${PN} += "libopenblas-pthreads-devel \
openblas-devel-any \
openblas-devel-other"

RDEPENDS:${PN} += "libopenblas-pthreads0 \
openblas-common-devel"

inherit rpm
