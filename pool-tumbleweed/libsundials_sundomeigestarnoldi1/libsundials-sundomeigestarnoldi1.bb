SUMMARY = "Suite of nonlinear solvers - sundomeigestarnoldi shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Arnoldi \
implementation for SUNDomEigEstimator, which estimates the \
dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestarnoldi1-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "66709aaf725616baa2cefffe645487f3f07537d44edca9155240216f5ac21245831445e0b583711d1ac812cf533379743fc8ec476d7b86d5c53ae67651309ae3"

RPROVIDES:${PN} += "libsundials-sundomeigestarnoldi.so.1 \
libsundials-sundomeigestarnoldi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenblas.so.0 \
libsundials-core.so.7"

inherit rpm
