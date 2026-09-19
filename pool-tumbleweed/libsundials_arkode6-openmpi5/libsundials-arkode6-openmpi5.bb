SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_arkode6-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "88441cf53da9d96e89cfcb25c89b4bad7fde24883eb52b17a95c2b9f450b5804e407298805f6ebd8feb41b4bdbbac0a012cd6e05c3fe292edee10da1140d29ba"

RPROVIDES:${PN} += "libsundials-arkode.so.6 \
libsundials-arkode6-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
