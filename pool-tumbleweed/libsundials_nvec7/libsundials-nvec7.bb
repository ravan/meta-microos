SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_nvec7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "59de2d09fdf25bb91b8fb0e7c9d31e5d0a3057c3affc2fddbe86e422d26f4565f43d638c1bc73e1dfd9cfec7115f949931b100c4432cfc4deb0495f9b7f0b193"

RPROVIDES:${PN} += "libsundials-nvec7 \
libsundials-nvecmanyvector.so.7 \
libsundials-nvecpthreads.so.7 \
libsundials-nvecserial.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
