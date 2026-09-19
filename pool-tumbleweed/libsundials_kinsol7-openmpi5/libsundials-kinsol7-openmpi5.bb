SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_kinsol7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "89e8a010b2f39ffadebfd7fcecbb63e0536f594c07deab0fcffc25724a2e319d91204b760a1be504df756b6d71bcb549f0a5c93bbb8418d933bca5ed359455d5"

RPROVIDES:${PN} += "libsundials-kinsol.so.7 \
libsundials-kinsol7-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
