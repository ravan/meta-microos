SUMMARY = "Suite of nonlinear solvers - sundomeigestpower shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Power \
Iteration implementation for SUNDomEigEstimator, which estimates \
the dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestpower1-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "5a7cc6deda2318e9258268ad63a9033e1c64f06bfee76a7d9b314477cbf4ff1f6260a208d6b3955af669af8f7eef78990768106fab7f60b5119476988b32f94e"

RPROVIDES:${PN} += "libsundials-sundomeigestpower.so.1 \
libsundials-sundomeigestpower1-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
