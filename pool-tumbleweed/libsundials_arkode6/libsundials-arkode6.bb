SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_arkode6-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "b3c9c8c5b7664bc6d1fd6aa67457ed5ac0d1cecdb6b3e20b4fdb1785a7268167ff0f8fa822b7cff8478a10b56de9a25fb2c29d55023691ed2d42794d22eb9177"

RPROVIDES:${PN} += "libsundials-arkode.so.6 \
libsundials-arkode6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
