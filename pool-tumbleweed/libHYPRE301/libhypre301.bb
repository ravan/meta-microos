SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains serial shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "libHYPRE301-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "800d32f4a77e8a07764e6ab9c506357b29f1ddb9c5d4d2d3bc3d8622da3ba530db24cedd913918b9659cef2f45f74c0c8d66d07f5f239a6c35f4792f1572de35"

RPROVIDES:${PN} += "libHYPRE.so.301 \
libHYPRE301"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6"

inherit rpm
