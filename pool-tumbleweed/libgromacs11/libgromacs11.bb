SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "libgromacs11-2026.1-2.1.aarch64.rpm"
RPM_HASH = "a5d27c1834ee0c4c788125892df19b768befe9c664b117f215e44b60025096b8d7e8248ab0368f9fb8d78b04a614cc7f9d3b290dc96eb50e1c753c91eca7cf97"

RPROVIDES:${PN} += "libgromacs.so.11 \
libgromacs11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmuparser.so.2.3.5 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
