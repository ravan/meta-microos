SUMMARY = "Basic Linear Algebra Subprograms: headers and sources for development"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "blas-devel-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "1d774d27755a0105bb44bd30b2660d759a93516e7459ad38d9d28919fd2b7f5d529baa687ce175b773fd67ddb3fd61bdf571cacb88878643030da4bfc3b9a991"

RPROVIDES:${PN} += "blas \
blas-devel \
pkgconfig-blas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblas3"

inherit rpm
