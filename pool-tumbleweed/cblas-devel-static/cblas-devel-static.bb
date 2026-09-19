SUMMARY = "Native C interface to BLAS: static library"
DESCRIPTION = "This library provides a native C interface to BLAS routines available \
at www.netlib.org/blas to facilitate usage of BLAS functionality \
for C programmers. \
 \
This package contains the CBLAS static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "cblas-devel-static-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "cfa23d381c253471576b12e4c49b3053e564e39c58a474dea2d9f662ee0e2ff06522aadf8e574159e095531b73a87b12e1e50a512554d813c3063a033ae514de"

RPROVIDES:${PN} += "cblas-devel-static"

RDEPENDS:${PN} += "cblas-devel"

inherit rpm
