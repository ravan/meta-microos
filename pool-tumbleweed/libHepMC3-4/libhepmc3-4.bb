SUMMARY = "Main shared library for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the main shared library for HepMC3."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1"

RPM_NAME = "libHepMC3-4-3.3.1-1.8.aarch64.rpm"
RPM_HASH = "4d534b1a95e80f8c33213b78033a071a90d86095268b025d33ad38eadee4d631cf0f850e2693a399a1fc982776b0c223f69b3115f4b69254c4f29cbe18860b7b"

RPROVIDES:${PN} += "HepMC3 \
libHepMC3-4 \
libHepMC3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
