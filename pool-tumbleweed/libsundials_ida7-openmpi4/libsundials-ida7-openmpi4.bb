SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_ida7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "16f90b4c735a3d158cbd197e19533d45891745e696362a2bc1a3afc14815b4b852b0fdbd8799390dc9b00369169b083f2848b93695998a197cd17c41af71e02e"

RPROVIDES:${PN} += "libsundials-ida.so.7 \
libsundials-ida7-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
