SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_arkode6-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "e5013d61a6f416b99a861dcba9021d3206aa46d41f1cd395feb36c421aec32ecb5435ccbee1d72c3629f2f46b77a643da6b1e46da12a723be1bc0a87720109fc"

RPROVIDES:${PN} += "libsundials-arkode.so.6 \
libsundials-arkode6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
