SUMMARY = "Suite of nonlinear solvers - sundomeigestarnoldi shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Arnoldi \
implementation for SUNDomEigEstimator, which estimates the \
dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestarnoldi1-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "3e02cbdcedda52676b841a2ca7a45e276977506846fb05053d98de0b55bb3629830ea4e43e8badf86ac7a4b3a7a359ade0c9083bea19134587cf015542990843"

RPROVIDES:${PN} += "libsundials-sundomeigestarnoldi.so.1 \
libsundials-sundomeigestarnoldi1-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenblas.so.0 \
libsundials-core.so.7"

inherit rpm
