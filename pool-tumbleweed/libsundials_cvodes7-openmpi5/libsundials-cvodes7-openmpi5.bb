SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvodes7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "8e07d47205f7845cda4dfbf67c50fb82b0b9b1b2b8e19bc900f0916af9e36f40ebd5a4bb097d356eeac206c8c18c138b4b62c2c01cc5804fc99841bf3504ce6f"

RPROVIDES:${PN} += "libsundials-cvodes.so.7 \
libsundials-cvodes7-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
