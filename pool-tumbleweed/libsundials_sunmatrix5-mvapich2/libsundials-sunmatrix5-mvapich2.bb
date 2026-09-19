SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunmatrix5-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "ba8e0f1be9fe83720adf2a394b10e94562803b537a48e328acb9bffaf82e87406806b376e0f696ca6fa1cf46d129d91e07b190ae410cd7e04e68dd1febc4f953"

RPROVIDES:${PN} += "libsundials-sunmatrix5-mvapich2 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
