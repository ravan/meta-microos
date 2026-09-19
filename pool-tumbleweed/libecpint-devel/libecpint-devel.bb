SUMMARY = "Devel package for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
This package contains development headers and libraries for libecpint"
LICENSE = "MIT"

PV = "v1.0.7+git20230218.8e788d4"

RPM_NAME = "libecpint-devel-v1.0.7+git20230218.8e788d4-1.9.aarch64.rpm"
RPM_HASH = "fda32e8a88727e250acf2af30d90a68dddea986ec5704387ff966d726bca2e6a648a71516638bf4693e36244f4c023232c4b890b8ec0cf8e5845a87474fce673"

RPROVIDES:${PN} += "cmake-ecpint \
libecpint-devel"

RDEPENDS:${PN} += "libcerf-devel \
libecpint1"

inherit rpm
