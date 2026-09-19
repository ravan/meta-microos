SUMMARY = "Suite of nonlinear solvers - sundomeigestpower shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Power \
Iteration implementation for SUNDomEigEstimator, which estimates \
the dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestpower1-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "7ea945c71ffa0cc0686fabae1e296b341067c6947940086ab1ee18ca03d5052dec9722b6c376aeb676191c8af9703a4a5501ac91c395cc2f306676f5e1afe399"

RPROVIDES:${PN} += "libsundials-sundomeigestpower.so.1 \
libsundials-sundomeigestpower1-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
