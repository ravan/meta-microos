SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_cvodes7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "46097e58db48a0160b1bdf3d9556f2943beda6aac59ad90c0e0d4a83b353c93e74d155e9b8b8ecef36f97e2972a589a8aa1bcc8284907bc80e66b242ad2800d6"

RPROVIDES:${PN} += "libsundials-cvodes.so.7 \
libsundials-cvodes7-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
