SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_ida7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "7b670742709a043fe2d7c32c04ac9e89397a5962fadb4e7f59b1af3c95588cb3fe9240ec671f654c2da540caa14b63da5de4f747cda65de0c5fce4680f7abcfe"

RPROVIDES:${PN} += "libsundials-ida.so.7 \
libsundials-ida7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
