SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_core7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "68d5512c6a224540ffa0e7dcebf6284919b7fc1eb37974087c490d3cfe076db5358ae9fc6f2b43e40e3c33013f5264c2cc0e416a12cf77e516d337931f33c585"

RPROVIDES:${PN} += "libsundials-core.so.7 \
libsundials-core7-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm
