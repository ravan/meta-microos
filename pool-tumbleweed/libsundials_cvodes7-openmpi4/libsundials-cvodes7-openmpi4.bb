SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvodes7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "0a0a31c04c4b490314a5dc8824707017bd5f2609b8852dd7f6bc2ad818c6be30253766927e543ad1581f7ca1fd9a8a81efc9b221654664b57bf3d0dd299238f4"

RPROVIDES:${PN} += "libsundials-cvodes.so.7 \
libsundials-cvodes7-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
