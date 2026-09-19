SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_core7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "bd8633984621b56397736c81c11e887e53e1a9439457bbb059759e5f80ff1d4dc92695f673ece4333db072ab9aa2719ca34ae6c9cccda2bcc60474b838a8c4c2"

RPROVIDES:${PN} += "libsundials-core.so.7 \
libsundials-core7-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm
