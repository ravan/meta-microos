SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_arkode6-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "c6f9034670f5605f42891a149a4dd8f380ac4f36af76a313d0e915b4be26d0bf7daaa8c53b842ea38ff41221609f4fbe25dd4650ee5022ac30a11d65dc1c83dc"

RPROVIDES:${PN} += "libsundials-arkode.so.6 \
libsundials-arkode6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
