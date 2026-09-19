SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_idas6-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "f9cc57c146dc54663c30bee3b5a08c54826b11203d26b5548787a64e3527abc43033eac28c83fca1afb9df047dd4fe43723bcdfdda601312593a6378aa40369e"

RPROVIDES:${PN} += "libsundials-idas.so.6 \
libsundials-idas6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
