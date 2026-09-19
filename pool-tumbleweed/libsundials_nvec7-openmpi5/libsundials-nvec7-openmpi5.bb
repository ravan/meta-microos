SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_nvec7-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "b9f63d5a3933d9b05f1128aaf1b7ef0ad77cedbaf491a33a1da6f020af67f1eea6c7c0607795b16510aac146c805211a5e2adafbbee8958cf55ff4d8ecf9a5f9"

RPROVIDES:${PN} += "libsundials-nvec7-openmpi5 \
libsundials-nvecmanyvector.so.7 \
libsundials-nvecmpimanyvector.so.7 \
libsundials-nvecmpiplusx.so.7 \
libsundials-nvecparallel.so.7 \
libsundials-nvecpthreads.so.7 \
libsundials-nvecserial.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libsundials-core.so.7"

inherit rpm
