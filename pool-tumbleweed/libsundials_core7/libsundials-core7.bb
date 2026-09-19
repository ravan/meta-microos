SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_core7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "14420b3ffc97f3c5d492988b16895167698ec96a4118d2f458cbab84a163bf1ddbf8bd29999c0e58a6578f7cc932c1de5a6bd272610be0ddb44d48d215a24141"

RPROVIDES:${PN} += "libsundials-core.so.7 \
libsundials-core7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
