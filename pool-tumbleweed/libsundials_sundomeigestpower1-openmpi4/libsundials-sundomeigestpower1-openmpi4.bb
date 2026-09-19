SUMMARY = "Suite of nonlinear solvers - sundomeigestpower shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Power \
Iteration implementation for SUNDomEigEstimator, which estimates \
the dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestpower1-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "40a00d0ff60ccba3e6d3c3a4debd01f95c386f1e59271995fee603a8be85d6b1d8fd640fec99663a798cdde3af08a66cc07584b6e933371c3c9698a189cac50b"

RPROVIDES:${PN} += "libsundials-sundomeigestpower.so.1 \
libsundials-sundomeigestpower1-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
