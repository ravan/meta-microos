SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvodes7-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "56b6f475b1f89014f854296cfa827e3d342f024c80654aba6b8b81d55e28f397632ca1be8ead282537577a4866e7d4a8ac360beb66bbbdb5ff59ad507bdff149"

RPROVIDES:${PN} += "libsundials-cvodes.so.7 \
libsundials-cvodes7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
