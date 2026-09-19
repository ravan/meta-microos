SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvode7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "e6393b56d306e17d86e8568710e6688fa90a09047039dc411eece66ad96a2f1551fb04ccd802e46bd134f1c08802844a4c60473d6fc744daa6b71da99289cf2a"

RPROVIDES:${PN} += "libsundials-cvode.so.7 \
libsundials-cvode7-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
