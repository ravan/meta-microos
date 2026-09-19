SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_nvec7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "7cfba0b783efa62b1a92dc43c701a718ca90d3ce27176a7194997bafb486a11538ca53bc5704fe50602000d2b56a65d0cca4599d30a97d6f410c75a0fd7e8320"

RPROVIDES:${PN} += "libsundials-nvec7-mvapich2 \
libsundials-nvecmanyvector.so.7 \
libsundials-nvecmpimanyvector.so.7 \
libsundials-nvecmpiplusx.so.7 \
libsundials-nvecparallel.so.7 \
libsundials-nvecpthreads.so.7 \
libsundials-nvecserial.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
