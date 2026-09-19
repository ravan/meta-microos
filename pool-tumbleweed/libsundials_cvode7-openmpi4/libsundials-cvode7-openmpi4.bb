SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvode7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "f072a61cf23fa5bc701ed616956f48aa808d87774cd31f1bd00cee1c930f035acde0367e8ab38fd14f00890a8434f2d63d47444a177aa57b2612eb4dd20e35cb"

RPROVIDES:${PN} += "libsundials-cvode.so.7 \
libsundials-cvode7-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
