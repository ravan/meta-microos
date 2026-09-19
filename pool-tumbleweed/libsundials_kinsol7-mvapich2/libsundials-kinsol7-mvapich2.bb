SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_kinsol7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "5cc8ba79b3d83498918df5be9f66d9e0f96da22fe3586b8cea828568d2908e7ecb23c06655ab8c848b6dac1a40e1109a3260780195878597298c4a62024e9c6f"

RPROVIDES:${PN} += "libsundials-kinsol.so.7 \
libsundials-kinsol7-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
