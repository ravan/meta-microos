SUMMARY = "Suite of nonlinear solvers - sundomeigestarnoldi shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Arnoldi \
implementation for SUNDomEigEstimator, which estimates the \
dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestarnoldi1-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "e34a3026debe72dadcebd4b2c0cea2c8e0fe3bb711ca28389a25d4f86e73f473919810418898698a439b9756efadf6589d4332c41371749105f6a6762ead9718"

RPROVIDES:${PN} += "libsundials-sundomeigestarnoldi.so.1 \
libsundials-sundomeigestarnoldi1-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libopenblas.so.0 \
libsundials-core.so.7"

inherit rpm
