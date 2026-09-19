SUMMARY = "Suite of nonlinear solvers - sundomeigestarnoldi shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Arnoldi \
implementation for SUNDomEigEstimator, which estimates the \
dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestarnoldi1-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "a8d13b6410c81f734902c4af5ba2a7ebb4e28dbfc816dfd7fb3ee4daf492ddfe1629841cae370a68934674d84ef8a26b701c4fa4e34ca8a7e512f1ca12482b44"

RPROVIDES:${PN} += "libsundials-sundomeigestarnoldi.so.1 \
libsundials-sundomeigestarnoldi1-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenblas.so.0 \
libsundials-core.so.7"

inherit rpm
