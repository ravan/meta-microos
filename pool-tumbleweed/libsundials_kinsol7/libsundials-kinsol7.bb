SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_kinsol7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "69f7052decd44c3e51a6a3ed65f913840b39cea40f0ba68b2c29272483c2e94b0554d4b44f163b94fa9b4cf19711a0e0b4ca04d0654a15e38252c3ac1b3c94b9"

RPROVIDES:${PN} += "libsundials-kinsol.so.7 \
libsundials-kinsol7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
