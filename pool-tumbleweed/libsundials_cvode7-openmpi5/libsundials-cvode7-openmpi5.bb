SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvode7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "6efa06a7295eecdb5ac3a82b866d682aaec9798513fc49e4f16c7c996cf2a1c0878e3170e0820936eeb217a33b66a3b46aa36f53dd16f39e47bd5f37ffce9385"

RPROVIDES:${PN} += "libsundials-cvode.so.7 \
libsundials-cvode7-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
