SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvode7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "e95260f5b07f8642058aa2e4f279e023e78c71f1fe368f7aed4a3f1c9cb419b00dab80546628e9d5db874b76808b37b2e3c84158fe263c00231fe78b98aae5ff"

RPROVIDES:${PN} += "libsundials-cvode.so.7 \
libsundials-cvode7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
