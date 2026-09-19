SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_kinsol7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "d75a6a00ffadc2dd86663c8c00645cc5a3eb33d192b18640256080f786f084c5db427bd7df401ecb516e88338ab46861e788b8cde1de9489139063910665c6ce"

RPROVIDES:${PN} += "libsundials-kinsol.so.7 \
libsundials-kinsol7-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
