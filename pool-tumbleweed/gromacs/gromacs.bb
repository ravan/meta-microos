SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-2026.1-2.1.aarch64.rpm"
RPM_HASH = "76e068fe6714e12bb19a0ec5c05bff810ea68773a174949792eb9c02161f5b8d33f881eeb8cd072e7854a911976634f0a9a49c394778f154a4bcf9d47b2ab714"

RPROVIDES:${PN} += "gromacs"

RDEPENDS:${PN} += "/usr/bin/perl \
gromacs-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs.so.11 \
libstdc++.so.6"

inherit rpm
