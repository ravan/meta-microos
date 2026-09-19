SUMMARY = "Suite of nonlinear solvers - sundomeigestpower shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' Power \
Iteration implementation for SUNDomEigEstimator, which estimates \
the dominant eigenvalue for a system."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sundomeigestpower1-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "ec4322550363ca25ef1abd13fd38ec6a6142f6da8ba4c03bbb66a24c08d5859b898880b98133af73f3c7066df6df2f335f571dd353631faadb4cb78e35221bef"

RPROVIDES:${PN} += "libsundials-sundomeigestpower.so.1 \
libsundials-sundomeigestpower1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
