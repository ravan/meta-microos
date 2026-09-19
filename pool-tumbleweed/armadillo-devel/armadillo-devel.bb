SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "15.2.4"

RPM_NAME = "armadillo-devel-15.2.4-1.2.aarch64.rpm"
RPM_HASH = "8841ee111ccb245c2c2d0e92fa85e3aafbd506b1f674b6a3ee385d19cde678798d7dc8b2673d8cf53d02708956dde28e259ae6fc71b0d0e7b198ce623be0829c"

RPROVIDES:${PN} += "armadillo-devel \
pkgconfig-armadillo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
arpack-ng-devel \
blas-devel \
lapack-devel \
libarmadillo15 \
libstdc++-devel \
superlu-devel"

inherit rpm
