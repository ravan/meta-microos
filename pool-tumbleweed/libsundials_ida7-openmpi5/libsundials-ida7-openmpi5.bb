SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_ida7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "5e592a429ca2d8e3ab04d49b3f7aa61ad65e0c1d0b0f85bc754cfb4cf74a0a562b0a30958723acc43f776fca5117a311df65dd5e07934c583d26cef5fc481cef"

RPROVIDES:${PN} += "libsundials-ida.so.7 \
libsundials-ida7-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
