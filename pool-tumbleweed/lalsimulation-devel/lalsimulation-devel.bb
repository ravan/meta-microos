SUMMARY = "Headers and source files for building against LALSimulation"
DESCRIPTION = "This package provides the header and sources for coding against LALSimulation."
LICENSE = "GPL-2.0-only"

PV = "6.2.0"

RPM_NAME = "lalsimulation-devel-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "fd7d04a6ab68c180aa081487b84a34de7bc30c68f678b824fb9fca0fc834aaac4b0478dd8084e720a60d56f2af4b9f3985530dbe6aa752424acc12b2475fda71"

RPROVIDES:${PN} += "config-lalsimulation-devel \
lalsimulation-devel \
pkgconfig-lalsimulation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsimulation.so.37 \
liblalsimulation37 \
liblalsupport.so.14 \
libm.so.6 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-zlib"

inherit rpm
