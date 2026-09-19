SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_idas6-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "1bc993f5d8cd16094879a37dc7a75e66657bdb046fe1d8f3e4758a83fb15e49534722b039d97ccf4ca5d8569148bbf7593a25fb997e2a48768ef07c259ca953f"

RPROVIDES:${PN} += "libsundials-idas.so.6 \
libsundials-idas6-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
