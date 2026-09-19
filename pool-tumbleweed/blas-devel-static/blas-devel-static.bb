SUMMARY = "Basic Linear Algebra Subprograms: static library"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package. \
 \
This package provides the static library for BLAS."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "blas-devel-static-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "8c2504aaa10c9f789c5415ab89291e54b1dc6949e51cb81cf6856b3605f3ea5d894180ded607805bda47babc087f5f1db787c176fa7f9910f27dd703aa6f8366"

RPROVIDES:${PN} += "blas-devel-static"

RDEPENDS:${PN} += "blas-devel"

inherit rpm
