SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_core7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "5b78d558f7841f795fc82778270ec0c70e384165f59e857fd9afd860f3a7f223c73a1dc00b7c3a47d4c0d7fab9ee71bea53152c52043fbc118db33e50704505a"

RPROVIDES:${PN} += "libsundials-core.so.7 \
libsundials-core7-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12"

inherit rpm
