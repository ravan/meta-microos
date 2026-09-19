SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_nvec7-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "01c4c506d5566d774e952bff9a25f013cb8ccba187a0117c64bc99b21703240add24813fbbb05656d30406782f9f4c5f411e154786c10a67c4d94d728e70ae87"

RPROVIDES:${PN} += "libsundials-nvec7-openmpi4 \
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
