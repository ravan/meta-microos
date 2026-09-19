SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_idas6-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "ac1797f73edc35f8aae4fbf742ef7df86e0febddf46df0235bbf9203870f4c2b3826f2fbd57f00eb79f14b2c144edd2b93ef94a91dca91e95520372a608ec77d"

RPROVIDES:${PN} += "libsundials-idas.so.6 \
libsundials-idas6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
