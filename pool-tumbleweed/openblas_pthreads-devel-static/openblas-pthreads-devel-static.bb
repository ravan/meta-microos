SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas_pthreads-devel-static-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "412762aa88748d3c2f9da781a8f1a522d9f7a689acb0fcd610bfa8ed74a77c685bce64530344181625b16c1e19d0dae814ce749bccc4753448d19033e3461fd0"

RPROVIDES:${PN} += "openblas-pthreads-devel-static"

RDEPENDS:${PN} += "libopenblas-pthreads-devel"

inherit rpm
